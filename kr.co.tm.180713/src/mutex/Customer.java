package mutex;

public class Customer extends Thread {
	private ShareData shareData;

	// 생성자
	public Customer(ShareData shareData) {
		this.shareData = shareData;
	}

	// 스레드로 수행할 내용을 가지는 메소드, run에서만 동작
	public void run() {
		for (int i = 0; i < 26; i = i + 1)
			shareData.get();
	}

}
