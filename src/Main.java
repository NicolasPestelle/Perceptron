
public class Main {

	public static void main(String[] args) {
		Points data = new Points(100);
		data.display();
		
		System.out.println("---------------------");
		
		Points test = new Points(100);
		test.display();
		
		
		
		Neurone n = new Neurone(data);
		n.display();
		
		int nbErreur = 0;
		for(int i = 0; i<100;i++){
			
			for(int j = 0; j < data.getSize();j++){
				
				int sortie = n.calculeNeurone(data.points.get(j));
				
				if(sortie != data.points.get(j).etiquette){
					nbErreur ++;
					n.updateNeurone(data.points.get(j));
				}
				
			}
			
			System.out.println("nombre d'erreur : "+i+" "+ + nbErreur);
			nbErreur = 0;
		}
		
		System.out.println("phase de test : ");
		System.out.println("---------------------------------------------");
		
		int nbErreur2 = 0;
			
			for(int j = 0; j < test.getSize();j++){
								
				int sortie = n.calculeNeurone(test.points.get(j));
				
				if(sortie != test.points.get(j).etiquette){
					nbErreur2 ++;
				}
				
				if (nbErreur2 >0){
					System.out.println("nombre d'erreur : "+j+" "+  nbErreur2);
				}
				nbErreur2 = 0;
			
			}
		
	}

}
