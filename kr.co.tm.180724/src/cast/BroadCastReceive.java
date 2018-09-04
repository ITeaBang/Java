package cast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class BroadCastReceive {

	public static void main(String[] args) {
		try {

			// UDP ������� �����͸� ���۹��� �� �ִ� ���� �����
			// ��Ʈ ��ȣ�� �ʼ�
			// 1024���� �Ѱܼ� ��Ʈ ��ȣ�� ����
			DatagramSocket ds = new DatagramSocket(7777);
			System.out.println("���� ��� ��");

			while (true) {

				// �޼����� ������ �迭 ����
				byte[] b = new byte[512];

				// �޼����� ������ DatagramPacket ����
				DatagramPacket dp = new DatagramPacket(b, 512);

				// ������ �ޱ�
				ds.receive(dp);

				// ������ �б�
				String msg = new String(b);

				// 512 Byte�� �ȵɽ� ������ �����ϱ� ���ؼ� trim()�� ȣ��
				System.out.println(msg.trim());

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
