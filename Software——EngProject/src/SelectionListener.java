import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

public class SelectionListener implements MouseListener {
	Picture pic;
	ChessPieces black;
	ChessPieces white;
	public static ChessPieces checkInTurn;
	public static boolean takeUp;
	
	public SelectionListener(Picture p , ChessPieces b , ChessPieces w) {
		pic = p;
		black = b;
		white = w;
		takeUp = false;
		checkInTurn = white;
	}

	@Override
	public void mouseClicked(MouseEvent mE) {
		// TODO Auto-generated method stub
		if(takeUp == true) {
			return;
		}
		Iterator<Chess> iterator;
		Chess current = null;
		boolean found = false;
		
		if(checkInTurn == black) {
			iterator = black.getIterator();
			while(iterator.hasNext() && !found) {
				current = iterator.next();
				if(current.getX() == mE.getX()) {
					if(current.getY() == mE.getY()) {
						found = true;
					}
				}
			}
		}else if(checkInTurn == white) {
			iterator = white.getIterator();
			while(iterator.hasNext() && !found) {
				current = iterator.next();
				if(current.getX() == mE.getX()) {
					if(current.getY() == mE.getY()) {
						found = true;
					}
				}
			}
		}
		
		
		if(current != null) {
			current.select();
			takeUp = true;
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
