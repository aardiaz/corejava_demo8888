package encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Customer  c = new Customer();
		
		 c.setName("Raju KC");
		 c.setAge(30);
		 c.setCity("KTM");
		 c.setPhone("98456785467");
		 
		 System.out.println(c);
		
//		System.out.println("Name = "+c.getName());
//		System.out.println("Age = "+c.getAge());
//		System.out.println("Phone = "+c.getPhone());
//		System.out.println("City = "+c.getCity());
		
	}

}
