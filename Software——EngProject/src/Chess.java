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
	//move以后一定要把selected变成false
//	 如果点了不能不能走的地方棋子不动
	
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
//		在所有棋子里找有没有和destination相同坐标的，有的话把那个棋子传进来
		if(side == chess.side()) {
			return false;
		}else {
			cp.chessPieces.remove(chess);
			return true;
		}
		
	}
	
	
}
