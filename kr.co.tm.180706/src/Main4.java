
public class Main4 {

	public static void main(String[] args) { //throws Exception(문제를 못 찾는다.)

		// 교대로 출력

		/*
		 * int idx = 0; for (;;) { System.out.println("image" + (idx % 3) + ".png");
		 * try{ Thread.sleep(1000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } idx = idx + 1; }
		 */
		
		String[] ar = { "김기태", "이종범", "최향남", "이대진" };
		int idx = 0;
		try {
			int size = ar.length;
			while (true) {
				System.out.println(ar[idx % size]);
				idx = idx + 1;

				Thread.sleep(1000);

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
