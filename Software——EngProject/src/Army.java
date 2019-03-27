import java.util.Iterator;
import java.util.LinkedList;

public class Army {
	public LinkedList<Chess> army;
	
//	public Army() {
//		army = new LinkedList<Chess>();
//		
//		army.add(new King());
//		
//		army.add(q);
//		
//		army.add(r);
//		army.add(r);
//		
//		army.add(b);
//		army.add(b);
//		
//		army.add(kg);
//		army.add(kg);
//		
//		int i=0;
//		while(i<8) {
//			army.add(p);
//			i++;
//		}
//		
//	}
	
	public  synchronized Iterator<Chess> getIterator() {
		return army.iterator();
	}
	
}
