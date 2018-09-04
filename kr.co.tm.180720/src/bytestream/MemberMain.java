package bytestream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {

		// 키보드로부터 줄 단위로 입력을 받을 수 있는 클래스의 참조형 변수 선언
		// finally절에서 close 할 수 있도록 try 밖에서 변수를 선언
		BufferedReader br = null;

		try {
			// 키보드로부터 입력받을 수 있는 인스턴스 생성
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("이름 : ");
			// 문자열 한 줄을 읽어오기
			String name = br.readLine();
			System.out.println("나이 : ");
			String age = br.readLine();
			System.out.println("키 : ");
			String height = br.readLine();

			// 3개의 데이터를 하나로 저장하기 위한 인스턴스를 생성
			Member member = new Member();
			member.setAge(Integer.parseInt(age));
			// 정수로 변환해서 저장
			member.setName(name);
			// 실수로 변환해서 저장
			member.setHeight(Double.parseDouble(height));

			// 맵을 이용해서 저장
			Map<String, Object> map = new HashMap<>();
			map.put("name", name);
			map.put("age", Integer.parseInt(age));
			map.put("height", Double.parseDouble(height));

			// 출력시에는 vo클래스나 Map이 별로 차이가 없다.
			System.out.println(member);
			System.out.println(map);

			// 사용시에는 다르다. 나이 1씩 더하기
			int r = member.getAge() + 1;
			// Map에서는 데이터를 가져와서 사용할 때 강제 형변환을 해야한다.
			r = (Integer)map.get("age") + 1;

		} catch (Exception e) {
			System.out.println("예외 발생 :" + e.getMessage());
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();

				}
		}
	}

}
