import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class JSONParsing3 {

	public static void main(String[] args) {
		// 스레드 생성
		Thread th = new Thread() {
			public void run() {

				// 스레드로 수행할 내용 작성
				try {

					// 다운로드 받을 URL 생성
					URL url = new URL(
							"http://www.kma.go.kr/weather/forecast/mid-term-xml.jsp?stnId=109");

					// URL 연결 객체 생성
					HttpURLConnection con = (HttpURLConnection) url.openConnection();

					// 옵션 설정
					// 캐시 설정 여부 - 다운로드 받아놓고 다음에 다운로드 받은 데이터를 이용할 것인지 여부를 설정
					con.setUseCaches(false);

					// 얼마동안 접속을 시도해 볼 것인지를 설정
					con.setConnectTimeout(30000);

					// 문자열을 읽기 위한 스트림 생성
					BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

					// BufferedReader 객체를 이용해서 줄 단위로 읽어서 하나의 문자열을 생성
					StringBuilder sb = new StringBuilder();
					while (true) {
						String line = br.readLine();
						if (line == null)
							break;
						sb.append(line);
					}

					// sb의 내용을 xml에 대입
					String xml = sb.toString();

					// xml 문자열을 파싱할 수 있는 객체를 생성
					DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
					DocumentBuilder builder = factory.newDocumentBuilder();
					
					// 파싱할 문자열을 스트림으로 변환
					InputStream is = new ByteArrayInputStream(xml.getBytes());
					
					// 문자열을 파싱 수행 - org.w3c.dom
					Document doc = builder.parse(is);
					
					// 루트 찾기 - org.w3c.dom
					Element root = doc.getDocumentElement();
					// System.out.println(root);

					// tmx 태그 전부 찾기
					NodeList list = root.getElementsByTagName("tmx");
				    // System.out.println(list);
					
					int i = 0;
					while (i < list.getLength()) {
						
						Node item = list.item(i);
						
						// 첫번째 자식 찾기
						Node child = item.getFirstChild();
						
						// 데이터 찾기
						String tmx = child.getNodeValue();
					   
						// 데이터 출력
						System.out.println(tmx);
						
						i=i+1;
					}
					
					
					
					
					
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

			}

		};
		th.start();

	}

}
