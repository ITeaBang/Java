
class Person
// Person이라는 클래스를 생성

{ // 클래스 안에 static 없이 만든 변수를 instance 변수라고 합니다.
	// 이 변수들은 객체가 만들어질 때 각 객체마다 별도로 메모리를 할당받습니다.

	int num; // 번호를 저장하기 위한 변수

	String name; // 이름을 저장하기 위한 변수

	String phone; // 전화번호를 저장하기 위한 변수

	// static 변수-공유
	static String schoolName;
    
	//TEN이라는 변수는 10을 저장 : 변경불가
//    static int x = 10;
//	static final int TEN = 10;
    
}

public class Sample1 {

	public static void main(String[] args) {
      
//		Person.TEN=20;
		
		// 인스턴트 2개 생성
		Person person1 = new Person();
		Person person2 = new Person();
		
		// 각 인스턴트의 num의 값을 출력
		System.out.println("person1:" + person1.num);
		System.out.println("person2:" + person2.num);
		
		// person1의 num을 1로 변경
		person1.num = 1;
		System.out.println("person1:" + person1.num);
		System.out.println("person2:" + person2.num);
		
		// static은 하나만 만들어서 공유하기 때문에 누군가가 변경하면
		// 다른 모두에 영향을 미칩니다.
		person1.schoolName = "만재 국민학교";
		System.out.println("person1:" + person1.schoolName);
		System.out.println("person2:" + person2.schoolName);

		Person ins = new Person();
		// Person이라는 클래스의 인스턴스를 생성
		// 인스턴스 이름을 출력시 toString()이라는 메소드의 결과가 호출
		// 보통은 클래스 이름과 해시코드가 출력
		// 실패시 null, 예외 발생
		
		System.out.println(ins);
        // Hello Java를 3번 출력하는 작업

		for (int x = 0; x < 3; x = x + 1) {
			System.out.println("Hello, Java");
		}
	}
	// System.out.println(x);
	// x는 for(제어문) 안에서 만들었으므로 바깥에서 사용 불가
	// 지역 변수는 반드시 초기화해서 사용
}
