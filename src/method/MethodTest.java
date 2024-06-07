package method;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {

		// add();
		//printTable(665);
		
		 // int area = getArea(200,500);
		 //  volume(area,90);
		
		int  s = getSumOf1to100();
		System.out.println("Total sum = "+s);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value a ");
		int a = sc.nextInt();
		
		System.out.println("Enter value b ");
		int b = sc.nextInt();
		
		int sv = findSmallest(a, b);
		System.out.println("Smallest Value = "+sv);
				
	}

	// 1. no return type with no arguments
	static void add() {

		int x = 343;
		int y = 599;

		int s = x + y;
		System.out.println("Sum  = " + s);
	}

	// WAP to print area using method.

	// 2. no return type with arguments
	static void printTable(int n) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

//3. return type with no arguments
	static int getSumOf1to100() {

		int s = 0;

		for (int i = 1; i <= 100; i++) {

			s = s + i;
		}

		return s;
	}

	//4. return type with arguments
	static int  findSmallest(int a, int b) {
		
		  if(a<b)
			  return a;
		  else
			  return b;
	}
		
	
	/*
	   *  Q> Find area and volume as :
	   *    a> getArea :
	   *       ->  pass l and b as parameters
	   *       ->  calculate area
	   *       ->  return area
	   *       ->  call this method in main
	   *       
	   *   b> volume :
	   *      -> pass area and h as param
	   *      -> calculate volume
	   *      -> print area
	   *      -> print volume
	   *      -> call this method in main    
	   *      
	   *      
	   *   Q>  SI and Amount using following methods:
	   *      a> input
	   *      b> processing
	   *      c> output   
	   */
	
}








