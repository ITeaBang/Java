package maxposition;

public class main {

	// 가장 큰 수의 위치
	public static void main(String[] args) {

		int[] ar = { 10, 30, 70, 40, 15 };
		int max = ar[0];
		int size = ar.length;
		int i;
		int idx = 0;

		for (i = 1; i < size; i = i + 1) {
			if (max < ar[i]) {
				max = ar[i];
				idx = i;
			}
				
			}
		System.out.println("가장 큰 수 위치 :" + (idx+1));
		}
	}


     // 50에 가장 가까운 수의 위치
