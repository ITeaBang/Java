package event;
import java.util.Scanner;

public class Hancom1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��:");
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
		
		//������ ��ü�� ��ȸ
		for(int i=0; i<acgtSequence.length(); i=i+1) {
			//�ϳ��� ���ڸ� ch�� ����
			char ch = acgtSequence.charAt(i);
			//ch�� codon�� ù��° ���ڰ� ���ٸ�
			if(ch == codon.charAt(0)) {
				//��ġ�� ����
				int idx = i;
				//codon�� �ι�° ���ں��� ������ ��
				int j;
				for(j=1; j<codon.length(); j=j+1) {
					//���� �ٸ� ���ڰ� ���´ٸ� �ݺ��� ����
					ch = acgtSequence.charAt(idx+j);
					if(ch != codon.charAt(j)) {
						break;
					}
				}
				//�ݺ����� ���������� ����Ǿ��ٸ�
				//��� ���ڰ� �����ϴٸ�
				if(j == codon.length()) {
					System.out.println(idx);
					i = i + codon.length() - 1;
				}
				
			}
			
		}
		

	}

}
*/