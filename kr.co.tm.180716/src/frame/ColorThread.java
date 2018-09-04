package frame;

import java.awt.Button;
import java.awt.Color;

public class ColorThread extends Thread {
	private Button button;

	public ColorThread(Button button) {
		this.button = button;
	}

	public void run() {
		Color[] colors = { Color.YELLOW, Color.PINK, Color.ORANGE, Color.magenta, Color.green };
		int idx = 0;
		while (true) {
			try {
				Thread.sleep(1000);
				idx = idx + 1;
				button.setBackground(colors[idx % colors.length]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
