package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {
	// ��ȭ�� Ȯ��
	public static void main(String[] args) {
		try {
			// ���� ���� ����
			ServerSocket ss = new ServerSocket(9996);
			while (true) {
				System.out.println("���� ��� ��");
				// Ŭ���̾�Ʈ�� ���� ��� - Ŭ���̾�Ʈ�� �����ϸ� Ŭ���̾�Ʈ���� ����� ���� Socket�� �����ϰ� ���� ���� �ڵ� ����
				Socket socket = ss.accept();
				// �� ���� �����͸� �о ���
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg = br.readLine();
				System.out.println("�޽��� :" + msg);
				System.out.println("������ :" + socket.getInetAddress());
				br.close();
				socket.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

		}
	}

}