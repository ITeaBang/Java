package datastructure;

import java.sql.Date;
import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// 1992년 5월 17일을 Calendar 객체로 만들기
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(Calendar.YEAR, 1992);
		birthDay.set(Calendar.MONTH, 5);
		birthDay.set(Calendar.DAY_OF_MONTH, 17);
		 System.out.println(birthDay);
		 Date date = new Date(birthDay.getTimeInMillis());
		 System.out.println(date);

		// Calendar toDay = Calendar.getInstance();
		// long gap = toDay.getTimeInMillis() - birthDay.getTimeInMillis();
		// System.out.println("태어난지 "+(gap/24/60/60/1000)+"일 째 되는 날입니다.");
	}

}
