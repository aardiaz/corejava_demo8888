package methodoverriding88;

public class RadhaBank extends CentralBank {

	@Override
	void getBankName() {
		System.out.println("Radha Bank");
	}

	@Override
	void getInterestRate() {
		System.out.println("15%");
	}
}
