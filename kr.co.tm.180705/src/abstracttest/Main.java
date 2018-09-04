package abstracttest;

public class Main {

	public static void main(String[] args) {
		SmartPhone smartPhone = new Iphone();
		smartPhone.call();

		smartPhone = new Android();
		smartPhone.call();

		smartPhone = new WinPhone();
		smartPhone.call();

		// 사용이 아닌 상속 관계를 위한 클래스인데 인스턴스 생성 가능 -> 불가능으로 변경
		// smartPhone = new SmartPhone();

		// final 변수 - 값을 변경할 수 없습니다.
		// 지역변수지만 전역변수처럼 메모리에서 소멸되지 않습니다.
		final int ZERO = 0;
		// ZERO = 1;

		int command = 1;
		final int LBUTTONDOWN = 1;
		final int RBUTTONDOWN = 1;
		if (command == LBUTTONDOWN) {
		} else if (command == RBUTTONDOWN) {
		}
	}
}
