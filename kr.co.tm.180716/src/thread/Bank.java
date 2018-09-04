package thread;

public class Bank {

	private int balance = 1000;

	public void job(String msg) {
		synchronized (this) {
			System.out.println(msg + "현재 잔액 :" + balance);
			balance = balance - 100;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg + "작업 후 현재 잔액" + balance);
		}
	}
}
