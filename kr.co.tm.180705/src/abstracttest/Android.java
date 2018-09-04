package abstracttest;

public class Android extends SmartPhone {

	public void call() {
		System.out.println("안드로이드에서 전화걸기");

		double x = 10.7;
		// 실수를 정수로 강제 형 변환 : 소수가 버려집니다.
		System.out.println("x:" + (int) x);

		double y = 10.75;
		// 소수 첫재짜리 반올림해서 출력하기
		System.out.println("x:" + (int) (y + 0.5));

		// 소수 두째짜리 반올림해서 출력하기
		System.out.println("x:" + (int) (y * 10 + 0.5) / 10.0);

	}
}
