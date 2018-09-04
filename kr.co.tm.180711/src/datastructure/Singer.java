package datastructure;

public class Singer {

	// 데이터 변수 설정
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Singer [name=" + name + ", age=" + age + "]";
	}
}
