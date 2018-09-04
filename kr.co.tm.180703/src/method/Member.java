package method;

public class Member {

	String email;
	String address;
	String name;
	String number;
	int age;

	// email의 getter
	public String getEmail() {
		return email;
	}

	// email의 setter
	public void setEmail(String arg) {
		email = arg;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Member [email=" + email + ", address=" + address + ", name=" + name + ", number=" + number + ", age="
				+ age + "]";
	}

	// 인스턴스 변수들을 출력해주는 메소드
	// 클래스 안에서 클래스에 만들어진 변수를 사용할 때는
	// 인스턴스나 클래스의 이름을 기재하지 않습니다.
	// public void display() {
	// System.out.println("이름 : " + name + "나이 : " + age + "번호 : " + number + "주소 :
	// " + address + "email : " + email);

	// static 메소드 : 클래스 이름으로 호출할 수 있는 메소드
	// 매개변수에 ..이 있으면 매개변수 개수에 상관없이 대입가능

	public static int sum(int... ar) {
		int tot = 0;
		// heap에 있는 데이터를 stack에 저장
		// 자주 사용하기 때문에 heap에 있으면 효율이 감소
		int len = ar.length;

		for (int i = 0; i < len; i = i + 1)
			tot = tot + ar[i];
		return tot;

	}
}
