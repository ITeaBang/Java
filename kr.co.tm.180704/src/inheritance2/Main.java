package inheritance2;

public class Main {

	public static void main(String[] args) {

		/*
		 * //Super 클래스의 인스턴스를 생성 Super base = new Super();
		 * 
		 * //Sub 클래스의 인스턴스를 생성 Sub drive = new Sub();
		 * 
		 * //상위 클래스 타입의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수 있다. Super ob1 = new Sub();
		 * 
		 * //하위 클래스 타입의 변수에 상위 클래스 타입의 인스턴스 주소를 대입하는 것은 안된다 //Sub ob2 = new Super();
		 * 
		 * //하지만, 강제 형 변환을 통해서만 가능하다. //문제 발생 우려 //Exception in thread "main"
		 * java.lang.ClassCastException: inheritance.Super //cannot be cast to
		 * inheritance.Sub //at inheritance.Main.main(Main.java:21) : 예외 발생 //Sub ob3 =
		 * (Sub)(new Super()); } }
		 */

		// 상위 클래스 타입의 변수에 하위 클래스 타입의 주소를 대입할 수 있습니다.
		// obj는 기본적으로 Super 것만 호출할 수 있습니다.
		Super obj = new Super();
		obj.display();

		// 오버라이딩 된 메소드는 변수를 선언할 때 사용한 자료형이 아니라
		// 인스턴스를 만들어서 대입할 때 사용한 자료형의 것을 호출합니다.
		obj = new Sub();
		obj.display();
	}
}