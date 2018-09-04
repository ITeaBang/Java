package thread;

public class Account {

	private int balance;

	public synchronized void save() {
		System.out.println("입금 전 잔액 : " + balance);
		balance = balance + 1000;
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("입금 후 잔액 : " + balance);
	}

	public synchronized void depo() {
		if (balance < 1000) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("출금 전 잔액 : " + balance);
		balance = balance - 1000;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("출금 후 잔액 : " + balance);
	}

}
