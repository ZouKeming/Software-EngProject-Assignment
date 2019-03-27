import java.awt.Graphics;

import javax.swing.JComponent;

public class Picture extends JComponent{
	Army black;
	Army white;
	
	public Army getBlack() {
		return black;
	}
	
	public Army getWhite() {
		return white;
	}
	
	protected void paintComponent(Graphics g) {
		ChessBoard chessboard = new ChessBoard();
		chessboard.draw(g);

	}
}
