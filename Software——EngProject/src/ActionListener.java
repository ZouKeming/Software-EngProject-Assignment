import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;

public class ActionListener implements MouseListener {
	Picture pic;
	ChessPieces black;
	ChessPieces white;
	
	
	public ActionListener(Picture p , ChessPieces b , ChessPieces w) {
		pic = p;
		black = b;
		white = w;
	}

	@Override
	public void mouseClicked(MouseEvent mE) {
		// TODO Auto-generated method stub
		if(!SelectionListener.takeUp) {
			return;
		}
		
		
		Iterator<Chess> iterator;
		Chess current = null;
		boolean found = false;
		
		if(SelectionListener.checkInTurn == black) {
			iterator = black.getIterator();
			while(iterator.hasNext() && !found) {
				current = iterator.next();
				if(current.selected) {
					found = true;
				}
			}
		}else if(SelectionListener.checkInTurn == white){
			iterator = white.getIterator();
			while(iterator.hasNext() && !found) {
				current = iterator.next();
				if(current.selected) {
					found = true;
				}
			}
		}
		
		
		
		
		if(SelectionListener.checkInTurn == black) {
			SelectionListener.checkInTurn = white;
		}else if(SelectionListener.checkInTurn == white){
			SelectionListener.checkInTurn = black;
		}
		current.move(mE.getX() , mE.getY() , black , white);
		SelectionListener.takeUp = false;
		pic.repaint();
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
