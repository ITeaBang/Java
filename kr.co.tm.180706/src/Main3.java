
public class Main3 {

	public static void main(String[] args) {

		// java.lang.Thread 라는 클래스에 sleep 이라는 메소드가 있는데
		// 이 메소드는 매개변수로 대입된 시간만큼 실행을 중지시키는 역할을 합니다.
		// 이 메소드를 이용해서 1부터 10까지를 1초씩 쉬면서 출력

		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
