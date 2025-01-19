package utils;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

import javax.imageio.ImageIO;

public class Image {

	public static java.awt.Image createImage(String string) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(Utils.deepCopy(new FileInputStream(Utils.res_folder+string)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return img;
	}

	public static void drawImage(Graphics g, java.awt.Image img, int x, int y, int anchor) {
		if (anchor == 20 || anchor == 0) {
			g.drawImage(img, x, y, null);
		} else if (anchor == 17) {
			g.drawImage(img, x - (img.getWidth(null) / 2), y, null);
		} else {
			System.err.println("Anchor: " + anchor);
			System.exit(-1);
		}

	}

}
