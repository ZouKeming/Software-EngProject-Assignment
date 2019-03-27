import java.awt.Point;

public class Chess {
	int x ;
	int y;
	boolean selected = false;
	public Chess(int x1 , int y1) {
		x = x1;
		y = y1;
	}
	
	public void select() {
		selected = true;
	}
	
	public void move(int x1 , int y1) {
		x = x1;
		y = y1;
//		eat();
		selected = false;
	}
	
	public void eat() {
		
	}
}
