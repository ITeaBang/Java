package datastructure;

import java.util.Set;
import java.util.TreeMap;

public class MapMain1 {

	public static void main(String[] args) {
		// 이름과 나이 및 소속 회사를 저장하는 Map을 생성
		
		// HashMap은 key의 순서를 알 수 없다.
		// HashMap<String, Object> map = new HashMap<>();

		// 입력한 순서대로 key를 저장한다.
		// LinkedHashMap<String, Object> map = new LinkedHashMap<>();

		// key의 순서대로 출력한다.
		TreeMap<String, Object> map = new TreeMap<>();
		
		// data 입력
		map.put("name", "아이린");
		map.put("age", 25);
		map.put("company", "SM");

		// 전체를 한번에 출력, toString에 재정의 되어있다.
		System.out.println(map);
		System.out.println("===============================");
		
		// 순서에 상관없이 항목별로 출력, 입력의 변경 사항에 관계없이 출력할 수 있다.
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}

	}

}
