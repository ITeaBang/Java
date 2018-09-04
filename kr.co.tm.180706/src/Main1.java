
public class Main1 {

	public static void main(String[] args) {
		try {
			int i = 10;
			int j = 0;
			int result = i / j;

			System.out.println("결과:" + result);
		} catch (Exception e) {
		}
		System.out.println("예외 발생 후 실행");
		
		String str=null;
        str.charAt(10);
	}

}
