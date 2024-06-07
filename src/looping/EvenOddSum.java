package looping;

public class EvenOddSum {
	
	public static void main(String[] args) {
		
		int es = 0;
		int os = 0;
		
		for(int i=1; i<=100; i++) {
			
			if(i%2 == 0) {
				es = es + i;
			}else {
				os = os + i;
			}
		}
		
		System.out.println("Sum of Evens = "+es);
		System.out.println("Sum of Odds = "+os);
		System.out.println("---------------");
		System.out.println("Total sum = "+(es+os));
	}

}
