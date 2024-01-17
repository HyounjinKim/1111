package ex11;

public class BankAcount {

	int ehs = 0;
	
	public void dlqrma(int djfak) {
		ehs += djfak;
	}
	
	public void cnfrma(int djfak) {
		ehs -= djfak;
	}
	
	public void ghkrdls() {
		System.out.println(ehs);
	}
	
}
