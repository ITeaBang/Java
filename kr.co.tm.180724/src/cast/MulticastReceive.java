package cast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;


public class MulticastReceive {

	public static void main(String[] args) {

		try {
			
			// 받는 멀티캐스트 소켓 만들기
			MulticastSocket ms = new MulticastSocket(9999);
			
			// 그룹에 참여
			ms.joinGroup(InetAddress.getByName("230.100.50.5"));
			
			// 무한 반복해서 메세지 받기
			while (true) {
				
				// 바이트 배열 생성
				byte [] b = new byte[512];
				
				// 데이터를 전송받을 패킷 만들기
				DatagramPacket dp = new DatagramPacket(b, 512);
				
				// 데이터 받기 - 데이터가 올 때까지 대기
				ms.receive(dp);
				
				// 바이트 배열을 문자열로 변환하기
				String msg = new String(b);
				
				// 화면에 공백을 제거하고 출력
				System.out.println(msg.trim());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
