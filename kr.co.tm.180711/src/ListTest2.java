import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest2 {

	public static void main(String[] args) {

		// 정수를 저장하는 Array List와 Linked List를 만들고
		// 중간에 데이터 10만개를 삽입하는데 걸리는 시간을 측정
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> li = new LinkedList<>();

		// Array List에 데이터 삽입
		al.add(1);
		al.add(3);
		al.add(4);

		// Linked List에 데이터 삽입
		li.add(1);
		li.add(3);
		li.add(4);

		// Array List에 10만개를 중간에 넣고 시간 측정
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i = i + 1) {

			// al 1번째 자리에 2를 추가
			al.add(1, 2);

		}
		long end = System.currentTimeMillis();
		System.out.println("Array List 처리 시간 : " + (end - start));

		// Linked List에 10만개를 중간에 넣고 시간 측정
		start = System.currentTimeMillis();
		for (int j = 0; j < 100000; j = j + 1) {

			// li 1번째 자리에 2를 추가
			li.add(1, 2);

		}
		end = System.currentTimeMillis();
		System.out.println("Linked List 처리 시간 : " + (end - start));

		// Array List를 읽는 시간
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i = i + 1) {

			// i번째 데이터 읽기
			al.get(i);

		}
		end = System.currentTimeMillis();
		System.out.println("Array List 읽는 시간 : " + (end - start));

		// Linked List를 읽는 시간
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i = i + 1) {

			// i번째 데이터 읽기
			li.get(i);

		}
		end = System.currentTimeMillis();
		System.out.println("Linked List 읽는 시간 : " + (end - start));

	}

}
