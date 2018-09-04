package sharedata;

public class Map {
	private double latitude;
	private double longtitude;

	// 매개변수가 없는 생성자 - default constructor
	public Map() {
		super();
	}

	//접근자 메소드 - getter & setter
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
	
	// 매개변수가 있는 생성자
	public Map(double latitude, double longtitude) {
		super();
		this.latitude = latitude;
		this.longtitude = longtitude;
	}

	

	// 지도를 출력하는 메소드
	public void showMap() {
		System.out.println("위도:" + latitude + "경도:" + longtitude + "위치의 지도를 출력합니다.");
	}
}
