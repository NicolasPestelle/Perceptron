import java.util.ArrayList;

public class Neurone {
	
	private Points p ;
	
	private final Double PASAPPRENTISSAGE = 0.1;

	private double biais ;
	private int sortie;
	
	private ArrayList<Double> poids = new ArrayList<Double>();
	
	public Neurone(Points p) {
		this.biais=0.5;
		this.sortie = 0;
		
		this.p=p;
		
		for(int i =0; i <p.getSize();i++) {
			poids.add(Math.random());
			
		}
	}
	
	public int calculeNeurone(Point pt){
		double valeur = 0;
		valeur += poids.get(0)*pt.x1;
		valeur += poids.get(1)*pt.x2;
		valeur -= this.biais;
		
		if(valeur >0){
			return 1;
		}else{
			return -1;
		}

	}
	
	public void updateNeurone(Point pt){
		this.biais = biais +  this.PASAPPRENTISSAGE * (pt.etiquette-sortie)*-0.5;
		poids.set(0, this.poids.get(0)+this.PASAPPRENTISSAGE*(pt.etiquette-sortie)*pt.x1);
		poids.set(1, this.poids.get(1)+this.PASAPPRENTISSAGE*(pt.etiquette-sortie)*pt.x2);
	}
	
	public void display() {
		System.out.println("biais "+biais+" sortie : "+sortie+" poids : ");
		for(int i =0; i <poids.size();i++) {
			System.out.println(poids.get(i));
		}
	}
}
