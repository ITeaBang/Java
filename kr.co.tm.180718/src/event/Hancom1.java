package event;
import java.util.Scanner;

public class Hancom1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("라인 수:");
		int line = sc.nextInt();
		int idx = 0;
		for(int i=0; i<line; i=i+1) {
			for(int j=0; j<line-i-1; j=j+1) {
				System.out.print(" ");
			}
			System.out.print(idx%10);
			idx = idx + 1;
			if(i>=1 && i<line-1) {
				for(int j=0; j<2*i-1; j=j+1) {
					System.out.print(" ");
				}
				System.out.print(idx%10);
				idx = idx + 1;
			}
			else if(i==line-1) {
				for(int j=0; j<2*i; j=j+1) {
					System.out.print(idx%10);
					idx = idx + 1;
				}
			}
			
			
			System.out.println("");
		}
		
		sc.close();

	}

}


/*public class Hancom2 {

	public static void main(String[] args) {
		String acgtSequence = 
			"ACCGGCCGAGACAGCGAGCATATGCCGCCGAGACAGGCCGGACCGGCCGAGA";
		String codon = "GCCG";
		
		//데이터 전체를 순회
		for(int i=0; i<acgtSequence.length(); i=i+1) {
			//하나씩 글자를 ch에 저장
			char ch = acgtSequence.charAt(i);
			//ch와 codon의 첫번째 글자가 같다면
			if(ch == codon.charAt(0)) {
				//위치를 저장
				int idx = i;
				//codon의 두번째 글자부터 끝까지 비교
				int j;
				for(j=1; j<codon.length(); j=j+1) {
					//서로 다른 글자가 나온다면 반복문 종료
					ch = acgtSequence.charAt(idx+j);
					if(ch != codon.charAt(j)) {
						break;
					}
				}
				//반복문이 정상적으로 종료되었다면
				//모든 글자가 동일하다면
				if(j == codon.length()) {
					System.out.println(idx);
					i = i + codon.length() - 1;
				}
				
			}
			
		}
		

	}

}
*/