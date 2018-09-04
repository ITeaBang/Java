package method;

import java.util.Scanner;

//실행 클래스 - main 메소드를  소유한 클래스
public class Main {

	public static void main(String[] args) {
		// Member 클래스의 인스턴스를 생성
		Member member1 = new Member();
		Scanner sc = new Scanner(System.in);

		// 인스턴스 변수를 호출해서 데이터 저장
		System.out.println("이메일:");
		String email = sc.nextLine();
		// member1.setEmail("iteabang@gmail.com");
		member1.setEmail(email);

		System.out.println("주소:");
		String address = sc.nextLine();
		member1.setAddress(address);

		System.out.println("이름:");
		String name = sc.nextLine();
		member1.setName(name);

		System.out.println("전화번호:");
		String number = sc.nextLine();
		member1.setNumber(number);

		System.out.println("나이:");
		int age = sc.nextInt();
		member1.setAge(age);

		sc.close();
		// member1.display();
		System.out.println(member1); // toString 출력문
		
		System.out.println(Member.sum(10,30));
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10));

		long m = Math.max(100, 200);
		System.out.println(m);
	}
}
