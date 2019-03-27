import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ActionListener implements MouseListener {
	Picture pic;
	Army black;
	Army white;
	
	
	public ActionListener(Picture p , Army b , Army w) {
		pic = p;
		black = b;
		white = w;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
