package file;

import java.io.File;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {

		// ���Ͽ� ���� ������ Ȯ���� �� �ִ� Ŭ������ �ν��Ͻ��� ����
		File f = new File("C:\\Users\\503-18\\Desktop\\�޸�");
		// ������ ���� ����
		System.out.println(f.exists());
		// ������ ũ��
		long size = f.length();
		System.out.println(size / 1024 + "K");
		// ������ ���� �����ð�
		Date date = new Date(f.lastModified());
		System.out.println(date);

		File file = new File("C:\\Users\\503-18\\Desktop\\15.IO.xlsx");
		String parent = file.getParent();
		String filename = file.getName();
		// filename ���� 15.�� ������ �κ��� ��������
		// .�� ��ġ�� ã�Ƽ� .������ ���ڿ� ��������
		int idx = filename.indexOf('.');
		System.out.println(idx);
		// .�� �����Ѵٸ� : ��ġ�� ã�� �޼ҵ�� ã���� �ϴ� �����Ͱ� ������ ������ ����
		int id = filename.indexOf('k');
		System.out.println(id);

		if (idx >= 0) {
			// ���ڿ��� ��ġ�� ������ �ڸ��� �޼ҵ�
			// substring
			filename = filename.substring(idx + 1);

		}
		System.out.println(filename);
		// �̸� �ٲٱ�
		// String newFile = parent + filename;
		// System.out.println(newFile);
		file.renameTo(new File(parent, filename));
	}

}
