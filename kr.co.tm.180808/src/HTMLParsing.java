import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParsing {
	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				try {
					URL url = new URL("https://tv.naver.com/");
					HttpURLConnection con = (HttpURLConnection)url.openConnection();
					con.setUseCaches(false);
					con.setConnectTimeout(30000);
					
					BufferedReader br = new BufferedReader(
							new InputStreamReader(con.getInputStream()));
							
					StringBuilder sb = new StringBuilder();
					while(true) {
						String line = br.readLine();
						if(null==line) {
							break;
						}
						sb.append(line+"\n");
					}
					
					//
					String html = sb.toString();
					
					//
					sb = null;
					
					// 
					br.close();
					con.disconnect();
					
					// HTML 루트 찾기
					Document doc = Jsoup.parse(html);
					
					// tooltip 태그 전체 가져오기
					Elements elements = doc.getElementsByTag("tooltip");
					/*
					 * Elements elements = doc.getElementsClass("screen_out");
					 */
					
					int i=0;
					while(i<elements.size()) {
						
						// 데이터 1개 가져오기
						Element element = elements.get(i);
						// 태그 안의 데이터 가져오기
						System.out.println(element.text());
						
						i++;
					}
//					System.out.println(html);
				} catch(Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		};
		
		th.start();
	}
}