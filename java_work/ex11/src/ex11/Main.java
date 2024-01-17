package ex11;

public class Main {
	public static void main(String[] args) {
		BankAcount dbs = new BankAcount();
		BankAcount qkr = new BankAcount();
		
		dbs.dlqrma(10000);
		qkr.dlqrma(20000);
		
		dbs.cnfrma(2000);
		qkr.cnfrma(3000);
		
		dbs.ghkrdls();
		qkr.ghkrdls();
	}
}
