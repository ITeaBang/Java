package lang;

import java.io.IOException;

public class Practice4 {

	public static void main(String[] args) {
		Runtime r= Runtime.getRuntime();
		try {
			r.exec("mspaint.exe C:\\Users\\503-18\\Desktop\\Rainbow.jpg"); 
			//("실행파일 파일경로");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

