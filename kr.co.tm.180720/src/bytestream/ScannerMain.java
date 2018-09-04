package bytestream;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {

		// 키보드로부터 입력받는 Scanner 인스턴스 만들기
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 :");
		int x = sc.nextInt(); // 마지막 ENTER 입력, String -> Integer.parseInt();
		System.out.println(x);

		System.out.print("이름 :");
		String y = sc.nextLine(); // ENTER까지 입력 -> 입력을 받은 걸로 인식 , String으로 입력을 받는 것이 유리
		System.out.println(y);

		/*
		 * BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		 * String y = r.readLine(); //한 줄 읽기
		 */

		sc.close();

	}

}
