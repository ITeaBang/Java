import java.util.LinkedList;

public class ListTest1 {

	public static void main(String[] args) {
		// 문자열을 저장할 수 있는 ArrayList 생성 (import만 해주면 LinkedList로 사용 가능)
		LinkedList<String> arrayList = new LinkedList<>();
		// 데이터를 삽입
		arrayList.add("유리");
		arrayList.add("설현");
		arrayList.add("수지");
		arrayList.add("아이유");
		arrayList.add("아이린");
		// 데이터 개수
		System.out.println("데이터 개수 :" + arrayList.size());
		// 전체 데이터 출력
		for (String temp : arrayList) {
			System.out.println(temp);
		}
		// 4번째 데이터 출력하기
		System.out.println("==============");
		System.out.println(arrayList.get(4));

		// 데이터 삭제 후 마지막 데이터 재출력
		arrayList.remove(0);
		System.out.println(arrayList.get(4));

		// 데이터 0번째 삽입 후 4번째 데이터 재출력
		arrayList.add(0, "유리");
		System.out.println(arrayList.get(4));

	}
}
