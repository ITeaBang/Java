package mutex;

import java.util.ArrayList;

public class ShareData {

	// 공유 자원을 가진 클래스, static은 어떤 일이 있어도 1만 생성 가능, ShareData.List
	public static ArrayList<Character> List = new ArrayList<>();;

	public synchronized void save(char ch) {
		if (List.size() == 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		List.add(ch);
		System.out.println(ch + "를 저장했습니다.");
		// wait 중인 스레드 깨우기
		notifyAll();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	// 리스트에서 하나를 꺼내서 출력하는 메소드
	public synchronized void get() {
		if (List.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		char ch = List.remove(0);
		System.out.println(ch + "를 소비했습니다.");
		notifyAll();
	}
}
