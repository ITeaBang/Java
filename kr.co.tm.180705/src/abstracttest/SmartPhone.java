package abstracttest;

//Andorid 와 Iphone 클래스의 인스턴스 주소를 하나의 변수에 저장할 수 있도록
//하기 위해서 작성한 클래스 - 인스턴스를 생성할 필요가 없음
//추상 클래스 : 인스턴스를 만들 수 없는 클래스
public abstract class SmartPhone {
	// 하위클래스와 오버라이딩 관계를 만들기 위해서
	// 추상 메소드 : 내용이 없는 메소드로 상속받은 곳에서 반드시 재정의해야한다. {}제거
	public abstract void call();
}


