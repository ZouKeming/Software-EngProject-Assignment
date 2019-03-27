package Test;

public enum EnumTest {
	SPRING("����" , 2 ,4),
	SUMMER("����" , 5 , 7),
	FALL("����" , 8 , 10),
	WINTER("����" , 11 , 1);
	
	public final String name;
	public final int startMonth;
	public final int endMonth;
	
	private EnumTest(String n , int s , int e) {
		name = n;
		startMonth = s;
		endMonth = e;
	}
	
}
