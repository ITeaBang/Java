package datastructure;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		ArrayList<Singer> list = new ArrayList<>();

		// 생성
		Singer singer = new Singer();
		singer.setName("배수지");
		singer.setAge(25);
		list.add(singer);

		// 추가 생성 (같은 변수 이용 가능)
		singer = new Singer();
		singer.setName("설현");
		singer.setAge(24);
		list.add(singer);

		// 추가 생성 (같은 변수 이용 가능)
		singer = new Singer();
		singer.setName("아이유");
		singer.setAge(26);
		list.add(singer);

		// 리스트의 모든 데이터 확인
		System.out.println(list);
		System.out.println("");

		Comparator<Singer> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {

				Singer first = (Singer) o1;
				Singer second = (Singer) o2;

				return second.getAge() - first.getAge();
			}
		};

		list.sort(comp);
		// 각각의 데이터 확인
		for (Singer temp : list) {
			System.out.println(temp);
		}
	}
}

