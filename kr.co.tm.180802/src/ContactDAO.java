import java.util.List;

public interface ContactDAO {
	// 데이터를 삽입하는 메소드
	public boolean insertContact(Contact contact);

	// 데이터를 수정하는 메소드
	public boolean updateContact(Contact contact);

	// 데이터를 삭제하는 메소드 ( primary key 이용 )
	public boolean deleteContact(int num);

	// 데이터 전체보기 메소드
	// 데이터가 0개 이상이므로 List로 리턴하고 읽어올 컬럼들을 저장할 DTO클래스나 Map으로 제너릭을 적용하면 됩니다.
	public List<Contact> allContact();

	// 데이터를 조회하는 메소드
	public List<Contact> nameContact(String name);
	
}
