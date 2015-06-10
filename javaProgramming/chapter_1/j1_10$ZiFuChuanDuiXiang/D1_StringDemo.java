package j1_10$ZiFuChuanDuiXiang;

public class D1_StringDemo {

	public static void main(String[] args) {
		String myName = "J";
		
		//myName = myName + " 加油";
		myName += " 加油";
		
		System.out.println(myName);
		
		D1_StringDemo.printf(Math.PI);
	}
	
	public static void printf(double pi) {
		System.out.printf("ABC %.3f%n", pi);
	}
	
}
