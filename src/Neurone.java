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
	
	public void display() {
		System.out.println("biais "+biais+" sortie : "+sortie+" poids : ");
		for(int i =0; i <poids.size();i++) {
			System.out.println(poids.get(i));
		}
	}
}
