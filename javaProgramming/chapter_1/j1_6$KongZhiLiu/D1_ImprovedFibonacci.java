package j1_6$KongZhiLiu;

public class D1_ImprovedFibonacci {

	static final int MAX_INDEX = 9;
	
	public static void main(String[] args) {
		int ho = 1;
		int hi = 1;
		String mark;
		
		System.out.println("1: " + ho);
		for(int i = 2; i <= MAX_INDEX; i++) {
			if(hi % 2 == 0) {
				mark = "*";
			} else {
				mark = "";
			}
			
			System.out.println(i + ": " + hi + mark);
			hi = hi + ho;
			ho = hi - ho;
		}
	}
	
}
