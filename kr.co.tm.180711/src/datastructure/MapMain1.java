package datastructure;

import java.util.HashMap;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "태연");
		map.put("age", 30);
		map.put("company", "SM");

		// 동일한 키로 다시 저장하면 업데이트가 된다. ex) SM -> SM Town
		map.put("company", "SM Town");

		// company 키의 값을 출력하기
		System.out.println(map.get("company"));
		// 없는 키의 이름을 사용하면 null을 리턴
		System.out.println(map.get("position"));

		// 모든 데이터 조회 (중요) - 저장할 때 사용했던 키를 몰라도 조회가 가능하다.
		// 모든 키를 Set으로 저장
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}

}
