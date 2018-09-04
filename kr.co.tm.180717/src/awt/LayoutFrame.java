package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.util.Random;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		// ��ġ�� ũ�⸦ ����
		setBounds(100, 100, 400, 500);

		// ������
		setTitle("���̾ƿ� ����");

		// panel ����
		Panel panel = new Panel();

		/*
		 * //FlowLayout ���� panel.setLayout(new FlowLayout());
		 * 
		 * // ������Ʈ ��ġ for (int i = 1; i <= 10; i = i + 1) { Button btn = new Button("��ư"
		 * + i); panel.add(btn); }
		 * 
		 * //BorderLayout ���� panel.setLayout(new BorderLayout()); Button btnEast = new
		 * Button("����"); panel.add("East", btnEast); Button btnWest = new Button("����");
		 * panel.add("West", btnWest); Button btnSouth = new Button("����");
		 * panel.add("South", btnSouth); Button btnNorth = new Button("����");
		 * panel.add("North", btnNorth);
		 * 
		 * //GridLayout ���� panel.setLayout(new GridLayout(2,3,10,10)); for(int i =1;
		 * i<=10;i=i+1) { Button btn = new Button("��ư"+i); panel.add(btn); }
		 * 
		 * panel.setBackground(Color.BLACK); panel.setForeground(Color.BLACK);
		 */
		// null ����
		// ������Ʈ�� ũ��� ��ġ�� ������� ������ �� �ִ�.
		panel.setLayout(null);
		Label label = new Label("@");
		label.setBounds(10, 20, 30, 50);
		add(label);

		// �г� �߰�
		add(panel);
		setResizable(false);
		// ȭ�� ���
		setVisible(true);
		Thread th = new Thread() {
			public void run() {
				// ���ѹݺ�
				while (true) {
					// ���� ���̺��� ��ġ�� ��������
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
