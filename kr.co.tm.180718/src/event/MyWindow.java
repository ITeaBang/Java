package event;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

//������ Ŭ���� �����
public class MyWindow extends JFrame {
	public MyWindow() {
		// ��ġ�� ũ�� ����
		setBounds(100, 100, 400, 400);
		// ���� ����
		setTitle("������ �̿��� ������");
		// ���� ��ư �̺�Ʈ ó��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �г��� ����
		JPanel panel = new JPanel();

		ImageIcon icon = new ImageIcon(
				"C:\\Users\\503-18\\Desktop\\�̿��ڷ�\\�̹���\\IPhoneIcon\\60x60 iphone size\\Red\\Chat.png");

		JLabel label = new JLabel(icon);
		// label.setIcon(icon);

		label.setToolTipText("�ȳ��ϼ���");
		// TitledBorder border = new TitledBorder("��輱");
		EtchedBorder border = new EtchedBorder(Color.BLACK, Color.BLACK);
		label.setBorder(border);
		panel.add(label);
        JButton btn = new JButton("��ư");
        panel.add(btn);
		// �г��� �����ӿ� ����
		add(panel);

		// ȭ�����
		setVisible(true);

		// �ݺ� ����� List, �迭, set�� �̿��Ѵ�.
		// �׸� ���� �̸��� �迭�� ����� (ũ�� ������ �Ұ����ϴ�.)
		// String[] images = { "heli1.png", "heli2.png", "heli3.png" };

		// ����Ʈ�� ����� (ũ�� ������ �����ϴ�.)
		ArrayList<String> list = new ArrayList<String>();
		list.add("heli1.png");
		list.add("heli2.png");
		list.add("heli3.png");

		// �̹����� ����Ǵ� ���ȿ��� �ٸ� �۾��� �����ؾ��ϹǷ� �̹��� ������ ������� ����
		Thread th = new Thread() {
			public void run() {
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(50);
						// �迭�� �ݺ��� �����
						/*
						 * ImageIcon icon = new ImageIcon( "C:\\Users\\503-18\\Desktop\\�̿��ڷ�\\�̹���\\" +
						 * images[idx % images.length]);
						 */
						// ����Ʈ�� �ݺ��� �����
						ImageIcon icon = new ImageIcon(
								"C:\\Users\\503-18\\Desktop\\�̿��ڷ�\\�̹���\\" + list.get(idx % list.size()));
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
