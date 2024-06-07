package looping;

public class EnhanceForTest {
	
	/*
	 *  ----------- forEach loop --------------------------------
	 *  # use to read data from collection(array,list,set,map etc).
	 *  
	 *  # syntax :
	 *  
	 *     for(data_type   var :  collection){
	 *     
	 *         //statements
	 *     }
	 */
	
	  public static void main(String[] args) {
		
		  int[]  values =  {7,86,5,43,24,5,67,86,75,54,3,24,56,76,54};
		  
		  int s = 0;
		  
		  for(int x : values) {
			  System.out.println(x);
			  s = s + x;
		  }
		  System.out.println("Sum = "+s);
		  
	}

}
