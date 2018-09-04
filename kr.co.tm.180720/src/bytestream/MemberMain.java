package bytestream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {

		// Ű����κ��� �� ������ �Է��� ���� �� �ִ� Ŭ������ ������ ���� ����
		// finally������ close �� �� �ֵ��� try �ۿ��� ������ ����
		BufferedReader br = null;

		try {
			// Ű����κ��� �Է¹��� �� �ִ� �ν��Ͻ� ����
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�̸� : ");
			// ���ڿ� �� ���� �о����
			String name = br.readLine();
			System.out.println("���� : ");
			String age = br.readLine();
			System.out.println("Ű : ");
			String height = br.readLine();

			// 3���� �����͸� �ϳ��� �����ϱ� ���� �ν��Ͻ��� ����
			Member member = new Member();
			member.setAge(Integer.parseInt(age));
			// ������ ��ȯ�ؼ� ����
			member.setName(name);
			// �Ǽ��� ��ȯ�ؼ� ����
			member.setHeight(Double.parseDouble(height));

			// ���� �̿��ؼ� ����
			Map<String, Object> map = new HashMap<>();
			map.put("name", name);
			map.put("age", Integer.parseInt(age));
			map.put("height", Double.parseDouble(height));

			// ��½ÿ��� voŬ������ Map�� ���� ���̰� ����.
			System.out.println(member);
			System.out.println(map);

			// ���ÿ��� �ٸ���. ���� 1�� ���ϱ�
			int r = member.getAge() + 1;
			// Map������ �����͸� �����ͼ� ����� �� ���� ����ȯ�� �ؾ��Ѵ�.
			r = (Integer)map.get("age") + 1;

		} catch (Exception e) {
			System.out.println("���� �߻� :" + e.getMessage());
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
