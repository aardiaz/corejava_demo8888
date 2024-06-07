package constructor;

public class User {
	
	//instance variable
	String userName;
	String password;
	
	//------------default constructor -------------------
	User(){
		userName = "root";
		password = "123";
	}
	
	//------------- parameterized constructor ------------
	
	User(String userName, String password){
		
		//this();   //default constructor
		//this(3434,3434,); //parameterized constructor
		
		this.userName = userName;
		this.password = password;
		
		//this.printUser();
		
		/*
		 *  -> 'this' keyword represents current object.
		 *  -> we can call following using 'this' :
		 *    a> instance variables
		 *    b> instance methods
		 *    c> constructors 
		 */
	}
	
  User(String userName){
		
		this.userName = userName;
	}
	
	void printUser() {
		System.out.println("UserName = "+userName);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		
	  User  u = new User("ram", "89898");
		u.printUser();
		
//		new User().printUser();
//		new User("nepal").printUser();
		
	}

}
