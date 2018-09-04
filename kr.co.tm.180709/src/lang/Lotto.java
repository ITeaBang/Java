package lang;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		// 1~45까지 중복되지 않는 6개의 정수 저장
		// 데이터를 저장할 배열 생성
		int [] ar = new int[6];

		// 배열을 저장하는 변수 생성
		int size = ar.length;
		Scanner sc = new Scanner(System.in);
		int i,j;
		for (i = 0; i < size; i = i + 1) {
			try {
				System.out.printf("정수 입력 : ");

				String temp = sc.nextLine();

				ar[i] = Integer.parseInt(temp);
			
			//1~45 사이가 아닌 경우 재입력 요청
				if(!(ar[i]>=1 && ar[i]<=45)) 
				//ar[i]<1 !! ar[i]>45
				//드모르간의 법칙
				{
					System.out.println("1~45까지 정수를 입력하세요");
					i=i-1;
				}
				//이전에 입력된 자료와 비교 - 중복검사
				for(j=0;j<=i+1;j=j+1) {
					//이전 데이터와 방금 입력받은 데이터가 같으면 반복문 종료
					if(ar[i]==ar[j]) {
						break; 
					}
				}
					if(j !=i) {System.out.println("동일한 데이터는 입력이 안 됩니다.");
					i=i-1;
					continue;					
				}
			}
			    catch (Exception e) {
				System.out.println("정수를 입력하세요.");
				
				//잘못된 시도를 무효로 만들 때 뒤로 한 번 간다. 
				i=i-1;
				//밑에 내용이 존재 할 경우
				//continue;
			}
		}
		sc.close();

		// 배열의 모든 데이터를 출력
		for (i = 0; i < size; i = i + 1) {
			System.out.println(ar[i]);
		}
	}
}
