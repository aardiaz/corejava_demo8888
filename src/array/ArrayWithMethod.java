package array;

import java.util.Arrays;

public class ArrayWithMethod {
	/*
	 * -------------- Array With Method ---------------
	 *  
	 *  a> array as a parameter :
	 *     
	 *      void  add(int a[]){
	 *         
	 *      }
	 *     
	 *  b> array as return type :
	 *  
	 *      int[]  getIntValue(){
	 *      
	 *        int data[] = {6000,4565,67,76,7676,76,767,67,67,67,6,767,6};
	 *      
	 *        return data;
	 *      }
	 */
	
	public static void main(String[] args) {
		
		int data[] = {3,4,55,66,75,43,21,32,45,5,64,3,25,4};
		sum(data);
		
		int[] vals =getValues();
		System.out.println(Arrays.toString(vals));
		
		 int[]  oddnums= getOddnums();
		 System.out.println(Arrays.toString(oddnums));
		
	}
	
	//-------------- array as a parameter -------------------
	 static void sum(int values[]) {
		  
		  int s = 0;
		   
		  for(int x : values) {
			  s = s + x;
		  }
		  System.out.println("Sum = "+s);
	  }

   //WAP to pass and print array of 5 cities using method.
	
   //------------- array as return type ----------------------
	 static int[]  getValues() {
		 
		 int data[]= {34,56,78,98,765,432,900,4,5,6,78};
		 
		 return data;
	 }
	 
	 
	static int[]  getOddnums() {
		 
		   int[] oddnums = new int[50];
		   
		   int j = 0;
		 
		  for(int i=1; i<=100; i++) {
			  if(i%2 != 0) {
				  
				  oddnums[j] = i;
				  j++;
			  }
		  }
		  
		  return oddnums;
	 }
	 
}





