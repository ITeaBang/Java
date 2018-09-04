package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class MyWindow extends Frame {
	public MyWindow()

	{
		setBackground(Color.BLACK);
		setSize(300, 300);
		setLocation(200, 200);
		setTitle("나의 첫번째 윈도우 프로그램");
		setVisible(true);

		/*
		 * Dialog dialog = new Dialog(this); dialog.setTitle("대화상자");
		 * dialog.setSize(200, 200);
		 */
        
		Button button1 = new Button("Yes");
		Thread th1 = new Thread() {
		
			public void run() {
				Color[] colors = { Color.YELLOW, Color.PINK, Color.ORANGE, Color.magenta, Color.green };
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						button1.setBackground(colors[idx % colors.length]);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
			th1.start();

		Button button2 = new Button("No");
		ColorThread th2 = new ColorThread(button2);
		th2.start();

		TextThread th3 = new TextThread(button1);
		th3.start();

		TextThread th4 = new TextThread(button2);
		th4.start();

		Panel panel = new Panel();
		button1.setBackground(Color.BLUE);
		button2.setBackground(Color.RED);
		button1.setSize(300, 200);
		button2.setSize(300, 200);
		button1.setForeground(Color.WHITE);
		button2.setForeground(Color.WHITE);
		panel.add(button1);
		panel.add(button2);
		// 패널을 프레임에 추가
		add(panel);
		setVisible(true);
	}
}
