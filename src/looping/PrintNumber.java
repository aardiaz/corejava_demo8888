package looping;

public class PrintNumber {
	
	public static void main(String[] args) {
		
		int s = 0;
		
		for(int i=1; i<=100; i++) {
			
			System.out.println(i);
			s = s + i;
		}
		
		System.out.println("Total = "+s);
		
	}

}
