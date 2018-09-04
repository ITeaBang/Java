package object;

public class Fruit {

	// 과일명, 원산지, 가격, 당를 저장할 변수
	private String fruitName;
	private String orgin;
	private int price;
	private String sugar;

	// 인스턴스 변수를 사용하기 위한 접근자 메소드 = getters & setters
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}

	// 내부 데이터의 값을 빠르게 확인하기 위한 용도로 사용
	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", orgin=" + orgin + ", price=" + price + ", sugar=" + sugar + "]";
	}

	// 2개의 내용이 같은지를 비교하는 메소드
	public boolean equals(Fruit other) {
		boolean result = false;
		// 호출하는 인스턴스의 fruitName과 매개변수의 fruitName이 같으면
		// true를 리턴하고 그렇지 않으면 false를 리턴
		if (fruitName.equals(other.fruitName)) {
			result = true;
		}
		return result;
	}
}
