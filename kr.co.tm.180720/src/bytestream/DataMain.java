package bytestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataMain {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\503-18\\Desktop\\이용자료\\access_log.txt"));

			// 줄 단위로 데이터를 이어붙일 StringBuilder 생성
			ArrayList<String> iplist = new ArrayList<>();
			// 중복없이 저장하기 위한 set 만들기 <=> list는 중복 존재
			Set<String> ipset = new HashSet<String>();

			while (true) {

				// 한 줄을 읽기
				String line = br.readLine();

				// 읽은 데이터가 없으면 종료
				if (line == null) {
					break;
				}

				// 공백으로 분할
				String[] ar = line.split(" ");
				// System.out.println(ar[0]);
				ipset.add(ar[0]);
				iplist.add(ar[0]);
			}

			for (String ip : ipset) {
				System.out.println(ip);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
