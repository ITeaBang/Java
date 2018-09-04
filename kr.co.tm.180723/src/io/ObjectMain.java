package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMain {

	public static void main(String[] args) {

		// 객체 단위로 데이터를 기록할 수 있는 클래스의 변수 선언
		// ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		try {
			
			// 파일에 객체 단위로 기록할 수 있는 클래스의 객체 만들기
			// oos = new ObjectOutputStream(new FileOutputStream("./oos.txt"));
			
			ois = new ObjectInputStream(new FileInputStream("./oos.txt"));
			// read로 읽어올 때 Object 타입으로 리턴하기 때문에 강제 형변환을 통해서 원래의 자료형으로 되돌려서 사용해야 합니다.

			// 기록하기
			// Member member = new Member();
			// member.setEmail("abcdef@naver.com");
			// member.setPhone("010-1234-5678");
			// member.setPw("1234");

			// 읽기
			Member member = (Member) ois.readObject();
			System.out.println(member);
			System.out.println(member.getEmail());
			System.out.println(member.getPhone());
			System.out.println(member.getPw());

			// 객체를 파일에 기록
			// oos.writeObject(member);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			try {
				
				// if (oos != null) {
				// oos.close();
				
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
