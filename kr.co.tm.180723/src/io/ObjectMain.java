package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMain {

	public static void main(String[] args) {

		// ��ü ������ �����͸� ����� �� �ִ� Ŭ������ ���� ����
		// ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		try {
			
			// ���Ͽ� ��ü ������ ����� �� �ִ� Ŭ������ ��ü �����
			// oos = new ObjectOutputStream(new FileOutputStream("./oos.txt"));
			
			ois = new ObjectInputStream(new FileInputStream("./oos.txt"));
			// read�� �о�� �� Object Ÿ������ �����ϱ� ������ ���� ����ȯ�� ���ؼ� ������ �ڷ������� �ǵ����� ����ؾ� �մϴ�.

			// ����ϱ�
			// Member member = new Member();
			// member.setEmail("abcdef@naver.com");
			// member.setPhone("010-1234-5678");
			// member.setPw("1234");

			// �б�
			Member member = (Member) ois.readObject();
			System.out.println(member);
			System.out.println(member.getEmail());
			System.out.println(member.getPhone());
			System.out.println(member.getPw());

			// ��ü�� ���Ͽ� ���
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
