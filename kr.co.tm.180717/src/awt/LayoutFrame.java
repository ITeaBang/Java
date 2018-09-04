package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.util.Random;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		// 위치와 크기를 설정
		setBounds(100, 100, 400, 500);

		// 제목설정
		setTitle("레이아웃 연습");

		// panel 생성
		Panel panel = new Panel();

		/*
		 * //FlowLayout 설정 panel.setLayout(new FlowLayout());
		 * 
		 * // 컴포넌트 배치 for (int i = 1; i <= 10; i = i + 1) { Button btn = new Button("버튼"
		 * + i); panel.add(btn); }
		 * 
		 * //BorderLayout 설정 panel.setLayout(new BorderLayout()); Button btnEast = new
		 * Button("동쪽"); panel.add("East", btnEast); Button btnWest = new Button("서쪽");
		 * panel.add("West", btnWest); Button btnSouth = new Button("남쪽");
		 * panel.add("South", btnSouth); Button btnNorth = new Button("북쪽");
		 * panel.add("North", btnNorth);
		 * 
		 * //GridLayout 설정 panel.setLayout(new GridLayout(2,3,10,10)); for(int i =1;
		 * i<=10;i=i+1) { Button btn = new Button("버튼"+i); panel.add(btn); }
		 * 
		 * panel.setBackground(Color.BLACK); panel.setForeground(Color.BLACK);
		 */
		// null 설정
		// 컴포넌트의 크기와 위치를 마음대로 변경할 수 있다.
		panel.setLayout(null);
		Label label = new Label("@");
		label.setBounds(10, 20, 30, 50);
		add(label);

		// 패널 추가
		add(panel);
		setResizable(false);
		// 화면 출력
		setVisible(true);
		Thread th = new Thread() {
			public void run() {
				// 무한반복
				while (true) {
					// 현재 레이블의 위치를 가져오기
					int x = label.getLocation().x;
					int y = label.getLocation().y;
					//label.setLocation(x+10,y+10);
					Random r = new Random();
					label.setLocation(r.nextInt(300),r.nextInt(300));
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th.start();

	}
}
