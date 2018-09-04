package lang;

public class Main2 {

	public static void main(String[] args) {
		User user1 = new User();

		String[] hobbies = { "노래", "춤" };
		user1.setHobbies(hobbies);
		// toString을 호출해서 내부 내용 확인
		user1.setName("아이린");
		user1.setNum(1);
		//System.out.println(user1);
		
		//user1의 데이터가 저장된 곳의 주소를 user2에 복사
		User user2 = user1;
		user2.setNum(2);
		System.out.println(user1);
		
		User user3 = user1.clone();
		user3.setNum(3);
		user3.setName("수지");
		user3.getHobbies()[0]="연기";
		System.out.println(user1);
		System.out.println(user3);

	}

}
