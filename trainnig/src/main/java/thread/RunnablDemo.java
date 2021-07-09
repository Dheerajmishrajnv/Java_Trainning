package thread;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;

public class RunnablDemo extends Applet implements Runnable {
	Thread t;
	String str;

	public void init() {
		t = new Thread(this);
		str = "";
		t.start();

	}

	public void run() {
		while (true) {
			str = new Date().toString();

			try {
				t.sleep(1000);                 
			} catch (Exception e) {
				e.getStackTrace();
			}
			repaint();
		}
	}

	public void paint(Graphics g) {
		g.drawString(str, 100, 100);
	}

}
