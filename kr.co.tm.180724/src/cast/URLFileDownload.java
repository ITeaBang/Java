package cast;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLFileDownload {

	public static void main(String[] args) {
		try {

			// �ٿ�ε� ���� �ּ� �����
			String addr = "https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwj_lI3tm7fcAhXMerwKHSYfC2wQjRx6BAgBEAU&url=http%3A%2F%2Fwww.hankookilbo.com%2Fv%2F3304d91cfe236c623304d91cfe236c62&psig=AOvVaw0BTOHxBTSZHH3DfIj2twur&ust=1532502158867887";

			// addr���� ������ / ������ ���ڿ��� ��������
			// ������ /�� ��ġ�� ã���ϴ�.
			int idx = addr.lastIndexOf("/");

			// addr���� idx+1��° ���ں��� ��������
			String filename = addr.substring(idx + 1);
			// System.out.println(filename);

			// filename�� �̿��ؼ� ������ ���� ��� �����
			String filepath = "C:\\Users\\503-18\\Documents\\" + filename;

			// ������ �����ϴ��� Ȯ��
			if ((new File(filepath)).exists()) {
				System.out.println("������ �̹� �����մϴ�.");
			} else {
				// System.out.println("������ �������� �ʽ��ϴ�.");

				// ������ ��ü ����
				Thread th = new Thread() {
					public void run() {
						try {

							// �ٿ�ε� ���� URL �����
							URL url = new URL(addr);

							// ���� ��ü ����
							HttpURLConnection con = (HttpURLConnection) url.openConnection();

							// �ɼ� ����
							con.setConnectTimeout(20000);
							con.setUseCaches(false);

							// ����Ʈ ������ �ٿ�ε� �ޱ� ���� ��Ʈ�� ����
							BufferedInputStream bis = new BufferedInputStream(con.getInputStream());

							// �ٿ�ε� ���� ������ ����� ��Ʈ��
							PrintStream ps = new PrintStream(filepath);

							while (true) {
								
								//512 ����Ʈ ������ ������ �б�
								byte[] b = new byte[512];
								int r = bis.read(b);
								
								// ���� �����Ͱ� ������ �б� �ߴ�
								if (r <= 0) {
									break;
								}
								
								// ���� �����͸� ps�� �̿��ؼ� ����ϱ�
								ps.write(b,0,r);
							}

							// ���� ��������� ����
							ps.close();
							bis.close();
							con.disconnect();
							
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}
				};

				// ������ ����
				th.start();

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
