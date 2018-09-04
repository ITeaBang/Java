package sharedata;

//위치 정보를 가져오는 클래스
public class Location {
	public double latitude;
	public double longtitude;

	public void getLocation() {

		// 지도를 출력하는 메소드
		// Map map = new Map(latitude,longtitude);

		// setter를 이용한 데이터 전달
		Map map = new Map();
		map.setLatitude(latitude);
		map.setLongtitude(longtitude);
		map.showMap();
	}
}
