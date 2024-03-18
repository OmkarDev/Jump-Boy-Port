import javax.swing.JFrame;

//import javax.microedition.lcdui.Display;
//import javax.microedition.lcdui.Displayable;
//import javax.microedition.midlet.MIDlet;

public class rocket {
	public static rocket a;
	public static boolean b = true;
	private b d;

	public rocket() {
		a = this;
		JFrame frame = new JFrame("Jump Boy");
		this.d = new b(frame);

		frame.add(d.canvas);
		frame.pack();
		frame.setFocusable(true);
		frame.requestFocus();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.addKeyListener(d);
		d.thread.start();
	}

	public static void main(String[] args) {
		new rocket();
	}

	public void startApp() {
		a = this;
//      Display.getDisplay(this).setCurrent(this.d);
	}

	public void pauseApp() {
	}

	public void destroyApp(boolean var1) {
//      a.notifyDestroyed();
		a = null;
	}
}
