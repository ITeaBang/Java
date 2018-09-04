package lang;

public class Main1 {

	public static void main(String[] args) {
		// Value형 변수 생성
		int n = 10;
		// value형의 데이터를 대입
		int x = n;
		x = 20;
		System.out.println(n);

		// 참조형 데이터의 복사 - 주소가 복사
		int[] ar = { 10, 20, 30 };
		// 10,20,30이 저장된 곳의 주소를 복사
		int[] br = ar;
		// 복사된 주소의 첫번째 데이터를 1000으로 변경
		br[0] = 1000;
		System.out.println(ar[0]);

		// 참조형을 복사해 줄 때 실제 데이터를 복사해주기
		// 배열을 복사하기 위해서 새로운 공간을 생성
		int[] cr = new int[ar.length];
		// 내부 데이터를 복사
		for (int i = 0; i < ar.length; i = i + 1) {
			cr[i] = ar[i];
		}
		cr[0] = 500;
		System.out.println(ar[0]);
		// 이번에는 데이터를 복사해서 주었기 때문에 영향을 받지 않습니다.

	}

}