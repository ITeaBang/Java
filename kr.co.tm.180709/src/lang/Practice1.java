package lang;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		int x = -1;

		Scanner sc = new Scanner(System.in);

		// 정수를 입력할 때까지 무한 반복
		while (true) {
			System.out.printf("정수 입력 : ");
			
			// String으로 입력을 받고 Int형으로 변환
			String temp = sc.nextLine();
			
			try {
				x = Integer.parseInt(temp);
				break;
			} 
			catch (Exception e) {
				System.out.println("정수를 입력하세요.");
			}
		}
		System.out.println(x);
		sc.close();
	}
}
