package datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class LogMain {

	public static void main(String[] args) {
		// 로고 파일의 내용을 읽을 수 있는 Scanner 만들기
		File f = new File("C:\\Users\\503-18\\Desktop\\log.txt");

		HashSet<String> set1 = new HashSet<>();
		try {
			// 파일의 내용을 읽을 Scanner 인스턴스 생성
			Scanner sc = new Scanner(f);
			// 합계를 저장할 변수를 생성
			int sum = 0;
			// 읽을 다음 줄이 있을 때까지 수행
			while (sc.hasNextLine()) {
				// System.out.println(sc.nextLine());
				// 한 줄 읽기
				String temp = sc.nextLine();
				// 공백으로 분할하기
				String[] ar = temp.split(" ");
				// 10번째 데이터 확인
				// System.out.println(ar[9]);

				// set1.add(ar[0]);
				// 10번째 문자열을 정수로 변환해서 sum에 더하기
				sum = sum + Integer.parseInt(ar[9]);

			}
			System.out.println("트래픽 합계 : "+sum);
			// System.out.println(set1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
