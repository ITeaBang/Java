package cast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class BroadCastSend {

	public static void main(String[] args) {
		try {

			// UDP 전송을 위한 소켓 생성
			DatagramSocket ds = new DatagramSocket();

			// 스캐너를 이용해서 닉네임 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("닉네임 입력 : ");
			String nick = sc.nextLine();
			String msg = nick + "님이 전송할 준비가 되었습니다.";

			// 닉네임 전송
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
					InetAddress.getByName("192.168.0.255"), 7777);
			ds.send(dp);

			while (true) {

				// 메세지 전송
				System.out.println("메세지 : ");
				msg = sc.nextLine();
				msg = nick + ":" + msg;
				dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, InetAddress.getByName("192.168.0.255"),
						7777);

				ds.send(dp);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
