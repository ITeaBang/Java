package inheritance1;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee(5);
		// 객체의 내용을 확인하고자 하면 System.out.println 메소드에
		// 객체의 이름만 대입
		System.out.println(emp1);

		Employee emp2 = new Employee(6);
		System.out.println(emp2);
		
		Manager man1 = new Manager();
		System.out.println(man1);
		
	}

}
