

public class Test1 {

	public static void main(String[] args) {

		String msg = "I like Java";
		System.out.println(msg);
		
		// java 문자열의 포함 여부 확인 - 대소문자 구분 X
		int idx = msg.toLowerCase().indexOf("java".toLowerCase());
		if (idx >= 0) {
			System.out.println("java가 존재합니다.");
		} else {
			System.out.println("java가 존재하지 않습니다.");
		}

		// msg의 문자열을 공백을 기준으로 분할해서 하나씩 출력
		String[] ar = msg.split(" ");
		for (int i = 0; i < ar.length; i = i + 1) {
			System.out.println(ar[i]);
		}
		
		// msg의 3~7번째 글자 출력
		String sub = msg.substring(3, 8);
		System.out.println(sub);
		System.out.println(msg.charAt(5));
	}

}

// ex) 윈도우 화면에는 문자열만 출력이 가능
// int x = 200;
// int y = 100;
// 위와 같은 변수가 있을시 x : 200, y : 100의 형식으로 출력하고자 하는 경우
/*
 * public class Test1 {
 * 
 * public static void main(String[] args) {
 * 
 * int x = 200; int y = 100;
 * 
 * String str = String.format("x:%d y:%d", x, y);
 * 
 * System.out.println(str);
 * 
 * }
 * 
 * }
 */