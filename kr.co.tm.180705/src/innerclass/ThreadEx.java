package innerclass;

//Thread를 상속받은 클래스
public class ThreadEx extends Thread {
	// 오버라이딩 한 메소드라는 것을 나타내는 이노테이션
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i = i + 1) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		}
	}
}
