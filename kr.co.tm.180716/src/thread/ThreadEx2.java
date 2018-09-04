package thread;

public class ThreadEx2 extends Thread {
	private Bank bank;
	private String name;

	public ThreadEx2(Bank bank, String name) {
		this.bank = bank;
		this.name = name;
	}

	public void run() {

		for (int i = 0; i < 3; i = i + 1) {
			bank.job(name);
		}
	}

}
