import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class ContactMain {

	public static void main(String[] args) {

		// 인터페이스나 클래스를 상속한 경우, 상위 인터페이스나 클래스 이름으로 변수를 만들고 하위 클래스에 인스턴스를 생성해서 대입
		// 인터페이스 : ContactDAO , 하위클래스 : ContactDaoImpl 사용
		ContactDAO dao = new ContactDaoImpl();
		//Contact contact = new Contact();
		//List<Contact> list = dao.allContact();
		List<Contact> list = dao.nameContact("박");
		// 전체 데이터를 조회
        for(Contact contact : list) {System.out.println(contact);}
		// 데이터 삽입, 수정, 삭제
		/*contact.setNum(1);
		contact.setName("제시카");
		contact.setEmail("jessica72@gmail.com");
		contact.setPhone("01031391997");

		// 현재 시간을 저장한 캘린더 생성
		Calendar cal = Calendar.getInstance();

		// 데이터 삽입, 수정
		cal.set(Calendar.YEAR, 1972);
		// 시작 위치가 0부터 시작해서 'MONTH-1'을 입력
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 27);
		Date birthDay = new Date(cal.getTimeInMillis());
		contact.setBirthday(birthDay);*/

		// 데이터를 삽입하는 메소드 호출
		/*
		 * boolean result = dao.insertContact(contact); if(result==true)
		 * {System.out.println("삽입 성공");} else {System.out.println("삽입 실패");}
		 */

		// 데이터를 수정하는 메소드 호출
		/*
		boolean r = dao.updateContact(contact);
		if (r == true) {
			System.out.println("변경 성공");
		} else {
			System.out.println("변경 실패");
		}*/
		
		/*// 데이터를 삭제하는 메소드 호출
		boolean r = dao.deleteContact(2);
		if (r == true) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
*/

        
        
        
        
        
        
        
        
        
        
	}

}
