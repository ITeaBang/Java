package bytestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataMain {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\503-18\\Desktop\\�̿��ڷ�\\access_log.txt"));

			// �� ������ �����͸� �̾���� StringBuilder ����
			ArrayList<String> iplist = new ArrayList<>();
			// �ߺ����� �����ϱ� ���� set ����� <=> list�� �ߺ� ����
			Set<String> ipset = new HashSet<String>();

			while (true) {

				// �� ���� �б�
				String line = br.readLine();

				// ���� �����Ͱ� ������ ����
				if (line == null) {
					break;
				}

				// �������� ����
				String[] ar = line.split(" ");
				// System.out.println(ar[0]);
				ipset.add(ar[0]);
				iplist.add(ar[0]);
			}

			for (String ip : ipset) {
				System.out.println(ip);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
