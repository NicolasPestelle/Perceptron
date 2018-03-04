import java.util.ArrayList;

public class Points {

	ArrayList<Point> points = new ArrayList<Point>();
	
	public Points(int nbPoint) {
		for(int i =0; i < nbPoint;i++) {
			points.add(new Point());
		}
	}
	
	public void display() {
		for(int i =0; i <points.size();i++) {
			points.get(i).display();
		}
	}
	
	public int getSize() {
		return this.points.size();
	}
}
