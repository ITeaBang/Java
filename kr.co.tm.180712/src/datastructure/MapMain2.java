package datastructure;

public class MapMain2 {

	public static void main(String[] args) {

		// 월드컵 국가별 선수 명단을 배열로 만들기
		String[] korea = { "손흥민", "조현우", "김영권" };
		String[] france = { "포그바", "그리즈만", "캉테" };
		String[] belgium = { "아자르", "더브라위너", "루카쿠" };
		// 추가 입력시 출력 부분에도 추가가 필요
		String[] germany = { "외질", "보아텡", "뮐러" };

		// String 배열의 배열
		String[][] players = { korea, france, belgium, germany};

		// 2차원 배열의 데이터 출력
		// 큰 배열에 포함된 작은 배열의 데이터 개수만큼 반복
		for (int i = 0; i < players.length; i = i + 1) {
			
			//팀의 이름까지 출력
			if(i==0) {
				System.out.print("Korea : "+"\t");
			}
			else if(i==1) {
				System.out.print("France : "+"\t");
			}
			else if(i==2) {
				System.out.print("Belgium : "+"\t");
			}
			else if(i==3) {
				System.out.print("Germany : "+"\t");
			}
			
			// 작은 배열을 순서대로 가져오기
			String[] imsi = players[i];
			
			// 작은 배열의 데이터 개수만큼 반복
			for (int j = 0; j < imsi.length; j = j + 1) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println("");

		}

	}

}
