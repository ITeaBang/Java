package datastructure;

import java.util.HashMap;
import java.util.HashSet;

public class MapMain3 {

	public static void main(String[] args) {

		// 월드컵 국가별 선수 명단을 배열로 만들기
		String[] korea = { "손흥민", "조현우", "김영권" };
		String[] france = { "포그바", "그리즈만", "캉테" };
		String[] belgium = { "아자르", "더브라위너", "루카쿠" };
		// 추가 입력시 출력 부분에도 추가가 필요
		String[] germany = { "외질", "보아텡", "뮐러" };

		// 동일한 의미를 갖는 배열들을 묶을 때 바로 배열이나 리스트로 묶는 것은 바람직하지 않다.
		// 배열이나 리스트는 인덱스를 가지고 구분을 하기 때문에 의미를 부여하지 못한다.
		// 배열이나 리스트를 다시 배열이나 리스트로 묶을 때는 먼저
		// Map으로 의미를 부여해서 묶은 다음 다시 배열이나 리스트로 묶으라고 합니다.

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("team", "Korea : ");
		map1.put("data", korea);
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("team", "France : ");
		map2.put("data", france);
		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("team", "Belgium : ");
		map3.put("data", belgium);
		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("team", "Germany : ");
		map4.put("data", germany);

		// HashMap의 배열
		HashMap[] players = { map1, map2, map3, map4 };

		for (int i = 0; i < players.length; i = i + 1) {
			HashMap temp = players[i];
			// 팀 이름 출력
			System.out.print(temp.get("team"));
			// 선수 명단 가져오기
			// 출력을 할 때는 get한 데이터를 형변환하지 않지만
			// 저장을 하거나 사용을 할 때는 반드시 원래의 자료형으로 강제 형 변환
			String[] imsi = (String[]) temp.get("data");
			for (int j = 0; j < imsi.length; j = j + 1) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println("");
		}
	}

}
