import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSONParsing {

	public static void main(String[] args) {
		
		// 스레드 생성
		Thread th = new Thread() {
			public void run() {
				
				// 스레드로 수행할 내용 작성
				try {
					
					// 다운로드 받을 URL 생성
					URL url = new URL(
							"http://apis.daum.net/search/book?apikey=465b06fae32febacbc59502598dd7685&output=json&q=java");

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

					// sb의 내용을 json에 대입
					String json = sb.toString();
					
					// json 출력
					System.out.println(json);
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

			}

		};
		th.start();

	}

}
