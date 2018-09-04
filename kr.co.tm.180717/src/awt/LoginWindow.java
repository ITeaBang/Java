package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class LoginWindow extends Frame {
	// 생성자 - 인스턴스를 만들 때 호출하는 메소드
	public LoginWindow() {
		// 크기, 위치 및 타이틀 설정
		setSize(500, 500);
		setLocation(200, 200);
		setTitle("로그인");

		// 패널을 생성
		Panel panel = new Panel();

		Label lblId = new Label("아이디");
		TextField txtId = new TextField(10);
		panel.add(lblId);
		panel.add(txtId);

		Label lblPw = new Label("비밀번호");
		TextField txtPw = new TextField(10);
		txtPw.setEchoChar('*');
		panel.add(lblPw);
		panel.add(txtPw);

		// 여러 줄 입력할 수 있는 텍스트 영역 만들기
		TextArea ta = new TextArea(10, 30);
		panel.add(ta);

		// 패널을 프레임에 부착
		add(panel);
		
		// 메뉴 바 만들기
		MenuBar menuBar = new MenuBar();
		
		//메뉴 바를 윈도우에 배치
		setMenuBar(menuBar);
		
		//메뉴 생성
		Menu file = new Menu("파일(F)");
		Menu edit = new Menu("편집(E)");
		Menu font = new Menu("서식(O)");
		
		//메뉴를 메뉴 바에 부착
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(font);
		
		MenuItem newFile = new MenuItem("새로 만들기(N)...");
		file.add(newFile);
		MenuItem openFile = new MenuItem("열기(O)");
		file.add(openFile);
		MenuItem copy = new MenuItem("복사");
		edit.add(copy);
		
		// 화면 출력
		setVisible(true);
	}

}
