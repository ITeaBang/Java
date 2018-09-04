package frame;

import java.awt.Button;

public class TextThread extends Thread {
	private Button button;

	public TextThread(Button button) {

		this.button = button;
	}

	public void run() {
		String[] ar = { "Java", "Oracle", "Python", "BackEnd", "FrontEnd" };
		int idx = 0;
		while (true) {

			try {
				idx = idx + 1;
				button.setLabel(ar[idx % ar.length]);
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
