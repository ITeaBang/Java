package inheritance1;

// Employee 클래스를 상속받은 Manager 클래스
// extends 직접 입력해서 상속받는 것도 가능
public class Manager extends Employee {
	
	//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부르는 경우는
	//안드로이드에서 많이 발생
	public Manager() {
		super(10);
		
	}
	
	// 직책 저장 변수
	private String task;

	public String getTask() {
		return task;
	}

	//메소드 원형 : setTask(String) : Package Explorer에서 확인 가능
	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		//super.toString()은 상위 클래스인 Employee의 toString을 호출합니다.
		return super.toString() + "Manager [task=" + task + "]";
	}

}
