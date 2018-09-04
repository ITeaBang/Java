import java.util.ArrayList;
import java.util.Comparator;
//import java.util.LinkedList;
import java.util.LinkedList;

public class ListTest3 {

	public static void main(String[] args) {

		// 정수 List와 정렬
		ArrayList<Integer> al = new ArrayList<>();

		al.add(40);
		al.add(30);
		al.add(50);

		System.out.println("정렬 전 : " + al);

		Comparator<Integer> comp1 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {

				// 바로 사용이 불가능
				Integer first = (Integer) o1;
				Integer second = (Integer) o2;
				// 정수 출력 (오름차순)
				return first - second;
				//return second - first; (내림차순)

			}
		};

		al.sort(comp1);
		// List는 toString 재정의 되어있어서 인스턴스를 출력하면
		// 데이터가 순서대로 toString를 호출합니다.
		System.out.println("정렬 후 : " + al);

		// 문자열 List 정렬
		LinkedList<String> li = new LinkedList<>();

		li.add("Seoul");
		li.add("Bucheon");
		li.add("Busan");

		System.out.println("정렬 전 : " + li);

		Comparator<String> comp2 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String first = (String) o1;
				String second = (String) o2;
				// 문장열 출력 (오름차순)
				return first.compareTo(second);
				//return second.compareTo(first); (내림차순)
			}

		};

		li.sort(comp2);
		// List는 toString 재정의 되어있어서 인스턴스를 출력하면
		// 데이터가 순서대로 toString를 호출합니다.
		System.out.println("정렬 후 : " + li);

	}
}
