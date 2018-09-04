package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {
	// 생성자 - 인스턴스를 생성할 때 호출하는 메소드
	public CommonsDialog() {
		// 위치와 크기를 설정
		setBounds(200, 200, 600, 600);
		// 제목 설정
		setTitle("공통 대화 상자");
		// FileDialog 객체를 생성해서 화면에 출력하고 선택한 파일 경로를 레이블에 출력
		// FileDialog를 생성할 때 첫번째 매개변수가 Dialog나 Frame의 주소인데
		// 지금의 경우는 this를 대입하면 된다.
		FileDialog fileDialog = new FileDialog(this);
		// 화면출력
		fileDialog.setVisible(true);
		// 선택한 디렉토리와 파일이름을 가져오기
		String filePath = fileDialog.getDirectory() + fileDialog.getFile();
		
		// 레이블 생성
		Label label = new Label (filePath);
		add(label);
		
		// 화면 출력
		setVisible(true);
	}
}
