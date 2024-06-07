package objectwithmethod;

public class Test {

	public static void main(String[] args) {

		Test t = new Test();
		
		Product pd = t.getProductData();
		t.printProduct(pd);
	}

	// ----------- object as a parameter -------------
	void printProduct(Product p) {

		System.out.println("Id = " + p.getId());
		System.out.println("Name = " + p.getName());
		System.out.println("Price = " + p.getPrice());
		System.out.println("Company = " + p.getCompany());
	}

	// ------------- object as return type ------------------
	Product getProductData() {

		Product p = new Product();

		p.setId(343);
		p.setName("TV");
		p.setCompany("CG");
		p.setPrice(90000);

		return p;

	}

	//---------- array of object as a parameter ----------------
	
	//----------- array of object as a return type -------------
	
}
