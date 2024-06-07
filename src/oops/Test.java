package oops;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		//Math book
		Book  b = new Book();
		
		System.out.println("Enter name ");
		b.name = sc.next();
		
		System.out.println("Enter author ");
		b.author = sc.next();
		
		b.price = 5000;
		b.pages = 2500;
		
		b.printBookInfo();
		
		/*
		 * a> Car
		 * b> Student
		 * c> Rectangle
		 * d> Dog
		 * e> Mobile
		 */

		
		
	}

}
