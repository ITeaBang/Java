import java.util.ArrayList;
import java.util.List;

interface T{
	public void method(int n);
}

interface V{
	public int add(int n1, int n2);
}

public class LambdaMain {

	public static void main(String[] args) {
		V ob = (n1, n2) ->{
			return n1+n2;
		};
		
		System.out.println(ob.add(100,3000));
		
		//배열은 [인덱스]를 통해서 각각의 데이터에 접근합니다.
		int [] ar = {10, 30, 20};
		//ar의 모든 요소를 temp에 대입해서 하나씩 수행합니다.
		//for - each를 이용한 배열의 데이터 접근
		for(int temp : ar) {
			System.out.println(temp);
		}
		System.out.println("=================");
		//List는 get(인덱스)를 통해서 각각의 데이터에 접근합니다.
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(70);
		list.add(40);
		for(int temp : list) {
			System.out.println(temp);
		}
	}
}









