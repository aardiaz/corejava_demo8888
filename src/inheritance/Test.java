package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		
		p.name = "Birendra Karki";
		p.age = 33;
		p.company = "Google";
		p.salary = 800000;
		p.bonus = 200000;
		p.progLang = "Java";
		p.project = "G-Earth";
		
		p.print();
	}

}
