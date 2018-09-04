
public class Main2 {

	public static void main(String[] args) {

		// 문자열 배열 생성
		String[] ar = { "Morning", "Afternoon", "Evening" };
		try {
			// 배열의 데이터를 순환하면서 출력
			int size = ar.length;

			// size까지 진행해서 예외가 발생
			for (int i = 0; i < size; i = i + 1) {
				System.out.println(ar[i]);
				if(i>=2) {
				throw new NumberFormatException("강제로 예외 발생");
				}
				//System.out.println(Integer.parseInt(ar[i])); 
			}
		} catch (Exception e)

		{
			// 예외 내용 출력
			System.out.println(e.getMessage());
			// 예외 내용 추적
			e.printStackTrace();
		}
		finally {
			System.out.println("예외 발생 여부에 관계없이 출력한다.");
		}
	}
}
