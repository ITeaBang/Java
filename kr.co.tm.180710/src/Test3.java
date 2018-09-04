import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// 문자열 배열 생성
		String[] subject = { "Java", "Oracle", "Web Front End", "Web Back End - Java", "Android", "iOS" };

		// 수열 생성
		int[] number = { 10, 8, 59, 37, 81, 95, 21 };

		// subject, number 정렬
		Arrays.sort(subject);
		Arrays.sort(number);

		// Oracle의 위치 검색
		int idx = Arrays.binarySearch(subject, "Oracle");
		System.out.println(idx);

		// Android의 위치 검색 - 비정렬 상태에서는 -1 출력 - 정렬 상태에서 정상값 출력
		idx = Arrays.binarySearch(subject, "Android");
		System.out.println(idx);

		// 59의 위치 검색
		idx = Arrays.binarySearch(number, 59);
		System.out.println(idx);

		// 배열의 데이터 전부 출력
		for (String temp : subject) {
			System.out.println(temp);
		}

		// 수열의 데이터 전부 출력
		for (int i = 0;i <= 7; i++) {
			System.out.println(number[i]);
		}
	}
}
