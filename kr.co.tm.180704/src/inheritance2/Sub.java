package inheritance2;

//Super 클래스를 상속받는 Sub 클래스
public class Sub extends Super {
	// display 메소드를 오버라이딩
	// 아래 어노테이션이 에러가 발생하지 않으면 제대로 오버라이딩 한 것입니다.
	@Override
	public void display() {
		System.out.println("How are you?");
	}
	
	public void method() {
		System.out.println("하위 클래스에 만든 메소드");
	}

}
