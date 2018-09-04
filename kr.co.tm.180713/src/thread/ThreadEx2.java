package thread;

import java.util.Random;

public class ThreadEx2 extends Thread {
	// 스레드로 수행할 내용을 작성하는 메소드
	public void run() {
		// 빨강, 파랑, 노랑을 랜덤으로 1초마다 출력하기
		String[] color = { "빨강", "파랑", "노랑" };
		// 랜덤을 만들어주는 클래스의 인스턴스 만들기
		Random r = new Random();
		// 무한 반복
		while (true) {
			// color 배열의 데이터를 랜덤으로 출력하는 출력문 [r.nextInt(정수를 주세요.(범위)]
			System.out.println(color[r.nextInt(color.length)]);
			// 1초씩 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}