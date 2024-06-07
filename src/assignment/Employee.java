package assignment;

public class Employee {
	
	  int salary;
	  int workHr;
	
	void getInfo(int salary, int workHr) {
		this.salary = salary;
		this.workHr = workHr;
	}
	
	void addSal() {
		
		  if(salary < 500) {
			  salary += 10;
		  }
	}
	
	void addWork() {
		if(workHr > 6) {
			salary += 5;
		}
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.getInfo(400, 5);
		emp.addSal();
		emp.addWork();
		
		System.out.println("Total salary = "+emp.salary);
	}

}
