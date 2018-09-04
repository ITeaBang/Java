//Hello World를 100만번 출력하는데 걸리는 시간을 측정해서 출력
//자신의 자바 버전을 출력
//path 환경 변수의 값을 출력

package lang;

public class Practice3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i = i + 1) {
			System.out.println("Hello,World");
		}
		long end = System.currentTimeMillis();
		System.out.println("작업시간 : " + (end - start));
		
		System.out.println(System.getenv("path"));
		System.out.println(System.getProperty("java.version"));
	}
}
