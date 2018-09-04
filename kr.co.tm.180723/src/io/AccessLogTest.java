package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class AccessLogTest {

	public static void main(String[] args) {
		// 1. BufferedReader ��ü �����
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./access_log.txt"));
			// 2. �� ������ ������ �о ���
			// 4. HashMap�� �̿��ؼ� ������ IP�� Ƚ���� ���
			HashMap<String, Integer> map = new HashMap<>();
			// 5. HashMap�� �̿��� IP�� Ʈ������ �հ踦 �����ؼ� ���
			HashMap<String, Integer> traffic = new HashMap<>();

			while (true) {

				String line = br.readLine();
				if (line == null) {
					break;
				}
				// System.out.println(line);
				String[] ar = line.split(" ");
				// System.out.println(ar[0]);
				// 3. IP�� ����� �����͸� �����ͼ� IP�� ���� Ƚ���� ���
				Integer count = map.get(ar[0]);
				// ����� �����Ͱ� ������ 1�� �����մϴ�.
				if (count == null) {
					map.put(ar[0], 1);
				}
				// ����� �����Ͱ� ������ 1�� ���ؼ� �����մϴ�.
				else {
					map.put(ar[0], count + 1);
				}
				Integer traf = traffic.get(ar[0]);
				if (traf == null) {
					if (!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
						traffic.put(ar[0], Integer.parseInt(ar[9]));
					}
				} else {
					if (!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
						traffic.put(ar[0], traf + Integer.parseInt(ar[9]));
					}
				}

			}
			// ���� ��� �����͸� ���
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				System.out.println(key + ":" + map.get(key));
			}

			System.out.println("=======================");
			keySet = traffic.keySet();
			for (String key : keySet) {
				System.out.println(key + ":" + traffic.get(key));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}
	}

}
