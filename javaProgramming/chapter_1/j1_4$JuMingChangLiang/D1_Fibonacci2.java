package j1_4$JuMingChangLiang;

public class D1_Fibonacci2 {

	static final int MAX = 50;
	
	public static void main(String[] args) {
		int ho = 1;
		int hi = 1;
		
		System.out.println(ho);
		while(hi < MAX) {
			System.out.println(hi);
			hi = hi + ho;
			ho = hi - ho;
		}
		
	}
	
}
