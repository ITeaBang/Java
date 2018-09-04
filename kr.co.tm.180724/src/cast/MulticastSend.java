package cast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSend {

	public static void main(String[] args) {

		try {

			// 보내는 멀티캐스트 소켓을 생성
			MulticastSocket ms = new MulticastSocket();

			// 문자열을 입력받기 위한 스캐너 만들기
			Scanner sc = new Scanner(System.in);

			// 닉네임 설정하기
			System.out.print("닉네임 입력 : ");
			String nickname = sc.nextLine();
			String str = nickname + "님이 입장하셨습니다.";
			
			// 무한 반복해서 메세지 보내기
			while (true) {
				System.out.print("메세지(종료는 end) : ");
				String msg = sc.nextLine();

				if (msg.equals("end")) {
					msg = nickname + "님이 퇴장하셨습니다.";

					// 보내는 패킷 만들기 - 내용, 길이 , 받을 곳의 주소, 포트번호
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
							InetAddress.getByName("230.100.50.5"), 9999);

					// 데이터 전송
					ms.send(dp);

					// 소켓과 스캐너 닫기 , if절에서 끝내기 ( break; , return; )
					ms.close();
					sc.close();
					break;

				} else {

					// 메세지 만들기
					msg = nickname + " : " + msg;

					// 보내는 패킷 만들기 - 내용, 길이 , 받을 곳의 주소, 포트번호
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
							InetAddress.getByName("230.100.50.5"), 9999);

					// 데이터 전송
					ms.send(dp);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
