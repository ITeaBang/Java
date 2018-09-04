package object;

public class Main {

	public static void main(String[] args) {
		//Fruit 클래스의 인스턴스를 생성해서 데이터를 저장
		Fruit Fruit1 = new Fruit();
		Fruit1.setFruitName("바나나");
		Fruit1.setOrgin("브라질");
		Fruit1.setPrice(2000);
		Fruit1.setSugar("35%");
		
		//toString을 호출해서 출력
		//System.out.println(Fruit1.toString());
		// System.out.println(Fruit1);
		
		Fruit Fruit2 = new Fruit();
		Fruit2.setFruitName("바나나");
		Fruit2.setOrgin("칠레");
		Fruit2.setPrice(2600);
		Fruit2.setSugar("38%");
		
		//내용을 비교
		System.out.println(Fruit1.equals(Fruit2));
		System.out.println(Fruit1==Fruit2); 
	}

}
