import java.util.Iterator;
import java.util.LinkedList;

public abstract class Chess {
	int x ;
	int y;
	boolean selected = false;
	Constant side;

	public Chess(int x1 , int y1) {
		x = x1;
		y = y1;
	}
	
	public void select() {
		selected = true;
	}
	
	public abstract void move(int x1 , int y1 , ChessPieces black , ChessPieces white) ;
	//move�Ժ�һ��Ҫ��selected���false
//	 ������˲��ܲ����ߵĵط����Ӳ���
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void inputSide(Constant s) {
		side = s;
	}
	
	public Constant side() {
		return side;
	}
	
	public boolean eat(Chess chess , ChessPieces cp) {
//		����������������û�к�destination��ͬ����ģ��еĻ����Ǹ����Ӵ�����
		if(side == chess.side()) {
			return false;
		}else {
			cp.chessPieces.remove(chess);
			return true;
		}
		
	}
	
	
}
