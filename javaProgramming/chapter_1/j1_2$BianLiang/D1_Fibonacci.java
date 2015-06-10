package j1_2$BianLiang;

public class D1_Fibonacci {

	public static void main(String[] args) {
		int ho = 1;
		int hi = 1;
		// int jo = 1, hi = 1;
		
		System.out.println(ho);
		while(hi < 50) {
			System.out.println(hi);
			hi = hi + ho;
			ho = hi - ho;
			
		}
	}
	
}
