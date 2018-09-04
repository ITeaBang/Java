package cast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSend {

	public static void main(String[] args) {

		try {

			// ������ ��Ƽĳ��Ʈ ������ ����
			MulticastSocket ms = new MulticastSocket();

			// ���ڿ��� �Է¹ޱ� ���� ��ĳ�� �����
			Scanner sc = new Scanner(System.in);

			// �г��� �����ϱ�
			System.out.print("�г��� �Է� : ");
			String nickname = sc.nextLine();
			String str = nickname + "���� �����ϼ̽��ϴ�.";
			
			// ���� �ݺ��ؼ� �޼��� ������
			while (true) {
				System.out.print("�޼���(����� end) : ");
				String msg = sc.nextLine();

				if (msg.equals("end")) {
					msg = nickname + "���� �����ϼ̽��ϴ�.";

					// ������ ��Ŷ ����� - ����, ���� , ���� ���� �ּ�, ��Ʈ��ȣ
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
							InetAddress.getByName("230.100.50.5"), 9999);

					// ������ ����
					ms.send(dp);

					// ���ϰ� ��ĳ�� �ݱ� , if������ ������ ( break; , return; )
					ms.close();
					sc.close();
					break;

				} else {

					// �޼��� �����
					msg = nickname + " : " + msg;

					// ������ ��Ŷ ����� - ����, ���� , ���� ���� �ּ�, ��Ʈ��ȣ
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
							InetAddress.getByName("230.100.50.5"), 9999);

					// ������ ����
					ms.send(dp);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
