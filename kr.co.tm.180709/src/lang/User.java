package lang;

import java.util.Arrays;

public class User {
	private int num;
	private String name;
	private String[] hobbies;

	//
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

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	// 인스턴스 변수의 값을 빠르게 확인하기 위한 (디버깅) 메소드
	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}

	// 현재 인스턴스를 이용해서 새로운 인스턴스를 만들어주는 메소드
	public User clone() {
		User user = new User();
		user.num = this.num;
		user.name = this.name;
		// user.hobbies = this.hobbies;
		// 참조형은 다시 복제해 주어야 합니다.
		user.hobbies = new String[this.hobbies.length];
		for (int i = 0; i < this.hobbies.length; i = i + 1)
			user.hobbies[i] = this.hobbies[i];
		return user;
	}
}
