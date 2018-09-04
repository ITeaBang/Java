/*
package lang;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// 만원 단위 금액을 입력받아서 5만원권과 1만원권을 몇 장 지급해야 하는지
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 입력 : ");
		int money = sc.nextInt();
		int i = money / 50000;
		int j = money % 50000 / 10000;
		System.out.printf("5만원권 :%d장, 1만원권 :%d장\n", i, j);
	}
}
*/
/*
package lang;


public class Practice5 {

	public static void main(String[] args) {
	    // 3-2-1-2-3 출력 (별, 숫자)
		int cnt = 1;
		for (int i = 1; i <= 5; i = i + 1) {
			if (i <= 3) {
				for (int j = 1; j <= 4 - i; j = j + 1) {
					System.out.printf("%3d", cnt);
					cnt = cnt + 1;
				}
			} else {
				for (int j = 1; j <= i - 2; j = j + 1) {
					System.out.printf("%3d", cnt);
					cnt = cnt + 1;
				}

			}
			System.out.println("");
		}

	}
}
*/