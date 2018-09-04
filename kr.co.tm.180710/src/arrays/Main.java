package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 인스턴스 배열 만들기 - 3개 저장할 수 있는 배열을 생성
		// 아직은 모두 null
		Soccer[] soccers = new Soccer[3];

		// 인스턴스 생성
		soccers[0] = new Soccer();

		// 값 채우기
		soccers[0].setTeamName("Real Madrid");
		soccers[0].setMember("Cristiano Ronaldo");
		soccers[0].setMemberNumber(7);
		soccers[0].setWorth(41950000000L);

		// 인스턴스 생성
		soccers[1] = new Soccer();

		// 값 채우기
		soccers[1].setTeamName("Barcelona");
		soccers[1].setMember("Lionel Messi");
		soccers[1].setMemberNumber(10);
		soccers[1].setWorth(39150000000L);

		// 인스턴스 생성
		soccers[2] = new Soccer();

		// 값 채우기
		soccers[2].setTeamName("Tottenham Hotspur");
		soccers[2].setMember("Son-HeungMin");
		soccers[2].setMemberNumber(7);
		soccers[2].setWorth(12210000000L);

		// 배열의 데이터를 정렬
		// 기본적으로 정렬을 하기 위해서는 각 데이터의 크기를 비교할 수 있어야한다.
		// java에서 크기 비교를 하는 메소드는
		// Comparable 인터페이스의 compare 메소드입니다.
		// 직접 만든 클래스의 경우는 클래스에 Comparable 인터페이스를
		// implements 하거나 Comparator 인터페이스를 implements한
		// 인스턴스를 같이 대입해야한다.

		Scanner sc = new Scanner(System.in);
		while (true) {
			// 비교할 Comparator 변수만 선언
			Comparator<Soccer> comparator = null;

			// 입력문 설정
			System.out.println("0 : 종료, 1 : 제목오름차순, 2 : 제목내림차순");
			int menu = sc.nextInt();

			// 조건 설정
			if (menu == 0) {
				break;
			} else if (menu == 1) {
				comparator = new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						Soccer soccer1 = (Soccer) o1;
						Soccer soccer2 = (Soccer) o2;
						return soccer1.getTeamName().compareTo(soccer2.getTeamName());
					}
				};
			} else if (menu == 2) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Soccer soccer1 = (Soccer) o1;
						Soccer soccer2 = (Soccer) o2;
						return soccer2.getTeamName().compareTo(soccer1.getTeamName());
					}
				};
			}

			Arrays.sort(soccers, comparator);
			// 배열의 데이터 전부 출력
			for (

			Soccer soccer : soccers) {
				System.out.println(soccer);

			}
			System.out.println("============================");
		}
		// 종료
		sc.close();
	}
}

/*
 * // Comparator 인터페이스를 implements 한 인스턴스 만들기
 * 
 * @SuppressWarnings("unchecked")
 * 
 * Comparator<Soccer> comparator = new Comparator() {
 * 
 * @Override public int compare(Object o1, Object o2) { Soccer first = (Soccer)
 * o1; Soccer second = (Soccer) o2; //TeamName을 이용해서 비교 return
 * first.getTeamName().compareTo(second.getTeamName()); }
 * 
 * };
 * 
 * Arrays.sort(soccers, comparator);
 * 
 * // 배열의 데이터 전부 출력 for ( Soccer soccer:soccers) { System.out.println(soccer);
 * 
 * } }}
 */
