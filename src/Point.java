
public class Point {
	
	Double x1;
	Double x2;
	int etiquette;
	
	public Point () {
		x1 = Math.random();
		x2 = Math.random();
		
		if(x1+x2-1>0) {
			this.etiquette = 1;
		}else {
			this.etiquette =-1;
		}
	}
	
	public void display() {
		System.out.println(""+this.x1+" "+this.x2+" "+this.etiquette);
	}

}
