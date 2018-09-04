package thread;

public class BankMain {

	public static void main(String[] args) {

		Bank bank = new Bank();
		ThreadEx2 atm = new ThreadEx2(bank, "ATM");
		atm.start();
		
		ThreadEx2 internet = new ThreadEx2(bank, "internet");
		internet.start();

	}

}
