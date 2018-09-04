package cast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class URLTextDownload {

	public static void main(String[] args) {

		try {

			// �ٿ�ε� ���� �ּ� �����
			String addr = "http://www.choongang.co.kr/";
		/*	String query = URLEncoder.encode("���ù� ����", "utf-8");
			addr = addr + query;*/
			// �ѱ��� ���Ե� ����� URLEncoder.encode �޼ҵ带 �̿��ؼ� �ѱ��� ���ڵ��մϴ�.

			// 2. �ּҸ� ������ URL ��ü�� ����
			URL url = new URL(addr);

			// 3. URL ���� ��ü�� ����
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 4. �ɼ��� ����
			// ������ �ȵɽ� 30�ʱ��� �õ�
			con.setConnectTimeout(30000);

			// ������ ���� �����Ͱ� �־ ������� �ʵ��� ����
			con.setUseCaches(false);
			;

			// 5. �ٿ�ε� ���� ��Ʈ�� ����
			// �������� �ҽ� ���ڵ��� Ȯ���ϰ� "EUC-KR"�� ���, con.getInputStream()."EUC-KR" ����, ��κ� UTF-8
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

			// 6. �����͸� �о String���� �����
			// ���ڿ��� �������� �ʰ� ������ �� �ִ� Ŭ������ ��ü �����
			StringBuilder sb = new StringBuilder();
			while (true) {
				// �� ���� ���ڿ��� �б�
				String line = br.readLine();
				// ���� �� ������ �б� �ߴ�
				if (line == null) {
					break;
				}
				// ���� �����Ͱ� ������ sb�� �߰�
				sb.append(line + "\n");
			}
			// ���� �����͸� String���� ��ȯ
			String html = sb.toString();

			// ȭ�鿡 ���
			System.out.println(html);

			// 7. ����� ��ü ����
			br.close();
			con.disconnect();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
