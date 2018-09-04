package inheritance1;

public class Employee {

	// 번호, 이름을 저장하는 변수 : 상속받은 곳에서 사용할 수 있도록 protected로 변경
	protected int num;
    protected String name;

	// num의 값을 일련번호로 만들기 위한 공유 변수 -static
	protected static int autoincrement;
	
	// 생성자
	public Employee(int n) {

		// 일련번호 만들기
		autoincrement = autoincrement + 1;
		num = autoincrement;
		
	}

	// 인스턴스 변수를 사용할 수 있도록 하기 위한 접근자 메소드
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 값을 확인하기 위한 메소드
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + "]";
	}

}
