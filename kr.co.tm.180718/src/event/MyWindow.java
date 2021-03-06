package event;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

//윈도우 클래스 만들기
public class MyWindow extends JFrame {
	public MyWindow() {
		// 위치와 크기 설정
		setBounds(100, 100, 400, 400);
		// 제목 설정
		setTitle("스윙을 이용한 윈도우");
		// 종료 버튼 이벤트 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 패널을 생성
		JPanel panel = new JPanel();

		ImageIcon icon = new ImageIcon(
				"C:\\Users\\503-18\\Desktop\\이용자료\\이미지\\IPhoneIcon\\60x60 iphone size\\Red\\Chat.png");

		JLabel label = new JLabel(icon);
		// label.setIcon(icon);

		label.setToolTipText("안녕하세요");
		// TitledBorder border = new TitledBorder("경계선");
		EtchedBorder border = new EtchedBorder(Color.BLACK, Color.BLACK);
		label.setBorder(border);
		panel.add(label);
        JButton btn = new JButton("버튼");
        panel.add(btn);
		// 패널을 프레임에 부착
		add(panel);

		// 화면출력
		setVisible(true);

		// 반복 출력은 List, 배열, set을 이용한다.
		// 그림 파일 이름을 배열로 만들기 (크기 변경이 불가능하다.)
		// String[] images = { "heli1.png", "heli2.png", "heli3.png" };

		// 리스트로 만들기 (크기 변경이 가능하다.)
		ArrayList<String> list = new ArrayList<String>();
		list.add("heli1.png");
		list.add("heli2.png");
		list.add("heli3.png");

		// 이미지가 변경되는 동안에도 다른 작업을 진행해야하므로 이미지 변경은 스레드로 생성
		Thread th = new Thread() {
			public void run() {
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(50);
						// 배열로 반복문 만들기
						/*
						 * ImageIcon icon = new ImageIcon( "C:\\Users\\503-18\\Desktop\\이용자료\\이미지\\" +
						 * images[idx % images.length]);
						 */
						// 리스트로 반복문 만들기
						ImageIcon icon = new ImageIcon(
								"C:\\Users\\503-18\\Desktop\\이용자료\\이미지\\" + list.get(idx % list.size()));
						label.setIcon(icon);
						idx = idx + 1;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th.start();

	}
}
