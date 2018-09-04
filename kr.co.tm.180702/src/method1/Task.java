package method1;

public class Task {
	// 메소드의 결과형 앞에 static을 붙이면 클래스가 호출 가능한 메소드가 됩니다.
	public static void display() {
		System.out.println("static 메소드");

	}

	// 매개변수가 value 형인 경우 : call by value - 원본 데이터 변경 불가
	public static void incValue(int n) {
		n = n + 1;
	} // 매개변수가 reference 형인 경우 : call by reference - 원본 데이터 변경 가능

	public static void incReference(int[] n) {
		n[0] = n[0] + 1;
	}
	// 재귀함수 만들기
	// if(중단조건) return 중단했을 때의 값
	// else 재귀함수를 호출
	
	//1부터 n까지의 합을 재귀를 이용해서 리턴해주는 함수
	public int sum(int n) {
		if(n==1) {return 1;
	}
	else {
		return n+ sum(n-1);
	}
		}
	
	public int fiboNoRecurision(int n){
		int n1=1;
		int n2=1;
		int result = 1;
		for(int i=3;i<n+1;i=i+1){
		result=n1+n2;
		n1=n2;
		n2=result;
		}return result;
		}
	
}
