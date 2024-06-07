package methodoverriding88;

public class Test {
	
	public static void main(String[] args) {
		
		//static or early binding of object
		PrabhuBank  pb = new PrabhuBank();
		
		pb.getBankName();
		pb.getInterestRate();
		
		//up-casting
		CentralBank  bank = new PrabhuBank();
		
	}
	
	//late or dynamic binding of object
	// run time polymorphism
	void printBankInfo(CentralBank b) {
		
		b.getBankName();
		b.getInterestRate();
	}
	

}
