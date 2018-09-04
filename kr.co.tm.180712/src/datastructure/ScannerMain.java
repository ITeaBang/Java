package datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		// 키보드로부터 한 줄을 입력받아서 출력
		Scanner sc = new Scanner(System.in);
		// 한 줄을 입력받는 객체
		System.out.println("이름 입력 : ");
		String msg = sc.nextLine();

		// 공백 단위로 구분해서 입력받기
		// String msg = sc.next();
		System.out.println(msg);
		// 스캐너를 사용하면 마지막에 닫아주어야 합니다.
		sc.close();

		// 문자열로부터 받기
		sc = new Scanner("Hello Java");
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close();
		// File 객체 만들기
		File f = new File("");
		// 파일과 연결되는 스캐너 객체 만들기

		try {
			sc = new Scanner(f);
			// 데이터가 있을 때 까지 읽기
			// 파일은 있는데 내용을 못 읽는 경우는 2가지
			// 구분문자가 없거나 한글 인코딩이 서로 다른 경우
			// 글자가 깨진 것이 아니고 Scanner가 읽지를 못하는 것
			// 공백 문자를 찾아야하는데 인코딩이 다르면 공백문자의 코드 값이 다르다.
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
