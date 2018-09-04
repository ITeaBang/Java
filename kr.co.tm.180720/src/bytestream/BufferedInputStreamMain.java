package bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamMain {

	public static void main(String[] args) {
		// 파일에서 바이트 단위로 버퍼링을 이용해서 읽기
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("C:\\Users\\503-18\\Desktop\\이용자료\\이미지\\소녀시대1.png"));
			while (true) {
				byte[] b = new byte[1024];
				int r = bis.read(b);
				
				// byte로 출력
				/*for (byte temp : b) {
					System.out.println(temp);
				}*/

				// 문장열로 출력
				// System.out.println(new String(b));
				
				if (r <= 0) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		} finally {
			// 예외 발생 여부에 상관없이 수행할 구문
			try {
				if (bis != null)
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
