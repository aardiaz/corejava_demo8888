package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.setColor("Blue");
		c.setPrice(9000000);
		c.setCompany("Tesla");
		
		Employee   emp = new Employee();
		
		emp.setId(343);
		emp.setName("Hari KC");
		emp.setSalary(500000);
		emp.setCar(c);
		
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Salary = "+emp.getSalary());
		
		System.out.println("-------car info -------");
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Company = "+emp.getCar().getCompany());
		System.out.println("Price = "+emp.getCar().getPrice());
	}

}
