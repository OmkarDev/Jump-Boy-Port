import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;

import utils.Utils;
import static javax.swing.JOptionPane.showMessageDialog;
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

	public static void main(String[] args) throws URISyntaxException {
		Utils.jar_folder = (getJarDirectory().toString());
		Utils.res_folder = Utils.jar_folder + "/" + "res";
		File directory = new File(Utils.res_folder);
		if (directory.exists() == false) {
			showMessageDialog(null, "resource folder not found at jar location: "+Utils.jar_folder);
			System.exit(0);
		}
		new rocket();
	}
	private static Path getJarDirectory() throws URISyntaxException {
		Path jarPath = Paths.get(rocket.class.getProtectionDomain().getCodeSource().getLocation().toURI())
				.toAbsolutePath();
		return jarPath.getParent();
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
