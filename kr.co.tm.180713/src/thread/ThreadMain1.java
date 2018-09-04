package thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		// 앞에서 생성한 클래스의 인스턴스를 만들고 run 메소드를 호출
		/*
		 * ThreadEx1 tex1 = new ThreadEx1(); tex1.run(); ThreadEx1 tex2 = new
		 * ThreadEx1(); tex2.run();
		 */

		// 스레드를 생성
		ThreadEx2 tex1 = new ThreadEx2();
		// 스레드로 실행 (1 작업 후 2 작업 - 처리속도가 빨라서 동시 수행처럼 보인다.)
		tex1.start();
		// 실행 순서는 가벼운 것부터 실행 될 가능성이 높다.
		System.out.println("정말 스레드?");
		
	
	}

}
