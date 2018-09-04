package abstracttest;

public class WinPhone extends SmartPhone {

	@Override
	public void call() {
		@SuppressWarnings("unused")
		int time = 132400;
		// 위에 저장된 값이 초라고 가정하고 몇시간 몇분 몇초인지 출력
		int hour = time / 3600;
		int min = (time % 3600)/60;
		int sec = time % 60;
		System.out.println(hour + "시간" + min + "분" + sec + "초");

	}

}
