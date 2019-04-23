import java.awt.Graphics;

import javax.swing.JComponent;

public class Picture extends JComponent{
	ChessPieces black;
	ChessPieces white;
	
	public ChessPieces getBlack() {
		return black;
	}
	
	public ChessPieces getWhite() {
		return white;
	}
	
	protected void paintComponent(Graphics g) {
		ChessBoard chessboard = new ChessBoard();
		chessboard.draw(g);

	}
}
