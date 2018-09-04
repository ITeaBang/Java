package method;

public class Main {

	public static void main(String[] args) {

		// // Hello.java를 3번 출력, 연속된 경우는 유지,보수를 위해서 반복문을 사용
		// // System.out.println("Hello,java");
		// // System.out.println("Hello,java");
		// // System.out.println("Hello,java");
		//
		// for (int i = 0; i < 3; i = i + 1) {
		// System.out.println("Hello,java");

		// }
		//
		// // Hello C++를 1번 출력
		// System.out.println("Hello C++");
		//
		// // Hello.java를 3번 출력
		// for (int i = 0; i < 3; i = i + 1) {
		// System.out.println("Hello,java");
		// }

		// Task 클래스의 인스턴스 생성
		Task ins = new Task();
		// 메소드 호출
		ins.javaDisplay();

		System.out.println("Hello C++");

		// 메소드 호출
		ins.javaDisplay();

		// new Task().tot();
		int result = new Task().tot(99);
		System.out.println("합계 = " + result);

		boolean r = new Task().login("root", "1234");
		//ins.login("xxx", "yyy);
		
		if (r == true) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("없는 아이디이거나 비밀번호가 틀렸습니다");
		}
	}
}
