package bytestream;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {

		// Ű����κ��� �Է¹޴� Scanner �ν��Ͻ� �����
		Scanner sc = new Scanner(System.in);

		System.out.print("���� :");
		int x = sc.nextInt(); // ������ ENTER �Է�, String -> Integer.parseInt();
		System.out.println(x);

		System.out.print("�̸� :");
		String y = sc.nextLine(); // ENTER���� �Է� -> �Է��� ���� �ɷ� �ν� , String���� �Է��� �޴� ���� ����
		System.out.println(y);

		/*
		 * BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
		 * String y = r.readLine(); //�� �� �б�
		 */

		sc.close();

	}

}
