package datastructure;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatMain {

	public static void main(String[] args) {
		Date date = new Date();
		int money = 8403703;

		// 0000년 00월 00일 0요일 00시 00분 00초 형식으로 출력 , 서식암기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEE a hh시mm분ss초");
		String msg = sdf.format(date);
		System.out.println(msg);

		// \6,570,000으로 출력
		DecimalFormat df = new DecimalFormat("\u00a4 #,##0"); 
		//숫자가 있는대로 출력 : #, 없어도 출력 : 0
		msg = df.format(money);
		System.out.println(msg);
	}

}
