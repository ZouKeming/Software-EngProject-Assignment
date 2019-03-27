import java.awt.Color;

import javax.swing.JFrame;

public class Window {
	public final static int SCREEN_WIDE=1000;
	public final static int SCREEN_HEIGHT=1000;
	
	public static void main(String[] args) {
		JFrame window = new JFrame ( ) ;
		Picture pic = new Picture();
		window.setBackground(Color.blue);
		window.setSize(SCREEN_WIDE,SCREEN_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(pic);
		window.setVisible(true);
		SelectionListener cl = new SelectionListener(pic);
		window.addMouseListener(cl);
	}
	
	
	
}
