//package none;

//import javax.microedition.lcdui.Displayable;
//import javax.microedition.rms.RecordEnumeration;
//import javax.microedition.rms.RecordStoreException;
//import javax.microedition.rms.RecordComparator;
//import javax.microedition.rms.RecordFilter;
//import javax.microedition.rms.RecordStore;
//import javax.microedition.lcdui.Font;
//import javax.microedition.lcdui.Graphics;
//import javax.microedition.lcdui.Image;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public final class b implements Runnable, KeyListener {
	private Random a;
	private static int scrn_width = 176;
	private static int scrn_height = 220;
	private static int[] d;
	private static int[] e;
	private int[] f;
	private int[] g;
//	private Vector h;
	private int[] rankings;
	private int j;
	private static Image k;
	private static Image l;
	private static boolean canRun;
	private int n;
	private int o;
	private short p;
	private short level_no;
	private boolean r;
	private int time_remaining;
	private int t;
	private short u;
	private int v;
	private int w;
	private int x;
	private int y;
	private int z;
	private int A;
	private short B;
	private short C;
	private short D;
	private short lifes;
	private short breaks;
	private short G;
	private short[][] H;
	private short[][] I;
	private boolean J;
	private boolean K;
	private Image L;
	private Image M;
	private Image N;
	private Image O;
	private Image P;
	private Image Q;
	private Image R;
	private Image S;
	private Image T;
	private Image[] U;
	private Image V;
	private Image W;
	private Image X;
	private Image Y;
	private Image Z;
	private Image aa;
	private Image ab;
	private Image ac;
	private Image ad;
	private Image ae;
	private Image af;
	private Image ag;
	private static String[] ah;
	private static int[] ai;
	private static int[] aj;
	private byte ak;
	private byte al;
	private Image am;
	private Image an;
	private Image ao;
	private Image ap;
	private Image aq;
	private Image ar;
	private Image as;
	private Image at;
	private Image au;
	private Image sound_icon_img;
	private Image aw;
	private Image ax;
	private Image ay;
	private int[] az;
	private int[] aA;
	private int[] aB;
	private int[] aC;
	private int[] aD;
	private int[] aE;
	private int[] aF;
	private int[] aG;
	private int[] aH;
	private int[] aI;
	private int[] aJ;
	private int[] aK;
	private int[] aL;
	private int[] aM;
	private int[] aN;
	private int[] aO;
	private int[] aP;
	private int[] aQ;
	private long aR;
	private int aS;
	private int aT;
	private int aU;
	private short[][] aV;
	private short[][] aW;
	private short[][] aX;
	private short[][] aY;
	private short[][] aZ;
	private short[][] ba;
	private short[][] bb;
	private short[][] bc;
	private short[][] bd;
	private short[][] be;
	private short[][] bf;
	private short[][] bg;
	private short[][] bh;
	private short[][] bi;
	private short[][] bj;
	private short[][] bk;
	private short[][] bl;
	private short[][] bm;
	private short[][] bn;
	private short[][] bo;
	private short[][] bp;
	private short[][] bq;
	private short[][] br;
	private short[][] bs;
	private a bt;
	private int bu;
	private long bv;
	private long bw;
	private boolean bx;
	private int by;
	private int bz;
//	private int bA;
	private static boolean bB;
	private int bC;
	private byte bD;
	private byte bE;
	private int bF;
	private int bG;
	private int bH;
	private short bI;
	private int bJ;
	private short bK;
	private boolean bL;
	private byte bM;
	private static String bN;
	private AudioInputStream musicBGStream, musicDieStream;
	public static Clip bg_clip, die_clip;

	private void a() {
		InputStream bg_music;
		InputStream musicDie;
		try {
			bg_music = new FileInputStream(new File(getClass().getResource("music.mid").toURI()));
			musicDie = new FileInputStream(new File(getClass().getResource("musicDie.mid").toURI()));
			musicBGStream = AudioSystem.getAudioInputStream(new BufferedInputStream(bg_music));
			musicDieStream = AudioSystem.getAudioInputStream(new BufferedInputStream(musicDie));
			bg_clip = AudioSystem.getClip();
			bg_clip.open(musicBGStream);
			die_clip = AudioSystem.getClip();
			die_clip.open(musicDieStream);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final String s = b.ah[this.ak];
		this.ar = utils.Image.createImage("/" + s + "/menu_" + s + ".png");
		this.as = utils.Image.createImage("/" + s + "/gamemenu_" + s + ".png");
		this.au = utils.Image.createImage("/" + s + "/soft_" + s + ".png");
		this.sound_icon_img = utils.Image.createImage("/" + s + "/sound_" + s + ".png");
		if (this.ak != 7) {
			this.W = utils.Image.createImage("/act.png");
			this.L = utils.Image.createImage("/title.png");
			this.aa = utils.Image.createImage("/brand.png");
			this.ag = utils.Image.createImage("/" + s + "/stage_clear_" + s + ".png");
		} else {
			this.W = utils.Image.createImage("/" + s + "/act_cn.png");
			this.L = utils.Image.createImage("/" + s + "/title_cn.png");
			this.aa = utils.Image.createImage("/" + s + "/brand_cn.png");
			this.ag = utils.Image.createImage("/" + s + "/stage_clear_cn.png");
		}
		if (scrn_width > 200) {
			this.af = utils.Image.createImage("/select.png");
		} else {
			this.af = utils.Image.createImage("/" + s + "/select_" + s + ".png");
		}
		if (scrn_width != 240) {
			if (this.ak != 6 && this.ak != 4) {
				this.aw = utils.Image.createImage("/" + s + "/help_" + s + "_0.png");
				this.ax = utils.Image.createImage("/" + s + "/help_" + s + "_1.png");
			} else {
				this.aw = utils.Image.createImage("/" + s + "/help_" + s + "_0.png");
				this.ax = utils.Image.createImage("/" + s + "/help_" + s + "_1.png");
				this.ay = utils.Image.createImage("/" + s + "/help_" + s + "_2.png");
			}
		} else {
			if (this.ak == 0) {
				this.aw = utils.Image.createImage("/" + s + "/help_" + s + "_0.png");
				return;
			}
			this.aw = utils.Image.createImage("/" + s + "/help_" + s + "_0.png");
			this.ax = utils.Image.createImage("/" + s + "/help_" + s + "_1.png");
		}
	}

	private void a(final Graphics graphics, final int n, int height) {
		height = this.au.getHeight(null);
		int[] array = null;
		int[] array2 = null;
		switch (this.ak) {
		default: {
			if (scrn_width != 240 && scrn_width != 176) {
				array = this.az;
				array2 = this.aA;
				break;
			}
			array = this.aB;
			array2 = this.aC;
			break;
		}
		case 1: {
			array = this.aD;
			array2 = this.aE;
			break;
		}
		case 2: {
			array = this.aF;
			array2 = this.aG;
			break;
		}
		case 3: {
			array = this.aH;
			array2 = this.aI;
			break;
		}
		case 4: {
			array = this.aJ;
			array2 = this.aK;
			break;
		}
		case 5: {
			array = this.aL;
			array2 = this.aM;
			break;
		}
		case 6: {
			array = this.aN;
			array2 = this.aO;
			break;
		}
		case 7: {
			array = this.aP;
			array2 = this.aQ;
			break;
		}
		}
		graphics.setColor(new Color(3890886));
		if (this.ak != 7) {
			graphics.setClip(0, scrn_height - 12, scrn_width, 12);
			graphics.fillRect(0, scrn_height - 12, scrn_width, 12);
		} else {
			graphics.setClip(0, scrn_height - 14, scrn_width, 14);
			graphics.fillRect(0, scrn_height - 14, scrn_width, 14);
		}
		if (scrn_width > 200) {
			if (n != 0) {
				if (this.ak != 7) {
					graphics.setClip(3, scrn_height - 12 + 3, array2[n], height);
					utils.Image.drawImage(graphics, this.au, 3 - array[n], scrn_height - 12 + 3, 20);
				} else {
					graphics.setClip(3, scrn_height - 14, array2[n], height);
					utils.Image.drawImage(graphics, this.au, 3 - array[n], scrn_height - 14, 20);
				}
			}
			if (this.ak != 7) {
				graphics.setClip(scrn_width - 3 - array2[1], scrn_height - 12 + 3, array2[1], height);
				utils.Image.drawImage(graphics, this.au, scrn_width - 3 - array2[1] - array[1], scrn_height - 12 + 3,
						20);
				return;
			}
			graphics.setClip(scrn_width - 3 - array2[1], scrn_height - 14, array2[1], height);
			utils.Image.drawImage(graphics, this.au, scrn_width - 3 - array2[1] - array[1], scrn_height - 14, 20);
		} else {
			if (n != 0) {
				if (this.ak != 7) {
					graphics.setClip(3, scrn_height - 12 + 3, array2[n], height);
					utils.Image.drawImage(graphics, this.au, 3 - array[n], scrn_height - 12 + 3, 20);
				} else {
					graphics.setClip(3, scrn_height - 14, array2[n], height);
					utils.Image.drawImage(graphics, this.au, 3 - array[n], scrn_height - 14, 20);
				}
			}
			if (this.ak != 7) {
				graphics.setClip(scrn_width - 3 - array2[1], scrn_height - 12 + 3, array2[1], height);
				utils.Image.drawImage(graphics, this.au, scrn_width - 3 - array2[1] - array[1], scrn_height - 12 + 3,
						20);
				return;
			}
			graphics.setClip(scrn_width - 3 - array2[1], scrn_height - 14, array2[1], height);
			utils.Image.drawImage(graphics, this.au, scrn_width - 3 - array2[1] - array[1], scrn_height - 14, 20);
		}
	}

	Canvas canvas;
	public Thread thread;

	double pixel_size = 2.4;

	public JFrame frame;

	public b(JFrame frame) {
		this.frame = frame;
		canvas = new Canvas();
		thread = new Thread(this);
		canvas.setSize((int) (176 * pixel_size), (int) (220 * pixel_size) + frame.getInsets().top);
		this.a = new Random();
		this.f = b.d;
		this.g = b.e;
//		this.h = new Vector();
		this.rankings = new int[5];
		utils.Font.getFont(this.j = 0, 0, 8);
		this.r = false;
		this.time_remaining = 1000;
		this.u = 0;
		this.v = 20;
		this.w = 100;
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.A = 0;
		this.B = 0;
		this.C = 0;
		this.D = 0;
		this.H = new short[300][3];
		this.I = new short[3][4];
		this.J = false;
		this.K = false;
		this.U = new Image[2];
		this.az = new int[] { 0, 0, 26, 40, 66, 92 };
		this.aA = new int[] { 0, 26, 14, 26, 26, 35 };
		this.aB = new int[] { 0, 0, 33, 50, 83, 116 };
		this.aC = new int[] { 0, 33, 17, 33, 33, 34 };
		this.aD = new int[] { 0, 0, 55, 72, 105, 192, 249 };
		this.aE = new int[] { 0, 54, 16, 32, 86, 56, 48 };
		this.aF = new int[] { 0, 0, 47, 64, 100, 141, 172 };
		this.aG = new int[] { 0, 46, 16, 32, 40, 30, 60 };
		this.aH = new int[] { 0, 0, 33, 48, 71, 95, 141 };
		this.aI = new int[] { 0, 33, 15, 23, 24, 46, 47 };
		this.aJ = new int[] { 0, 0, 49, 66, 99, 138, 194 };
		this.aK = new int[] { 0, 48, 16, 32, 38, 48, 48 };
		this.aL = new int[] { 0, 0, 22, 34, 57, 113, 154 };
		this.aM = new int[] { 0, 21, 11, 22, 55, 40, 38 };
		this.aN = new int[] { 0, 0, 45, 62, 93, 144, 166 };
		this.aO = new int[] { 0, 45, 17, 31, 51, 22, 22 };
		this.aP = new int[] { 0, 0, 26, 53, 80, 108 };
		this.aQ = new int[] { 0, 26, 27, 27, 28, 39 };
		this.aS = 0;
		this.aT = 0;
		this.aU = 0;
		this.aX = new short[2][8];
		this.aY = new short[3][5];
		this.aZ = new short[][] { { 0, 20, 155, 0, 136, 90 }, { 0, 56, 90, 0, 184, 193 }, { 0, 104, 193, 0, 16, 56 },
				{ 0, 16, 56, 2, 170, 74 }, { 2, 122, 74, 0, 16, 130 }, { 0, 16, 130, 0, 160, 38 },
				{ 0, 32, 38, 1, 133, 90 }, { 1, 37, 90, 0, 16, 197 }, { 0, 16, 197, 1, 150, 136 },
				{ 1, 38, 136, 2, 143, 68 }, { 2, 15, 68, 2, 120, 60 }, { 2, 40, 60, 1, 200, 132 },
				{ 1, 8, 132, 2, 89, 190 }, { 2, 57, 190, 1, 153, 123 }, { 1, 89, 123, 0, 165, 74 },
				{ 0, 18, 74, 3, 123, 179 } };
		this.ba = new short[][] { { 0, 20, 180, 0, 126, 94 }, { 0, 62, 94, 4, 188, 143 }, { 4, 76, 143, 0, 0, 108 },
				{ 0, 0, 108, 1, 153, 74 }, { 1, 153, 74, 0, 106, 150 }, { 0, 14, 150, 1, 94, 88 },
				{ 1, 6, 88, 1, 96, 133 }, { 1, 32, 133, 1, 200, 67 }, { 1, 24, 67, 4, 98, 163 },
				{ 4, 25, 163, 4, 67, 48 }, { 4, 3, 48, 1, 150, 155 }, { 1, 38, 155, 1, 56, 132 },
				{ 1, 80, 132, 4, 50, 66 }, { 4, 50, 66, 1, 80, 165 }, { 1, 80, 165, 1, 165, 74 },
				{ 1, 21, 74, 3, 95, 188 } };
		this.bb = new short[][] { { 0, 50, 97, 2, 200, 74 }, { 2, 40, 74, 0, 175, 143 }, { 0, 47, 143, 2, 110, 156 },
				{ 2, 14, 156, 1, 96, 74 }, { 1, 24, 74, 0, 200, 97 }, { 0, 8, 97, 1, 94, 144 },
				{ 1, 14, 144, 1, 96, 74 }, { 1, 32, 74, 1, 200, 97 }, { 1, 12, 97, 2, 125, 136 },
				{ 2, 29, 136, 2, 168, 48 }, { 2, 8, 48, 1, 140, 80 }, { 1, 44, 80, 1, 156, 132 },
				{ 0, 44, 132, 2, 150, 190 }, { 2, 54, 190, 1, 80, 58 }, { 1, 80, 58, 1, 96, 174 },
				{ 1, 16, 174, 3, 95, 95 } };
		this.bc = new short[][] { { 0, 0, 200, 2, 96, 74 }, { 2, 32, 74, 0, 175, 143 }, { 0, 77, 143, 2, 0, 156 },
				{ 2, 0, 156, 1, 96, 74 }, { 1, 16, 74, 0, 180, 97 }, { 0, 100, 97, 1, 24, 144 },
				{ 1, 6, 144, 1, 96, 74 }, { 1, 32, 74, 1, 100, 97 }, { 1, 20, 97, 2, 125, 136 },
				{ 2, 61, 136, 2, 167, 48 }, { 2, 103, 48, 1, 180, 80 }, { 1, 100, 80, 1, 156, 132 },
				{ 1, 70, 132, 2, 150, 90 }, { 2, 70, 90, 1, 80, 158 }, { 1, 80, 158, 1, 96, 74 },
				{ 1, 16, 74, 3, 100, 195 } };
		this.bd = new short[][] { { 0, 0, 97, 1, 96, 74 }, { 1, 32, 74, 0, 135, 143 }, { 0, 87, 143, 2, 0, 56 },
				{ 2, 0, 56, 1, 196, 74 }, { 1, 116, 74, 0, 0, 197 }, { 0, 0, 197, 1, 145, 44 },
				{ 1, 81, 44, 1, 194, 74 }, { 1, 119, 74, 1, 0, 97 }, { 1, 0, 97, 2, 99, 136 },
				{ 2, 28, 136, 2, 167, 48 }, { 2, 98, 48, 1, 180, 180 }, { 1, 132, 180, 1, 56, 132 },
				{ 1, 40, 132, 2, 150, 190 }, { 2, 70, 190, 1, 80, 58 }, { 1, 80, 58, 1, 196, 74 },
				{ 1, 110, 74, 3, 195, 95 } };
		this.be = new short[][] { { 0, 0, 177, 1, 196, 94 }, { 1, 132, 94, 2, 35, 143 }, { 2, 35, 143, 0, 200, 156 },
				{ 0, 120, 156, 1, 96, 74 }, { 1, 16, 74, 0, 100, 97 }, { 0, 4, 97, 0, 94, 144 },
				{ 0, 14, 144, 1, 196, 74 }, { 1, 148, 74, 0, 0, 97 }, { 0, 0, 97, 1, 125, 136 },
				{ 1, 66, 136, 2, 67, 48 }, { 2, 3, 48, 1, 80, 180 }, { 1, 32, 180, 1, 156, 132 },
				{ 1, 92, 132, 2, 150, 90 }, { 2, 70, 90, 1, 80, 158 }, { 1, 80, 158, 0, 96, 74 },
				{ 0, 16, 74, 3, 195, 95 } };
		this.bf = new short[][] { { 0, 20, 180, 0, 126, 94 }, { 0, 62, 94, 2, 188, 143 }, { 2, 76, 143, 0, 0, 108 },
				{ 0, 0, 108, 1, 153, 74 }, { 1, 153, 74, 0, 106, 150 }, { 0, 14, 150, 1, 94, 88 },
				{ 1, 6, 88, 1, 96, 133 }, { 1, 32, 133, 1, 200, 67 }, { 1, 24, 67, 2, 98, 163 },
				{ 2, 25, 163, 2, 67, 48 }, { 2, 3, 48, 1, 150, 155 }, { 1, 38, 155, 1, 56, 132 },
				{ 1, 80, 132, 2, 50, 66 }, { 2, 50, 66, 1, 80, 165 }, { 1, 80, 165, 1, 165, 74 },
				{ 1, 21, 74, 3, 95, 188 } };
		this.bg = new short[][] { { 0, 50, 97, 2, 200, 74 }, { 2, 40, 74, 0, 175, 143 }, { 0, 47, 143, 2, 110, 156 },
				{ 2, 14, 156, 1, 96, 74 }, { 1, 24, 74, 0, 200, 97 }, { 0, 8, 97, 1, 94, 144 },
				{ 1, 14, 144, 1, 96, 74 }, { 1, 32, 74, 1, 200, 97 }, { 1, 12, 97, 2, 125, 136 },
				{ 2, 29, 136, 2, 168, 48 }, { 2, 8, 48, 1, 140, 80 }, { 1, 44, 80, 1, 156, 132 },
				{ 1, 44, 132, 2, 150, 170 }, { 2, 54, 170, 1, 80, 58 }, { 1, 80, 58, 1, 96, 174 },
				{ 1, 16, 174, 3, 95, 95 } };
		this.bh = new short[][] { { 0, 0, 155, 0, 96, 90 }, { 0, 32, 90, 2, 200, 193 }, { 2, 72, 193, 0, 0, 56 },
				{ 0, 0, 56, 2, 170, 74 }, { 2, 74, 74, 0, 0, 130 }, { 0, 0, 130, 2, 120, 68 }, { 2, 8, 68, 1, 133, 90 },
				{ 1, 37, 90, 0, 0, 187 }, { 0, 0, 187, 1, 150, 136 }, { 1, 38, 136, 2, 143, 68 },
				{ 2, 15, 68, 2, 120, 60 }, { 2, 40, 60, 1, 200, 132 }, { 1, 8, 132, 2, 89, 170 },
				{ 2, 57, 170, 1, 153, 123 }, { 1, 89, 123, 0, 165, 74 }, { 0, 18, 74, 3, 123, 179 } };
		this.bi = new short[][] { { 0, 0, 155, 0, 96, 90 }, { 0, 32, 90, 2, 200, 193 }, { 2, 72, 193, 0, 0, 56 },
				{ 0, 0, 56, 2, 170, 74 }, { 2, 74, 74, 0, 0, 130 }, { 0, 0, 130, 2, 120, 68 }, { 2, 8, 68, 1, 133, 90 },
				{ 1, 37, 90, 0, 0, 177 }, { 0, 0, 177, 1, 150, 136 }, { 1, 38, 136, 2, 143, 68 },
				{ 2, 15, 68, 2, 120, 60 }, { 2, 40, 60, 1, 200, 132 }, { 1, 8, 132, 2, 89, 190 },
				{ 2, 57, 190, 1, 153, 123 }, { 1, 89, 123, 0, 165, 74 }, { 0, 18, 74, 3, 123, 179 } };
		this.bj = new short[][] { { 1, 54, 99, 3, 10, 50, 0, 68, 68 }, { 1, 126, 99, 1, 86, 109, 2, 106, 129 },
				new short[0], { 3, 10, 50 }, new short[0], { 1, 36, 87 }, { 3, 10, 50 }, new short[0], { 1, 84, 109 },
				{ 3, 10, 50 }, new short[0], new short[0], { 0, 68, 68 }, { 2, 82, 40 }, { 3, 10, 50 }, new short[0] };
		this.bk = new short[][] { { 1, 54, 99, 3, 10, 50, 0, 68, 68 }, { 1, 64, 99, 1, 49, 49, 2, 52, 52 },
				new short[0], { 3, 10, 50 }, new short[0], { 1, 36, 87 }, { 3, 10, 50 }, new short[0], { 1, 84, 109 },
				{ 3, 10, 50 }, new short[0], new short[0], { 0, 68, 68 }, { 2, 82, 40 }, { 3, 10, 50 }, new short[0] };
		this.bl = new short[][] { { 1, 154, 67, 3, 10, 50, 0, 100, 68 }, { 1, 124, 99, 1, 149, 49, 2, 152, 82 },
				{ 3, 10, 60 }, { 3, 10, 50 }, new short[0], { 1, 60, 107 }, { 3, 10, 50 }, { 3, 10, 50, 0, 100, 68 },
				{ 1, 84, 109 }, { 3, 10, 50 }, new short[0], new short[0], { 0, 88, 110 }, { 2, 82, 40 }, { 3, 10, 50 },
				new short[0] };
		this.bm = new short[][] { { 1, 54, 99, 3, 10, 50, 0, 68, 68 }, { 1, 146, 99, 1, 149, 49, 2, 152, 66 },
				new short[0], { 3, 10, 50 }, new short[0], { 1, 36, 87 }, { 3, 10, 50 }, new short[0], { 1, 84, 109 },
				{ 3, 10, 50 }, new short[0], new short[0], { 0, 88, 68 }, { 2, 82, 40 }, { 3, 10, 50 }, new short[0] };
		this.bn = new short[][] { { 1, 88, 40, 3, 10, 50, 0, 68, 68 }, { 1, 120, 120, 1, 110, 49, 2, 99, 100 },
				new short[0], { 3, 10, 50 }, new short[0], { 1, 36, 87 }, { 3, 10, 50 }, new short[0], { 1, 84, 109 },
				{ 3, 10, 50 }, new short[0], new short[0], { 0, 100, 68 }, { 2, 82, 40 }, { 3, 10, 50 }, new short[0] };
		this.bo = new short[][] { { 1, 180, 80, 3, 10, 50, 0, 168, 68 }, { 1, 80, 120, 1, 110, 49, 2, 68, 100 },
				new short[0], { 3, 10, 50 }, new short[0], { 1, 36, 87 }, { 3, 10, 50 }, new short[0], { 1, 84, 109 },
				{ 3, 10, 50 }, new short[0], new short[0], { 0, 100, 68 }, { 2, 82, 40 }, { 3, 10, 50 }, new short[0] };
		this.bp = new short[][] { { 1, 88, 40, 3, 10, 50, 0, 68, 68 }, { 1, 120, 120, 1, 110, 49, 2, 99, 100 },
				new short[0], { 3, 10, 50 }, new short[0], { 1, 36, 87 }, { 3, 10, 50 }, new short[0], { 1, 84, 109 },
				{ 3, 10, 50 }, new short[0], new short[0], { 0, 100, 68 }, { 2, 82, 40 }, { 3, 10, 50 }, new short[0] };
		this.bq = new short[][] { { 1, 88, 40, 3, 10, 50, 0, 68, 68 }, { 1, 120, 120, 1, 110, 49, 2, 99, 100 },
				new short[0], { 3, 10, 50 }, new short[0], { 1, 36, 87 }, { 3, 10, 50 }, new short[0], { 1, 84, 109 },
				{ 3, 10, 50 }, new short[0], new short[0], { 0, 100, 68 }, { 2, 82, 40 }, { 3, 10, 50 }, new short[0] };
		this.br = new short[][] { { 1, 88, 40, 3, 10, 50, 0, 68, 68 }, { 1, 120, 120, 1, 110, 49, 2, 99, 100 },
				new short[0], { 3, 10, 50 }, new short[0], { 1, 36, 87 }, { 3, 10, 50 }, new short[0], { 1, 84, 109 },
				{ 3, 10, 50 }, new short[0], new short[0], { 0, 100, 68 }, { 2, 82, 40 }, { 3, 10, 50 }, new short[0] };
		this.bs = new short[][] { { 1, 88, 40, 3, 10, 50, 0, 68, 68 }, { 1, 120, 120, 1, 110, 49, 2, 99, 100 },
				new short[0], { 3, 10, 50 }, new short[0], { 1, 36, 87 }, { 3, 10, 50 }, new short[0], { 1, 84, 109 },
				{ 3, 10, 50 }, new short[0], new short[0], { 0, 100, 68 }, { 2, 82, 40 }, { 3, 10, 50 }, new short[0] };
		this.bt = new a();
		this.bu = 18;
		this.bw = 0L;
		this.bx = false;
		this.by = 0;
		this.bz = 8;
//		this.bA = 0;
		this.bD = 0;
		this.bE = 0;
//		final String[] array = { "Continue", "Help", "Setting", "Quit" };
		this.bG = 1;
		this.bH = 90;
		if (d()) {
			this.c();
		}
		this.e();
		b.canRun = true;
		this.aU = 8888;
//        this.setFullScreenMode(true);
		this.aS = 3;
		if (d()) {
			this.a();
			this.aS = 0;
		} else {
			this.ak = 0;
			this.a();
			this.aS = 11;
		}
		this.f();
		this.aT = 0;
		this.g();
		this.bt.loadLevelNo();
	}

	private void b_void() {
		byte tmp = (byte) aj[al];
		ak = tmp;
		try {
			byte[] data = getBytesFromSave();
			data[0] = ak;
			FileOutputStream write_data = new FileOutputStream(new File("res/data/data.bin"));
			write_data.write(data);
			write_data.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void c() {
		this.ak = 0;
		try {
			byte[] data = getBytesFromSave();
			ak = data[0];
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static boolean d() {
		DataInputStream data;
		try {
			data = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("res/data/data.bin"))));
			byte b = getBytesFromSave()[0];
			if (b == (byte) 0xFF) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private void e() {
		scrn_width = 176;
		scrn_height = 220;
		this.f = b.d;
		this.g = b.e;
		b_void_short_array2d(this.aZ);
		b_void_short_array2d(this.ba);
		b_void_short_array2d(this.bb);
		b_void_short_array2d(this.bc);
		b_void_short_array2d(this.bd);
		b_void_short_array2d(this.be);
		b_void_short_array2d(this.bf);
		b_void_short_array2d(this.bg);
		b_void_short_array2d(this.bh);
		b_void_short_array2d(this.bi);
		a(this.bj);
		a(this.bk);
		a(this.bl);
		a(this.bm);
		a(this.bn);
		a(this.bo);
		a(this.bp);
		a(this.bq);
		a(this.br);
		a(this.bs);
		if (scrn_width == 128) {
			this.bu = 9;
		}
	}

	private static void a(final short[][] array) {
		final int n = scrn_width - 30;
		short[] array2;
		for (int n2 = 0; n2 < array.length && (array2 = array[n2]) != null && array2.length != 0; ++n2) {
			for (int n3 = array2.length / 3, i = 0; i < n3; ++i) {
				if (array2[i * 3] != 3) {
					short n4;
					if ((n4 = (short) (array2[i * 3 + 1] * n / 176)) < 0) {
						n4 = 0;
					} else if (n4 > n) {
						n4 = (short) n;
					}
					array2[i * 3 + 1] = n4;
				}
			}
		}
	}

	// why never used???
	private static void b_void_short_array2d(final short[][] array) {
		final int n = scrn_width - 30;
		final int scrn_height = b.scrn_height;
		for (int i = 0; i < array.length; ++i) {
			final short[] array3;
			final short[] array2 = array3 = array[i];
			final int n2 = 2;
			array2[n2] += 50;
			final short[] array4 = array3;
			final int n3 = 5;
			array4[n3] += 50;
			if (scrn_height < 200) {
				array3[2] = (short) (array3[2] * scrn_height / 320);
				array3[5] = (short) (array3[5] * scrn_height / 320);
			} else if (scrn_height < 290) {
				array3[2] = (short) (array3[2] * scrn_height / 320);
				array3[5] = (short) (array3[5] * scrn_height / 320);
			}
			if (array3[2] > 300) {
				array3[2] = 290;
			}
			if (array3[5] > 300) {
				array3[5] = 290;
			}
			short n4 = (short) (array3[1] * n / 240);
			while (array3[1] > n4) {
				final short[] array5 = array3;
				final int n5 = 1;
				array5[n5] -= 16;
			}
			n4 = (short) (array3[4] * n / 240);
			while (array3[4] > n4) {
				final short[] array6 = array3;
				final int n6 = 4;
				array6[n6] -= 16;
			}
			if (i > 0 && (n4 = (short) (array[i - 1][4] - array[i][1])) % 16 != 0) {
				final short[] array7 = array3;
				final int n7 = 1;
				array7[n7] += (short) (n4 % 16);
			}
			while (array3[1] < 0) {
				final short[] array8 = array3;
				final int n8 = 1;
				array8[n8] += 16;
			}
			while (array3[4] < 0) {
				final short[] array9 = array3;
				final int n9 = 4;
				array9[n9] += 16;
			}
			if (array3[1] - array3[4] < 16 && array3[1] - array3[4] > -16) {
				if (array3[1] > 16) {
					final short[] array10 = array3;
					final int n10 = 1;
					array10[n10] -= 16;
				}
				if (array3[4] < scrn_width - 16) {
					final short[] array11 = array3;
					final int n11 = 4;
					array11[n11] += 16;
				}
			}
		}
	}
	
	public static byte[] getBytesFromSave() {
		byte[] data = null;
		try {
			data = Files.readAllBytes(Paths.get(b.class.getResource("/data/data.bin").toURI()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	private void render() {
		BufferStrategy bs = canvas.getBufferStrategy();
		if (bs == null) {
			canvas.createBufferStrategy(3);
			return;
		}
		Graphics2D g = (Graphics2D) bs.getDrawGraphics();
		g.scale(pixel_size, pixel_size);
		paint(g);
		if (canvas.hasFocus()) {
			if (frame.hasFocus() == false) {
				frame.requestFocus();
			}
		}
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
		bs.show();
	}

	public final void paint(final Graphics2D graphics) {
		switch (this.aS) {
		case 0: {
			this.f();
			this.a(graphics);
			break;
		}
		case 11: {
			final b b = this;
			final int n = (scrn_width - b.am.getWidth(null)) / 2;
			graphics.setClip(0, 0, scrn_width, scrn_height);
			graphics.setColor(new Color(0));
			utils.Image.drawImage(graphics, b.T, 0, 0, 20);
			graphics.setColor(new Color(16777215));
			b.n = 0;
			while (b.n < aj.length) {
				if (scrn_width == 240) {
					final int n2 = (scrn_height - b.am.getHeight(null)) / 2 - 30;
					graphics.setClip(0, n2 + b.n * 25, scrn_width, 20);
					utils.Image.drawImage(graphics, b.am, n, n2 + b.n * 25 - 20 * aj[b.n], 20);
					if (b.n == b.al) {
						graphics.setClip(0, n2 + b.n * 25 + 5, scrn_width, 20);
						utils.Image.drawImage(graphics, b.aq, n - 20, n2 + b.n * 25 + 5, 20);
					}
				} else if (scrn_width == 176) {
					final int n2 = (scrn_height - b.am.getHeight(null)) / 2;
					graphics.setClip(0, n2 + b.n * 20, scrn_width, 13);
					utils.Image.drawImage(graphics, b.am, n + 10, n2 + b.n * 20 - 13 * aj[b.n], 20);
					if (b.n == b.al) {
						utils.Image.drawImage(graphics, b.aq, n - 20, n2 + b.n * 20 + 2, 20);
					}
				} else {
					final int n2 = (scrn_height - b.am.getHeight(null)) / 2 + 10;
					graphics.setClip(0, n2 + b.n * 20 + 20, scrn_width, 13);
					utils.Image.drawImage(graphics, b.am, n + 10, n2 + b.n * 20 - 13 * aj[b.n] + 20, 20);
					if (b.n == b.al) {
						utils.Image.drawImage(graphics, b.aq, n - 20, n2 + b.n * 20 + 20 + 2, 20);
					}
				}
				final b b2 = b;
				++b2.n;
			}
			switch (b.aU) {
			case -1: {
				final b b3 = b;
				--b3.al;
				if (b.al < 0) {
					b.al = (byte) (aj.length - 1);
					break;
				}
				break;
			}
			case -2: {
				final b b4 = b;
				++b4.al;
				if (b.al >= aj.length) {
					b.al = 0;
					break;
				}
				break;
			}
			case -5:
			case 53: {
				b.aS = 0;
				b.aT = 0;
				b.b_void();
				b.a();
				b.aR = 0L;
				break;
			}
			}
			b.aU = 8888;
			break;
		}
		case 1: {
			final b b5 = this;
			int n = 0;
			if (scrn_height < 200) {
				n = -20;
			}
			switch (b5.aT) {
			case 0: {
				graphics.setClip(0, 0, scrn_width, scrn_height);
				graphics.setColor(new Color(0));
				graphics.fillRect(0, 0, scrn_width, scrn_height);
				graphics.setColor(new Color(0));
				graphics.setClip(0, 0, scrn_width, scrn_height);
				utils.Image.drawImage(graphics, b5.L, 0, 0, 0);
				int i = scrn_height / 2 + 38 + n + 30 - 3;
				if (scrn_width == 176) {
					graphics.setColor(new Color(16711680));
					utils.Image.drawImage(graphics, b5.M, (scrn_width - b5.ar.getWidth(null)) / 2 - 10, i - 7 + 7, 20);
					utils.Image.drawImage(graphics, b5.N, (scrn_width + b5.ar.getWidth(null)) / 2 + 4, i - 7 + 7, 20);
					graphics.setFont(utils.Font.getFont(0, 0, 16));
					i -= 25;
				} else if (scrn_width == 128) {
					graphics.setColor(new Color(16711680));
					utils.Image.drawImage(graphics, b5.M, (scrn_width - b5.ar.getWidth(null)) / 2 - 10, i - 7, 20);
					utils.Image.drawImage(graphics, b5.N, (scrn_width + b5.ar.getWidth(null)) / 2 + 4, i - 7, 20);
					graphics.setFont(utils.Font.getFont(0, 0, 16));
				} else {
					graphics.setColor(new Color(16711680));
					graphics.fillArc(scrn_width / 2 - 90 - 5, scrn_height / 2 + 40 + 60 + n - 25, 15, 8, 90, 180);
					graphics.fillArc(scrn_width / 2 + 80 + 5, scrn_height / 2 + 40 + 60 + n - 25, 15, 8, 270, 180);
					graphics.setFont(utils.Font.getFont(0, 0, 16));
				}
				graphics.setColor(new Color(0, 0, 255));
				if (scrn_width == 240) {
					if (b5.ak != 5 && b5.ak != 7 && b5.ak != 6) {
						graphics.setClip(0, i + 10, scrn_width, 11);
						utils.Image.drawImage(graphics, b5.ar, scrn_width / 2, i + 10 - 11 * b5.bD, 17);
					} else if (b5.ak == 7) {
						graphics.setClip(0, i + 7, scrn_width, 16);
						utils.Image.drawImage(graphics, b5.ar, scrn_width / 2, i + 7 - 16 * b5.bD, 17);
					} else if (b5.ak == 6) {
						graphics.setClip(0, i + 5, scrn_width, 18);
						utils.Image.drawImage(graphics, b5.ar, scrn_width / 2, i + 5 - 18 * b5.bD, 17);
					} else {
						graphics.setClip(0, i + 8, scrn_width, 17);
						utils.Image.drawImage(graphics, b5.ar, scrn_width / 2, i + 8 - 17 * b5.bD, 17);
					}
				} else if (scrn_width == 176) {
					if (b5.ak != 6 && b5.ak != 5) {
						graphics.setClip(0, i + 27, scrn_width, 7);
						utils.Image.drawImage(graphics, b5.ar, scrn_width / 2, i + 27 - 7 * b5.bD, 17);
					} else if (b5.ak == 5) {
						graphics.setClip(0, i + 25, scrn_width, 10);
						utils.Image.drawImage(graphics, b5.ar, scrn_width / 2, i + 25 - 10 * b5.bD, 17);
					} else {
						graphics.setClip(0, i + 23, scrn_width, 13);
						utils.Image.drawImage(graphics, b5.ar, scrn_width / 2, i + 23 - 13 * b5.bD, 17);
					}
				} else if (b5.ak != 6 && b5.ak != 7) {
					graphics.setClip(0, i - 6, scrn_width, 7);
					utils.Image.drawImage(graphics, b5.ar, scrn_width / 2, i - 6 - 7 * b5.bD, 17);
				} else if (b5.ak == 7) {
					graphics.setClip(0, i - 8, scrn_width, 13);
					utils.Image.drawImage(graphics, b5.ar, scrn_width / 2, i - 8 - 13 * b5.bD, 17);
				} else {
					graphics.setClip(0, i - 9, scrn_width, 13);
					utils.Image.drawImage(graphics, b5.ar, scrn_width / 2, i - 9 - 13 * b5.bD, 17);
				}
				switch (b5.aU) {
				case -3: {
					if (b5.bD > 0) {
						final b b6 = b5;
						--b6.bD;
					} else {
						b5.bD = 5;
					}
					b5.aU = 8888;
					break;
				}
				case -4: {
					if (b5.bD < 5) {
						final b b7 = b5;
						++b7.bD;
					} else {
						b5.bD = 0;
					}
					b5.aU = 8888;
					break;
				}
				case -6:
				case -5:
				case 53: {
					b5.aT = b5.bD + 1;
					if (b5.aT == 3) {
						for (int j = 0; j < b.aj.length; ++j) {
							if (b.aj[j] == b5.ak) {
								b5.al = (byte) j;
							}
						}
						b5.bC = 0;
					}
					b5.aU = 8888;
					break;
				}
				}
				break;
			}
			case 1: {
				m();
				b5.aS = 5;
				b5.aT = 0;
				b5.aU = 8888;
				break;
			}
			case 2: {
				final b b9;
				final b b8 = b9 = b5;
				b8.bF = 1 - b9.bF;
				graphics.setColor(new Color(13408563));
				graphics.setClip(0, 0, scrn_width, scrn_height);
				graphics.fillRect(0, 260, scrn_width, 60);
				utils.Image.drawImage(graphics, b9.W, 0, 0, 20);
				graphics.setColor(new Color(255, 0, 0));
				graphics.setFont(utils.Font.getFont(0, 0, 8));
				if (b9.level_no >= 0 && b9.level_no < 10) {
					a(graphics, b9.f[b9.level_no], b9.g[b9.level_no] + 2 * b9.bF, b9.U[0], 216, 0, 27, 30, 20);
				} else {
					// changed from 0 to something
					b9.level_no = 0;
					a(graphics, b9.f[b9.level_no], b9.g[b9.level_no] + 2 * b9.bF, b9.U[0], 216, 0, 27, 30, 20);
				}
				graphics.setClip(0, 0, scrn_width, scrn_height);
				b9.a(graphics, 2, 1);
				switch (b9.aU) {
				case -3: {
					if (b9.level_no > 0) {
						final b b10 = b9;
						--b10.level_no;
						b9.aU = 8888;
						break;
					}
					break;
				}
				case -4: {
					if (b9.level_no < 9 && b9.level_no < b9.bt.levels_reached) {
						final b b11 = b9;
						++b11.level_no;
						b9.aU = 8888;
						break;
					}
					break;
				}
				case -6:
				case -5: {
					m();
					if (b9.level_no == 0) {
						b9.aS = 5;
						b9.aT = 0;
						b9.aU = 8888;
						break;
					}
					b9.j = 0;
					b9.breaks = 3;
					b9.G = 15;
					b9.lifes = 0;
					b9.p = 15;
					final b b12 = b9;
					--b12.level_no;
					b9.a(0);
					b9.aS = 2;
					b9.aT = 0;
					break;
				}
				case -7: {
					m();
					b9.aS = 1;
					b9.aT = 0;
					b9.aU = 8888;
					break;
				}
				}
				break;
			}
			case 3: {
				b5.c(graphics);
				break;
			}
			case 4: {
				utils.Image.drawImage(graphics, b5.T, 0, 0, 20);
				if (scrn_width > 200) {
					graphics.setFont(utils.Font.getFont(0, 1, 16));
					graphics.setColor(new Color(0));
					n = "1          00000".length() * b5.bz;
					for (int i = 0; i <= 4; ++i) {
						int j = 0;
						if (b5.rankings[i] < 10000) {
							j += 8;
						}
						if (b5.rankings[i] < 1000) {
							j += 8;
						}
						if (b5.rankings[i] < 100) {
							j += 8;
						}
						if (b5.rankings[i] < 10) {
							j += 8;
						}
						b5.a(graphics, 1, i + 1 + "          ", (scrn_width - n) / 2, 80 + i * 30);
						b5.a(graphics, 1, "" + b5.rankings[i], (scrn_width - n) / 2 + 11 * b5.bz + j, 80 + i * 30);
					}
				} else if (scrn_width > 128) {
					graphics.setFont(utils.Font.getFont(0, 1, 16));
					graphics.setColor(new Color(0));
					n = "1          00000".length() * b5.bz;
					for (int i = 0; i <= 4; ++i) {
						int j = 0;
						if (b5.rankings[i] < 10000) {
							j += 8;
						}
						if (b5.rankings[i] < 1000) {
							j += 8;
						}
						if (b5.rankings[i] < 100) {
							j += 8;
						}
						if (b5.rankings[i] < 10) {
							j += 8;
						}
						b5.a(graphics, 1, i + 1 + "          ", (scrn_width - n) / 2, 60 + i * 20);
						b5.a(graphics, 1, "" + b5.rankings[i], (scrn_width - n) / 2 + 11 * b5.bz + j, 60 + i * 20);
					}
				} else {
					graphics.setFont(utils.Font.getFont(0, 1, 0));
					graphics.setColor(new Color(0));
					n = "1    00000".length() * b5.bz;
					for (int i = 0; i <= 4; ++i) {
						int j = 0;
						if (b5.rankings[i] < 10000) {
							j += 8;
						}
						if (b5.rankings[i] < 1000) {
							j += 8;
						}
						if (b5.rankings[i] < 100) {
							j += 8;
						}
						if (b5.rankings[i] < 10) {
							j += 8;
						}
						b5.a(graphics, 1, i + 1 + "  ", (scrn_width - n) / 2, 50 + i * 18);
						b5.a(graphics, 1, "" + b5.rankings[i], (scrn_width - n) / 2 + 5 * b5.bz + j, 50 + i * 18);
					}
				}
				graphics.setClip(0, 0, scrn_width, scrn_height);
				graphics.setColor(new Color(0));
				graphics.setFont(utils.Font.getFont(0, 0, 16));
				b5.a(graphics, 0, 1);
				switch (b5.aU) {
				case -7: {
					b5.aS = 1;
					b5.aT = 0;
					b5.aU = 8888;
					break;
				}
				}
				break;
			}
			case 5: {
				if (b5.a(graphics, b5.aw, b5.ax, b5.ay) != 0) {
					b5.aT = 0;
					break;
				}
				break;
			}
			case 6: {
				b.canRun = false;
				break;
			}
			case 7: {
				if (b5.a(graphics, b5.aw, b5.ax, b5.ay) != 0) {
					b5.aT = 0;
					break;
				}
				break;
			}
			case 8: {
				b5.c(graphics);
				break;
			}
			}
			break;
		}
		case 2: {
			this.d(graphics);
			break;
		}
		case 4: {
			final b b13 = this;
			graphics.setClip(0, 0, scrn_width, scrn_height);
			graphics.setColor(new Color(0));
			graphics.fillRect(0, 0, scrn_width, scrn_height);
			utils.Image.drawImage(graphics, b13.Q, (scrn_width - b13.Q.getWidth(null)) / 2,
					(scrn_height - b13.Q.getHeight(null)) / 2, 20);
			graphics.setFont(utils.Font.getFont(0, 1, 16));
			graphics.setColor(new Color(255, 255, 0));
			graphics.setFont(utils.Font.getFont(0, 1, 8));
			final String string = Integer.toString(b13.j);
			b13.a(graphics, 1, string, (scrn_width - string.length() * b13.bz) / 2,
					(scrn_height - b13.Q.getHeight(null)) / 2 + b13.Q.getHeight(null) + 10);
			graphics.setClip(0, 0, scrn_width, scrn_height);
			graphics.setFont(utils.Font.getFont(0, 1, 8));
			b13.a(graphics, 0, 1);
			if (b13.aU == -7) {
				b13.h();
				l();
				b13.aS = 1;
				b13.aT = 0;
				b13.aU = 8888;
			}
			break;
		}
		case 6: {
			l();
			final b b14;
			if ((b14 = this).bH > -10) {
				final b b15 = b14;
				--b15.bH;
			} else {
				b14.bH = 40;
			}
			b14.bG = 0 - b14.bG;
			final int n = Math.abs(b14.a.nextInt()) % 3;
			graphics.setClip(0, 0, scrn_width, scrn_height);
			graphics.setColor(new Color(16777113));
			graphics.fillRect(0, 0, scrn_width, scrn_height);
			utils.Image.drawImage(graphics, b14.R, (scrn_width - b14.R.getWidth(null)) / 2,
					(scrn_height - b14.R.getHeight(null)) / 2, 20);
			graphics.setClip(0, 0, scrn_width, scrn_height);
			graphics.setColor(new Color(16711680));
			utils.Image.drawImage(graphics, b14.ag, scrn_width / 2, (scrn_height - b14.R.getHeight(null)) / 2 - 30, 17);
			a(graphics, 75 + b14.bG * n, b14.bH, b14.ae, 0, 0, 12, 10, 20);
			graphics.setFont(utils.Font.getFont(0, 1, 8));
			graphics.setColor(new Color(0));
			b14.a(graphics, 0, 1);
			if (b14.aU == -7) {
				b14.h();
				b14.aS = 1;
				b14.aT = 0;
				b14.aU = 8888;
			}
			break;
		}
		case 5: {
			this.j();
			break;
		}
		}
		graphics.setClip(0, 0, canvas.getWidth(), canvas.getHeight());
		graphics.setColor(new Color(0));
		graphics.fillRect(0, scrn_height, canvas.getWidth(), canvas.getHeight() - scrn_height);
		graphics.fillRect(scrn_width, 0, canvas.getWidth() - scrn_width, scrn_height);
		graphics.setFont(utils.Font.getFont(0, 0, 8));
	}

	public final void run() {
		while (b.canRun) {
			try {
				this.render();
				this.bw = 60L - (System.currentTimeMillis() - this.bv);
				if (this.bw <= 0L) {
					this.bw = 15L;
				}
				Thread.sleep(this.bw);
				this.bv = System.currentTimeMillis();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		if (rocket.a != null) {
			rocket.a.destroyApp(true);
			System.exit(0);
		}
	}

	private void f() {
		try {
			if (this.T == null) {
				this.T = utils.Image.createImage("/background.png");
			}
			if (this.am == null) {
				this.am = utils.Image.createImage("/lang.png");
			}
			if (this.aq == null) {
				this.aq = utils.Image.createImage("/cursor_icon.png");
			}
		} catch (Exception ex) {
		}
	}

	protected final void showNotify() {
		if (this.aS == 2 && this.aT == 0) {
			this.render();
		}
	}

	public final void hideNotify() {
		l();
	}

	public final void keyPressed(final int au) {
		if (!rocket.b) {
			return;
		}
		if (au >= 48 && au <= 57) {
			switch (au) {
			case 50: {// num 2
				this.aU = -1;
				break;
			}
			case 56: {// num 8
				this.aU = -2;
				break;
			}
			case 52: {// num 4
				this.aU = -3;
				break;
			}
			case 54: {// num 6
				this.aU = -4;
				break;
			}
			case 53: {// num 5
				this.aU = 53;
				break;
			}
			case 48: {// num 0
				this.aU = 48;
				break;
			}
			}
			this.bx = true;
		} else {
			this.aU = au;
		}
		this.bx = true;
	}

	public final void keyReleased(final int au) {
		if (!this.bx) {
			this.aU = au;
			if (au == -7 || au == -6) {
				return;
			}
			switch (au) {
			case 50: {// num 2
				this.aU = -1;
				break;
			}
			case 56: {// num 8
				this.aU = -2;
				break;
			}
			case 52: {// num 4
				this.aU = -3;
				break;
			}
			case 54: {// num 6
				this.aU = -4;
				break;
			}
			case 53: {// num 5
				this.aU = 53;
				break;
			}
			}
		} else {
			this.aU = 8888;
		}
		this.bx = false;
	}

	private byte a(final Graphics graphics, final Image image, final Image image2, final Image image3) {
		graphics.setClip(0, 0, scrn_width, scrn_height);
		utils.Image.drawImage(graphics, this.T, 0, 0, 20);
		if (this.ak != 6 && this.ak != 4) {
			switch (this.by) {
			case 0: {
				utils.Image.drawImage(graphics, image, (scrn_width - image.getWidth(null)) / 2,
						(scrn_height - image.getHeight(null)) / 2, 20);
				break;
			}
			case 1: {
				utils.Image.drawImage(graphics, image2, (scrn_width - image2.getWidth(null)) / 2,
						(scrn_height - image2.getHeight(null)) / 2, 20);
				break;
			}
			}
		} else {
			switch (this.by) {
			case 0: {
				utils.Image.drawImage(graphics, image, (scrn_width - image.getWidth(null)) / 2,
						(scrn_height - image.getHeight(null)) / 2, 20);
				break;
			}
			case 1: {
				utils.Image.drawImage(graphics, image2, (scrn_width - image2.getWidth(null)) / 2,
						(scrn_height - image2.getHeight(null)) / 2, 20);
				break;
			}
			case 2: {
				utils.Image.drawImage(graphics, image3, (scrn_width - image3.getWidth(null)) / 2,
						(scrn_height - image3.getHeight(null)) / 2, 20);
				break;
			}
			}
		}
		graphics.setClip(0, 0, scrn_width, scrn_height);
		this.a(graphics, 0, 1);
		graphics.setClip(0, 0, scrn_width, scrn_height);
		if (scrn_width == 128) {
			utils.Image.drawImage(graphics, this.at, scrn_width / 2 - 5, 150, 20);
		} else if (scrn_width == 176) {
			utils.Image.drawImage(graphics, this.at, scrn_width / 2 - 5, 210, 20);
		} else if (this.ak != 0) {
			utils.Image.drawImage(graphics, this.at, scrn_width / 2 - 5, 310, 20);
		}
		switch (this.aU) {
		case -1: {
			if (this.ak != 6 && this.ak != 4) {
				break;
			}
			if (this.by > 0) {
				--this.by;
				break;
			}
			this.by = 1;
			break;
		}
		case -6:
		case -2: {
			if (scrn_width == 128 || scrn_width == 176) {
				if (this.ak == 6 || this.ak == 4) {
					if (this.by < 2) {
						++this.by;
						break;
					}
					this.by = 0;
					break;
				} else {
					if (this.by < 1) {
						++this.by;
						break;
					}
					this.by = 0;
					break;
				}
			} else {
				if (this.ak == 0) {
					this.by = 0;
					break;
				}
				if (this.by < 1) {
					++this.by;
					break;
				}
				this.by = 0;
				break;
			}
		}
		case -7:
		case 53: {
			if (this.aT == 7) {
				this.aS = 2;
			}
			this.aU = 8888;
			this.by = 0;
			return 1;
		}
		}
		this.aU = 8888;
		return 0;
	}

	private void a(final Graphics graphics, final int n, final String s, final int n2, final int n3) {
//		final int clipX = (int) graphics.getClipBounds().getX();
//		final int clipY = (int) graphics.getClipBounds().getY();
//		final int clipWidth = (int) graphics.getClipBounds().getWidth();
//		final int clipHeight = (int) graphics.getClipBounds().getHeight();
		for (int i = 0; i < s.length(); ++i) {
			int hashCode = s.substring(i, i + 1).hashCode();
			final int n4 = i * this.bz + n2;
			hashCode -= 32;
			if (n == 0) {
				graphics.setClip(n4, n3, this.bz, b.k.getHeight(null));
				utils.Image.drawImage(graphics, b.k, n4 - hashCode * this.bz, n3, 20);
			}
			if (n == 1) {
				graphics.setClip(n4, n3, this.bz, b.l.getHeight(null));
				utils.Image.drawImage(graphics, b.l, n4 - (hashCode - 16) * this.bz, n3, 20);
			}
		}
		graphics.setClip(0, 0, scrn_width, scrn_height);
		// graphics.setClip(clipx,clipy,cliw,cliph);
	}

	private static void a(final Graphics graphics, final int n, final int n2, final Image image, final int n3,
			final int n4, final int n5, final int n6, final int n7) {
		if (image == null) {
			return;
		}
		final int[] array = { (int) graphics.getClip().getBounds().getX(), (int) graphics.getClip().getBounds().getY(),
				(int) graphics.getClip().getBounds().getWidth(), (int) graphics.getClip().getBounds().getHeight() };
		graphics.setClip(n, n2, n5, n6);
		utils.Image.drawImage(graphics, image, n - n3, n2 - n4, 20);
		graphics.setClip(array[0], array[1], array[2], array[3]);
	}

	private void g() {
		try {
			byte[] scores = getBytesFromSave();
			for (int j = 0; j < 5; j++) {
				int b1 = scores[(2 + 4 * j)] & 0xFF;
				int b2 = scores[(2 + 4 * j) + 1] & 0xFF;
				int b3 = scores[(2 + 4 * j) + 2] & 0xFF;
				int b4 = scores[(2 + 4 * j) + 3] & 0xFF;
				int score = (b1 << 24) | (b2 << 16) | (b3 << 8) | b4;
				this.rankings[j] = score;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// sorts out and puts into ranking array
		int n = 0;
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 4 - i; ++j) {
				if (this.rankings[j] < this.rankings[j + 1]) {
					n = this.rankings[j];
					this.rankings[j] = this.rankings[j + 1];
					this.rankings[j + 1] = n;
				}
			}
		}
	}

	private void saveNewScore(final int newScore) {
		try {
			File file = new File("res/data/data.bin");
			byte[] data = getBytesFromSave();
			for (int index = 0; index < 5; index++) {
				int offset = 2 + 4 * index;
				data[offset + 3] = (byte) (rankings[index] & 0xFF);
				data[offset + 2] = (byte) (rankings[index] >> 8 & 0xFF);
				data[offset + 1] = (byte) (rankings[index] >> 16 & 0xFF);
				data[offset + 0] = (byte) (rankings[index] >> 24 & 0xFF);
			}
			FileOutputStream writeFile = new FileOutputStream(file);
			writeFile.write(data);
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void h() {
		this.n = 0;
		while (this.n <= 4) {
			if (this.j > this.rankings[this.n]) {
				this.o = 4;
				while (this.o > this.n) {
					this.rankings[this.o] = this.rankings[this.o - 1];
					--this.o;
				}
				this.rankings[this.n] = this.j;
				this.saveNewScore(this.j);
				return;
			}
			++this.n;
		}
	}

	private static boolean a(final int n, final int n2, final int n3, final int n4, final int n5, final int n6,
			final int n7, final int n8) {
		return n + n3 > n5 && n < n5 + n7 && n2 < n6 + n8 && n2 + n4 > n6;
	}

	private void a(final Graphics graphics) {
		switch (this.aT) {
		case 0: {
			if (10L > this.aR) {
				++this.aR;
				try {
					graphics.setColor(new Color(16777215));
					graphics.fillRect(0, 0, scrn_width, scrn_height);
					if (this.O == null) {
						this.O = utils.Image.createImage("/logo1.png");
					}
					utils.Image.drawImage(graphics, this.O, scrn_width - this.O.getWidth(null) >> 1,
							(scrn_height - this.O.getHeight(null) >> 1) - 10, 20);
					if (scrn_width >= 240) {
						if (this.P == null) {
							this.P = utils.Image.createImage("/logo2.png");
						}
						utils.Image.drawImage(graphics, this.P, scrn_width - this.P.getWidth(null) >> 1,
								scrn_height - this.P.getHeight(null) - 10, 20);
						break;
					}
					if (scrn_width == 176) {
						if (this.P == null) {
							this.P = utils.Image.createImage("/logo2.png");
						}
						utils.Image.drawImage(graphics, this.P, scrn_width - this.P.getWidth(null) >> 1,
								scrn_height - this.P.getHeight(null) - 10, 20);
						break;
					}
					if (scrn_width == 128) {
						if (this.P == null) {
							this.P = utils.Image.createImage("/logo2.png");
						}
						utils.Image.drawImage(graphics, this.P, scrn_width - this.P.getWidth(null) >> 1,
								scrn_height - this.P.getHeight(null) - 10, 20);
					}
					return;
				} catch (Exception ex) {
					return;
				}
			}
			this.O = null;
			this.P = null;
			m();
			++this.aT;
		}
		case 1: {
			++this.aT;
		}
		case 2: {
			try {
				this.O = null;
				m();
				try {
					b.k = utils.Image.createImage("/Font.png");
					b.l = utils.Image.createImage("/num.png");
					this.Y = utils.Image.createImage("/aim.png");
					this.Z = utils.Image.createImage("/needle.png");
					this.U[0] = utils.Image.createImage("/man.png");
					this.U[1] = utils.Image.createImage("/fatman.png");
					this.V = utils.Image.createImage("/time.png");
					this.ab = utils.Image.createImage("/fire.png");
					this.ad = utils.Image.createImage("/property.png");
					this.ae = utils.Image.createImage("/heart.png");
					this.ac = utils.Image.createImage("/smoke.png");
					this.an = utils.Image.createImage("/sound_on.png");
					this.ao = utils.Image.createImage("/sound_off.png");
					this.at = utils.Image.createImage("/arror.png");
					this.ap = utils.Image.createImage("/popup.png");
					this.M = utils.Image.createImage("/menu_arrow_left.png");
					this.N = utils.Image.createImage("/menu_arrow_right.png");
					this.Q = utils.Image.createImage("/over.png");
					this.R = utils.Image.createImage("/goodEnd.png");
				} catch (Exception ex2) {
				}
				this.aS = 1;
				this.aT = 0;
				this.bD = 0;
				return;
			} catch (Exception ex3) {
			}
			break;
		}
		}
	}

	private void b_popup(final Graphics graphics) {
		final int n = (scrn_width - this.ap.getWidth(null)) / 2;
		final int n2 = (scrn_height - this.ap.getHeight(null)) / 2;
		graphics.setClip(0, 0, scrn_width, scrn_height);
		utils.Image.drawImage(graphics, this.ap, n, n2, 20);
		this.n = 0;
		while (this.n < 4) {
			graphics.setClip(n, n2 + 30 + this.n * 17, this.ap.getWidth(null), this.as.getHeight(null) / 4);
			graphics.setColor(new Color(0));
			if (this.n == this.bE) {
				if ((this.ak == 7 || this.ak == 6) && this.ak == 7) {
					utils.Image.drawImage(graphics, this.aq, n + 20, n2 + 30 + this.n * 18, 20);
				} else {
					utils.Image.drawImage(graphics, this.aq, n + 20, n2 + 30 + this.n * 17, 20);
				}
			}
			utils.Image.drawImage(graphics, this.as, n + 35,
					n2 + 30 + this.n * 17 - this.n * this.as.getHeight(null) / 4, 20);
			++this.n;
		}
		switch (this.aU) {
		case -1: {
			if (this.bE > 0) {
				--this.bE;
				break;
			}
			this.bE = 3;
			break;
		}
		case -2: {
			if (this.bE < 3) {
				++this.bE;
				break;
			}
			this.bE = 0;
			break;
		}
		case -6:
		case -5:
		case 53: {
			switch (this.bE) {
			case 0: {
				this.aT = 0;
				break;
			}
			case 1: {
				this.aS = 1;
				this.aT = 7;
				break;
			}
			case 2: {
				this.aS = 1;
				this.aT = 8;
				for (int i = 0; i < b.aj.length; ++i) {
					if (b.aj[i] == this.ak) {
						this.al = (byte) i;
					}
				}
				this.bC = 0;
				break;
			}
			case 3: {
				this.h();
				this.aS = 1;
				this.aT = 0;
				break;
			}
			}
			this.bE = 0;
			break;
		}
		case -7: {
			this.aT = 0;
			break;
		}
		}
		this.aU = 8888;
	}

	private void i() {
		for (int i = 0; i < this.H.length; ++i) {
			this.H[i][0] = 0;
		}
		this.J = false;
	}

	private void c(final Graphics graphics) {
		final int n = (scrn_width - this.am.getWidth(null)) / 2;
		graphics.setClip(0, 0, scrn_width, scrn_height);
		utils.Image.drawImage(graphics, this.T, 0, 0, 20);
		this.a(graphics, 2, 1);
		switch (scrn_width) {
		case 240: {
			graphics.setClip(0, 0, scrn_width, scrn_height);
			utils.Image.drawImage(graphics, this.sound_icon_img, n - 10, 100, 20);
			if (b.bB) {
				utils.Image.drawImage(graphics, this.an, 156, 100, 20);
			} else {
				utils.Image.drawImage(graphics, this.ao, 156, 100, 20);
			}
			a(graphics, true, 177, 97);
			a(graphics, false, 135, 97);
			final int n2 = (this.af.getHeight(null) + 1) / b.ah.length;
			graphics.setClip(0, 150, scrn_width, 15);
			if (this.ak != 7 && this.ak != 4) {
				utils.Image.drawImage(graphics, this.af, (scrn_width - this.af.getWidth(null)) / 2 + 37,
						150 - this.ak * n2, 20);
			} else if (this.ak == 4) {
				utils.Image.drawImage(graphics, this.af, (scrn_width - this.af.getWidth(null)) / 2 + 13,
						150 - this.ak * n2, 20);
			} else {
				utils.Image.drawImage(graphics, this.af, (scrn_width - this.af.getWidth(null)) / 2 + 77,
						150 - this.ak * n2, 20);
			}
			graphics.setClip(0, 180, scrn_width, (this.am.getHeight(null) + 1) / b.ah.length);
			utils.Image.drawImage(graphics, this.am, scrn_width / 2 + b.ai[b.aj[this.al]] / 2 + 5,
					180 - b.aj[this.al] * (this.am.getHeight(null) + 1) / b.ah.length, 17);
			graphics.setClip(0, 0, scrn_width, scrn_height);
			utils.Image.drawImage(graphics, this.aq, n - 10 - 40, 103 + this.bC * 50, 20);
			utils.Image.drawImage(graphics, this.at, scrn_width / 2 - 5, 310, 20);
			a(graphics, true, 195, 180);
			a(graphics, false, 40, 180);
			break;
		}
		case 176: {
			graphics.setClip(0, 0, scrn_width, scrn_height);
			utils.Image.drawImage(graphics, this.sound_icon_img, n - 10 - 10, 60, 20);
			utils.Image.drawImage(graphics, this.M, n + this.sound_icon_img.getWidth(null) + 10, 57, 20);
			utils.Image.drawImage(graphics, this.N, n + this.sound_icon_img.getWidth(null) + 37, 57, 20);
			if (b.bB) {
				utils.Image.drawImage(graphics, this.an, n + this.sound_icon_img.getWidth(null) + 20, 55, 20);
			} else {
				utils.Image.drawImage(graphics, this.ao, n + this.sound_icon_img.getWidth(null) + 20, 55, 20);
			}
			if (this.ak == 4) {
				graphics.setClip(n - 20 - 10, 100, this.af.getWidth(null), this.af.getHeight(null));
				utils.Image.drawImage(graphics, this.af, n - 20 - 10, 100, 20);
			} else if (this.ak == 6) {
				graphics.setClip(n - 15 - 5, 100, this.af.getWidth(null), this.af.getHeight(null));
				utils.Image.drawImage(graphics, this.af, n - 15 - 5, 100, 20);
			} else if (this.ak == 5) {
				graphics.setClip(n - 5, 100, this.af.getWidth(null), this.af.getHeight(null));
				utils.Image.drawImage(graphics, this.af, n - 5, 100, 20);
			} else if (this.ak == 3) {
				graphics.setClip(n - 5 - 25, 100, this.af.getWidth(null), this.af.getHeight(null));
				utils.Image.drawImage(graphics, this.af, n - 5 - 25, 100, 20);
			} else if (this.ak == 1) {
				graphics.setClip(n - 5 - 20, 100, this.af.getWidth(null), this.af.getHeight(null));
				utils.Image.drawImage(graphics, this.af, n - 5 - 20, 100, 20);
			} else if (this.ak == 2) {
				graphics.setClip(n - 5 - 25, 100, this.af.getWidth(null), this.af.getHeight(null));
				utils.Image.drawImage(graphics, this.af, n - 5 - 25, 100, 20);
			} else {
				graphics.setClip(n - 10 - 5, 100, this.af.getWidth(null), this.af.getHeight(null));
				utils.Image.drawImage(graphics, this.af, n - 10 - 5, 100, 20);
			}
			graphics.setClip(0, 120, scrn_width, (this.am.getHeight(null) + 1) / b.ah.length);
			utils.Image.drawImage(graphics, this.am, scrn_width / 2 + b.ai[b.aj[this.al]] / 2 + 5 - 10,
					120 - b.aj[this.al] * (this.am.getHeight(null) + 1) / b.ah.length, 17);
			graphics.setClip(0, 0, scrn_width, scrn_height);
			utils.Image.drawImage(graphics, this.aq, n - 20 - 7 - 10, 8 + this.bC * 65 + 50, 20);
			utils.Image.drawImage(graphics, this.M, n - 8 - 10, 122, 20);
			utils.Image.drawImage(graphics, this.N, (scrn_width - this.am.getWidth(null)) / 2 + 80 - 10, 122, 20);
			utils.Image.drawImage(graphics, this.at, scrn_width / 2 - 5, 210, 20);
			break;
		}
		case 128: {
			graphics.setClip(0, 0, scrn_width, scrn_height);
			if (this.ak != 7) {
				utils.Image.drawImage(graphics, this.sound_icon_img, n - 10, 60, 20);
			} else {
				utils.Image.drawImage(graphics, this.sound_icon_img, n - 10, 55, 20);
			}
			utils.Image.drawImage(graphics, this.M, n + this.sound_icon_img.getWidth(null) + 10, 57, 20);
			utils.Image.drawImage(graphics, this.N, n + this.sound_icon_img.getWidth(null) + 37, 57, 20);
			if (b.bB) {
				utils.Image.drawImage(graphics, this.an, n + this.sound_icon_img.getWidth(null) + 20, 55, 20);
			} else {
				utils.Image.drawImage(graphics, this.ao, n + this.sound_icon_img.getWidth(null) + 20, 55, 20);
			}
			if (this.ak == 4) {
				graphics.setClip(n - 25, 80, this.af.getWidth(null), this.af.getHeight(null));
				utils.Image.drawImage(graphics, this.af, n - 25, 80, 20);
			} else if (this.ak == 6) {
				graphics.setClip(n - 5 - 10, 80, this.af.getWidth(null), this.af.getHeight(null));
				utils.Image.drawImage(graphics, this.af, n - 5 - 10, 80, 20);
			} else {
				graphics.setClip(n - 10, 80, this.af.getWidth(null), this.af.getHeight(null));
				utils.Image.drawImage(graphics, this.af, n - 10, 80, 20);
			}
			graphics.setClip(0, 100, scrn_width, (this.am.getHeight(null) + 1) / b.ah.length);
			utils.Image.drawImage(graphics, this.am, scrn_width / 2 + b.ai[b.aj[this.al]] / 2 + 5,
					100 - b.aj[this.al] * (this.am.getHeight(null) + 1) / b.ah.length, 17);
			graphics.setClip(0, 0, scrn_width, scrn_height);
			utils.Image.drawImage(graphics, this.aq, n - 20 - 7, 28 + this.bC * 45 + 30, 20);
			utils.Image.drawImage(graphics, this.M, n - 8, 102, 20);
			utils.Image.drawImage(graphics, this.N, (scrn_width - this.am.getWidth(null)) / 2 + 80, 102, 20);
			utils.Image.drawImage(graphics, this.at, scrn_width / 2 - 5, 150, 20);
			break;
		}
		}
		switch (this.aU) {
		case -2:
		case -1: {
			this.bC = 1 - this.bC;
			this.aU = 8888;
			break;
		}
		case -5:
		case -4: {
		}
		case -3: {
			if (this.bC == 0) {
				b.bB = !b.bB;
			} else if (this.aU == -3) {
				--this.al;
				if (this.al < 0) {
					this.al = (byte) (b.aj.length - 1);
				}
			} else {
				++this.al;
				if (this.al >= b.aj.length) {
					this.al = 0;
				}
			}
			this.aU = 8888;
			break;
		}
		case -6:
		case 53: {
			this.ak = this.al;
			this.b_void();
			this.ar = null;
			this.as = null;
			this.au = null;
			this.sound_icon_img = null;
			this.W = null;
			this.L = null;
			this.aa = null;
			final int scrn_width = b.scrn_width;
			this.af = null;
			if (scrn_width != 240) {
				this.aw = null;
				this.ax = null;
			} else {
				this.aw = null;
			}
			m();
			this.a();
			if (this.aT == 8) {
				this.aS = 2;
				this.aT = 0;
			} else {
				this.aS = 1;
				this.aT = 0;
			}
			this.aU = 8888;
			break;
		}
		case -7: {
			if (this.aT == 8) {
				this.aS = 2;
				this.aT = 0;
				return;
			}
			this.aS = 1;
			this.aT = 0;
			this.aU = 8888;
			break;
		}
		}
	}

	private void j() {
		switch (this.aT) {
		case 0: {
			this.i();
			// breaks and lifes initially are 3
			this.j = 0;
			this.breaks = 3;
			this.G = 15;
			this.lifes = 3;
			this.p = 0;
			this.level_no = 0;
			this.u = 0;
			this.t = 0;
			this.B = 0;
			this.aV = this.aZ;
			this.aW = this.bj;
			this.bI = 0;
			for (int i = 0; i < 3; ++i) {
				this.aY[i][0] = 0;
			}
			this.b_void_int(this.p);
			this.v = this.aV[this.p][1] + 4;
			this.w = scrn_height;
			this.bL = false;
			this.x = 0;
			this.y = 0;
			this.A = this.x;
			this.z = this.y;
			this.K = false;
			this.S = null;
			this.X = null;
			m();
			try {
				this.X = utils.Image.createImage("/plane.png");
				this.S = utils.Image.createImage("/bk00.png");
			} catch (Exception ex) {
			}
			this.aS = 2;
			this.aT = 0;
			break;
		}
		}
	}

	private void a(final int n) {
		this.i();
		switch (n) {
		case 0: {
			if (this.lifes >= 3) {
				++this.lifes;
				if (this.lifes > 9) {
					// life should be 9 here
					this.lifes = 9;
				}
			} else {
				// lifes should be 3
				this.lifes = 3;
			}
			if (this.p <= 14) {
				++this.p;
				this.u = (short) ((this.aV[this.p - 1][4] - this.aV[this.p][1]) / 16);
				return;
			}
			this.r = false;
			++this.level_no;
			this.p = 0;
			this.u = 0;
			this.t = 0;
			this.S = null;
			this.X = null;
			m();
			final a a = this.bt;
			if (level_no > a.levels_reached) {
				a.levels_reached = level_no;
				try {
					File file = new File("res/data/data.bin");
					byte[] data = getBytesFromSave();
					data[1] = (byte) a.levels_reached;
					FileOutputStream writeFile = new FileOutputStream(file);
					writeFile.write(data);
					writeFile.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			if (this.level_no == 1) {
				try {
					this.X = utils.Image.createImage("/wash.png");
					this.S = utils.Image.createImage("/bk01.png");
					this.aV = this.ba;
					this.aW = this.bk;
					// s = 2400
					this.time_remaining = 5000;
					this.time_remaining = 2400;
				} catch (Exception ex2) {
				}
			}
			if (this.level_no == 2) {
				try {
					this.X = utils.Image.createImage("/dish.png");
					this.S = utils.Image.createImage("/bk02.png");
					this.aV = this.bb;
					this.aW = this.bl;
					// 2300
//					this.time_remaining = 5000;
					this.time_remaining = 2300;
				} catch (Exception ex3) {
				}
			}
			if (this.level_no == 3) {
				try {
					this.X = utils.Image.createImage("/flower.png");
					this.S = utils.Image.createImage("/bk03.png");
					this.aV = this.bc;
					this.aW = this.bm;
					// 2200
//					this.time_remaining = 5000;
					this.time_remaining = 2200;
				} catch (Exception ex4) {
				}
			}
			if (this.level_no == 4) {
				try {
					this.X = utils.Image.createImage("/fish.png");
					this.S = utils.Image.createImage("/bk04.png");
					this.aV = this.bd;
					this.aW = this.bn;
//					this.time_remaining = 5000;
					this.time_remaining = 2100;
					// 2100
				} catch (Exception ex5) {
				}
			}
			if (this.level_no == 5) {
				try {
					this.X = utils.Image.createImage("/basin.png");
					this.S = utils.Image.createImage("/bk06.png");
					this.aV = this.be;
					this.aW = this.bo;
//					this.time_remaining = 5000;
					this.time_remaining = 2000;
					// 2000
				} catch (Exception ex6) {
				}
			}
			if (this.level_no == 6) {
				try {
					this.X = utils.Image.createImage("/plane.png");
					this.S = utils.Image.createImage("/bk07.png");
					this.aV = this.bf;
					this.aW = this.bp;
//					this.time_remaining = 5000;
					this.time_remaining = 1900;
					// 1900
				} catch (Exception ex7) {
				}
			}
			if (this.level_no == 7) {
				try {
					this.X = utils.Image.createImage("/dish.png");
					this.S = utils.Image.createImage("/bk09.png");
					this.aV = this.bg;
					this.aW = this.bq;
//					this.time_remaining = 5000;
					this.time_remaining = 1800;
					// 1800
				} catch (Exception ex8) {
				}
			}
			if (this.level_no == 8) {
				try {
					this.X = utils.Image.createImage("/wash.png");
					this.S = utils.Image.createImage("/bk08.png");
					this.aV = this.bh;
					this.aW = this.br;
					// 1700
//					this.time_remaining = 5000;
					this.time_remaining = 1700;
				} catch (Exception ex9) {
				}
			}
			if (this.level_no == 9) {
				try {
					this.X = utils.Image.createImage("/plane.png");
					this.S = utils.Image.createImage("/bk05.png");
					this.aV = this.bi;
					this.aW = this.bs;
					// 1600
//					this.time_remaining = 5000;
					this.time_remaining = 1600;
				} catch (Exception ex10) {
				}
			}
			if (this.level_no <= 9) {
				this.bI = 0;
				this.b_void_int(this.p);
				this.v = this.aV[this.p][1] + 4;
				this.w = scrn_height;
				this.bL = false;
				this.x = 0;
				this.y = 0;
				this.A = this.x;
				this.z = this.y;
				this.B = 0;
				return;
			}
			this.X = null;
			this.S = null;
			m();
			this.aS = 6;
			this.aT = 0;
		}
		case 1: {
		}
		case 2: {
			if (this.lifes > 0) {
				--this.lifes;
				this.aX[1 - this.bI][0] = this.aV[this.p][0];
				this.aX[1 - this.bI][1] = this.aV[this.p][1];
				this.aX[1 - this.bI][2] = this.aV[this.p][2];
				this.aX[1 - this.bI][3] = 0;
				this.aX[1 - this.bI][4] = 0;
				this.aX[this.bI][5] = 0;
				this.v = this.aV[this.p][1] + 4;
				this.w = 0;
				this.x = 0;
				this.y = 0;
				this.A = this.x;
				this.z = this.y;
				this.w = scrn_height;
				this.bL = false;
				this.bK = 0;
				this.B = 0;
				return;
			}
			this.aS = 4;
			l();
			a("musicDie");
			this.aT = 0;
			break;
		}
		}
	}

	private void d(final Graphics graphics) {
		switch (this.aT) {
		case 0: {
			final String bn = "music";
			if (b.bB && !bn.equals(b.bN)) {
				b.bN = bn;
				c.backgroundMusic(bN);
			}
			graphics.setClip(0, 0, scrn_width, scrn_height);
			utils.Image.drawImage(graphics, this.S, -this.t, 0, 20);
			for (int i = 0; i <= 1; ++i) {
				final int n = i;
				final short n2 = this.aX[n][0];
				final short n3 = this.aX[n][1];
				final short n4 = this.aX[n][2];
				short n5;
				if (!this.K) {
					n5 = 50;
				} else {
					n5 = 30;
				}
				switch (n2) {
				case 0: {
					a(graphics, n3, n4, this.X, 0, 0, 34, 21, 20);
					break;
				}
				case 1: {
					if (this.aX[n][5] == 1) {
						if (this.aX[n][4] <= n5) {
							if (this.B == 1) {
								final short[] array = this.aX[n];
								final int n6 = 4;
								++array[n6];
							}
							this.aX[n][3] = -1;
						} else if (this.aX[n][3] == -1) {
							this.aX[n][3] = 0;
						} else {
							this.aX[n][3] = (short) (1 - this.aX[n][3]);
							final short[] array2 = this.aX[n];
							final int n7 = 2;
							array2[n7] += 4;
						}
					} else {
						this.aX[n][3] = -1;
					}
					a(graphics, n3, n4, this.X, (this.aX[n][3] + 2) * 34, 0, 34, 21, 20);
					this.a(graphics, 0, "" + (n5 / 10 - this.aX[n][4] / 10), n3, n4 + 10);
					break;
				}
				case 2: {
					if (this.aX[n][5] == 0) {
						final short[] array3 = this.aX[n];
						final int n8 = 4;
						++array3[n8];
						if (this.aX[n][4] == 40) {
							this.aX[n][4] = 0;
							this.aX[n][3] = (short) (1 - this.aX[n][3]);
						}
						if (this.aX[n][3] == 1) {
							this.aX[n][5] = 0;
							if (this.level_no == 9 || this.level_no == 6 || this.level_no == 0 || this.level_no == 7
									|| this.level_no == 2) {
								a(graphics, n3, n4 - 30, this.ab, this.bJ * 38, 0, 38, 35, 20);
								++this.bJ;
								if (this.bJ == 4) {
									this.bJ = 0;
								}
							}
						}
					} else {
						this.aX[n][3] = 0;
					}
					a(graphics, n3, n4, this.X, (this.aX[n][3] + 4) * 34, 0, 34, 21, 20);
					break;
				}
				case 3: {
					a(graphics, n3, n4, this.X, 204, 0, 34, 21, 20);
					break;
				}
				case 4: {
					if (this.aX[n][5] == 0) {
						final short[] array4 = this.aX[n];
						final int n9 = 4;
						++array4[n9];
						if (this.aX[n][4] == 10) {
							this.aX[n][3] = 3;
						}
						if (this.aX[n][4] == 20) {
							this.aX[n][3] = 4;
						}
						if (this.aX[n][4] == 30) {
							this.aX[n][3] = 0;
						}
						if (this.aX[n][4] == 40) {
							this.aX[n][4] = 0;
							this.aX[n][3] = 1;
						}
						if (this.aX[n][3] == 1) {
							this.aX[n][5] = 0;
						}
					} else {
						this.aX[n][3] = 3;
					}
					a(graphics, n3, n4, this.X, (this.aX[n][3] + 4) * 34, 0, 34, 21, 20);
					break;
				}
				}
			}
			this.f(graphics);
			this.g(graphics);
			this.h(graphics);
			if (this.r) {
				if (this.u > 0) {
					--this.u;
					++this.t;
					this.v -= 16;
					this.aX[0][1] -= 16;
					this.aX[1][1] -= 16;
				} else {
					this.b_void_int(this.p);
					this.B = 1;
					this.r = false;
				}
			}
			this.e(graphics);
			switch (this.aU) {
			case -6: {
				this.aT = 1;
				this.aU = 8888;
				break;
			}
			}
			break;
		}
		case 1: {
			l();
			this.b_popup(graphics);
			break;
		}
		}
	}

	private void e(final Graphics graphics) {
		a(graphics, 0, 0, this.aa, 0, 0, scrn_width, 24, 20);
		a(graphics, 0, scrn_height - 14, this.aa, 0, 24, scrn_width, 14, 20);
		if (scrn_width == 128) {
			if (this.A < 0) {
				this.a(graphics, 1, "" + (-this.A - 1), 43, scrn_height - 10);
			} else {
				this.a(graphics, 1, "" + this.A, 43, scrn_height - 10);
			}
			this.a(graphics, 1, "" + this.z, 12, scrn_height - 10);
			this.a(graphics, 1, "" + this.j, 92, scrn_height - 10);
			this.a(graphics, 1, "" + this.lifes, 15, 4);
			this.a(graphics, 1, "" + this.breaks, 39, 4);
			this.a(graphics, 1, "" + (this.p + 1), 109, 4);
			for (short n = 0; n <= this.G; ++n) {
				a(graphics, n + 61, 3, this.ae, 12, 0, 1, 10, 20);
			}
		} else if (scrn_width == 176) {
			if (this.A < 0) {
				this.a(graphics, 1, "" + (-this.A - 1), 68, scrn_height - 10);
			} else {
				this.a(graphics, 1, "" + this.A, 68, scrn_height - 10);
			}
			this.a(graphics, 1, "" + this.z, 32, scrn_height - 10);
			this.a(graphics, 1, "" + this.j, 120, scrn_height - 10);
			this.a(graphics, 1, "" + this.lifes, 27, 4);
			this.a(graphics, 1, "" + this.breaks, 51, 4);
			this.a(graphics, 1, "" + (this.p + 1), scrn_width - 15 - 5 - 15, 4);
			for (short n = 0; n <= this.G; ++n) {
				a(graphics, n + 61 + 21 - 11, 4, this.ae, 12, 0, 1, 10, 20);
			}
		} else {
			if (this.A < 0) {
				this.a(graphics, 1, "" + (-this.A - 1), 93, scrn_height - 10);
			} else {
				this.a(graphics, 1, "" + this.A, 93, scrn_height - 10);
			}
			this.a(graphics, 1, "" + this.z, 43, scrn_height - 10);
			this.a(graphics, 1, "" + this.j, 177, scrn_height - 9);
			this.a(graphics, 1, "" + this.lifes, 27, 5);
			this.a(graphics, 1, "" + this.breaks, 62, 5);
			this.a(graphics, 1, "" + (this.p + 1), scrn_width - 40, 5);
			for (short n = 0; n <= this.G; ++n) {
				a(graphics, n + 61 + 35, 4, this.ae, 12, 0, 1, 10, 20);
			}
		}
		// do not comment, this will control the time countdown thing

		if (this.level_no > 0) {
			short n = 30;
			if (this.time_remaining >= 1000) {
				n = 6;
			} else if (this.time_remaining >= 100) {
				n = 14;
			} else if (this.time_remaining >= 10) {
				n = 22;
			}
			utils.Image.drawImage(graphics, this.V, scrn_width - this.V.getWidth(null) - 2, 18, 20);
			this.a(graphics, 0, "" + this.time_remaining--, scrn_width - this.V.getWidth(null) - 2 + n, 23);
			if (this.time_remaining < 0) {
				this.aS = 4;
				l();
				a("musicDie");
			}
		}
	}

	private void b_void_int(final int n) {
		if (n == 0) {
			m();
			this.aX[this.bI][0] = this.aV[n][0];
			this.aX[this.bI][1] = this.aV[n][1];
			this.aX[this.bI][2] = this.aV[n][2];
			this.aX[this.bI][3] = 0;
			this.aX[this.bI][4] = 0;
			this.aX[this.bI][5] = 0;
		}
		this.bI = (short) (1 - this.bI);
		this.aX[this.bI][0] = this.aV[n][3];
		this.aX[this.bI][1] = this.aV[n][4];
		this.aX[this.bI][2] = this.aV[n][5];
		this.aX[this.bI][3] = 0;
		this.aX[this.bI][4] = 0;
		this.aX[this.bI][5] = 0;
		for (int i = 0; i <= this.aW[n].length / 3 - 1; ++i) {
			final int n2 = i * 3;
			this.aY[i][0] = 1;
			this.aY[i][1] = this.aW[n][n2];
			this.aY[i][2] = this.aW[n][n2 + 1];
			this.aY[i][3] = this.aW[n][n2 + 2];
			this.aY[i][4] = 0;
		}
	}

	private void f(final Graphics graphics) {
		for (int i = 0; i < 3; ++i) {
			if (this.aY[i][0] == 1) {
				if (this.aY[i][1] != 3) {
					a(graphics, this.aY[i][2], this.aY[i][3], this.ad, this.aY[i][1] * 12, 12, 12, 12, 20);
				} else {
					if (this.aY[i][2] <= scrn_width + 30) {
						final short[] array = this.aY[i];
						final int n = 2;
						array[n] += 2;
					} else {
						this.aY[i][2] = 0;
					}
					this.aY[i][4] = (short) (1 - this.aY[i][4]);
					a(graphics, this.aY[i][2], this.aY[i][3], this.ad, this.aY[i][4] * 18, 0, 18, 12, 20);
				}
			}
		}
	}

	private void k() {
		for (int i = 0; i < 50; ++i) {
			if (this.I[i][0] == 0) {
				this.I[i][0] = 1;
				this.I[i][1] = (short) (this.v + 10);
				this.I[i][2] = (short) (this.w + 30);
				this.I[i][3] = 0;
				return;
			}
		}
	}

	private void g(final Graphics graphics) {
		for (int i = 0; i < 3; ++i) {
			if (this.I[i][0] == 1) {
				if (this.I[i][3] < 4) {
					final short[] array = this.I[i];
					final int n = 3;
					++array[n];
				} else {
					this.I[i][0] = 0;
				}
				a(graphics, this.I[i][1] - 13, this.I[i][2], this.ac, this.I[i][3] * 13, 0, 13, 9, 20);
				a(graphics, this.I[i][1], this.I[i][2], this.ac, this.I[i][3] * 13, 9, 13, 9, 20);
			}
		}
	}

	private boolean a(final int n, final int n2) {
		return n2 * n2 < this.bu * this.bu - n * n;
	}

	private int c(final int n) {
		int i;
		for (i = this.bu; i > 0; --i) {
			if (n * n <= this.bu * this.bu - i * i) {
				return i;
			}
		}
		return i;
	}

	private void h(final Graphics graphics) {
		if (this.x >= 0) {
			this.C = 0;
		} else {
			this.C = 1;
		}
		Label_2060: {
			switch (this.B) {
			case 0: {
				this.D = 4;
				if (this.bL) {
					this.w += 2;
					if (a(this.v, this.w, 26, 30, this.aX[1 - this.bI][1], this.aX[1 - this.bI][2], 30, 21)) {
						this.w = this.aX[1 - this.bI][2] - 26;
						++this.B;
						this.D = 0;
						break;
					}
					break;
				} else {
					this.w -= 15;
					if (this.w < this.aX[1 - this.bI][2] - 32) {
						this.bL = true;
						break;
					}
					break;
				}
			}
			case 1: {
				int i = 2;
				if (scrn_width == 128) {
					i = 4;
				}
				if (this.x >= 0) {
					a(graphics, this.v + 18, this.w - 28, this.Y, 40, 0, 40, 40, 20);
					utils.Image.drawImage(graphics, this.Z, this.v + 18 + i * this.x, this.w + 8 - i * this.y, 20);
				}
				if (this.x < 0) {
					a(graphics, this.v - 36, this.w - 28, this.Y, 0, 0, 40, 40, 20);
					utils.Image.drawImage(graphics, this.Z, this.v + 1 + i * this.x, this.w + 8 - i * this.y, 20);
				}
				if (this.aX[1 - this.bI][0] == 1 && this.aX[1 - this.bI][3] > -1) {
					this.B = 5;
					break;
				}
				switch (this.aU) {
				case -1: {
					if (this.y < this.bu) {
						++this.y;
						this.z = this.y;
						if (this.y == this.bu) {
							if (this.x < 0) {
								this.y = this.bu;
							}
							this.A = this.x;
						}
						if (!this.a(this.x, this.y)) {
							if (this.x < 0) {
								this.x = -this.c(this.y) - 1;
								this.A = this.x;
							} else {
								this.x = this.c(this.y);
								this.A = this.x;
							}
						}
					}
					if (!this.bx) {
						this.aU = 8888;
						break Label_2060;
					}
					break Label_2060;
				}
				case -2: {
					if (this.y > 0) {
						--this.y;
						this.z = this.y;
					}
					if (!this.bx) {
						this.aU = 8888;
						break Label_2060;
					}
					break Label_2060;
				}
				case -3: {
					if (this.x > -this.bu - 1) {
						--this.x;
						if (!this.a(this.y, this.x + 1)) {
							this.y = this.c(this.x + 1);
						}
						this.z = this.y;
						this.A = this.x;
					}
					if (!this.bx) {
						this.aU = 8888;
						break Label_2060;
					}
					break Label_2060;
				}
				case -4: {
					if (this.x < this.bu) {
						++this.x;
						if (!this.a(this.y, this.x)) {
							this.y = this.c(this.x);
						}
						this.z = this.y;
						this.A = this.x;
					}
					if (!this.bx) {
						this.aU = 8888;
						break Label_2060;
					}
					break Label_2060;
				}
				case -5:
				case 53: {
					this.k();
					this.y *= -10;
					++this.B;
					if (!this.bx) {
						this.aU = 8888;
						break Label_2060;
					}
					break Label_2060;
				}
				case -6: {
					break Label_2060;
				}
				case 48: {
					break Label_2060;
				}
				default: {
					if (!this.bx) {
						this.aU = 8888;
						break Label_2060;
					}
					break Label_2060;
				}
				}
			}
			case 2: {
				if (this.D < 2) {
					++this.D;
					break;
				}
				this.D = 4;
				++this.B;
				break;
			}
			case 3: {
				for (int j = 0; j < this.H.length; ++j) {
					if (this.H[j][0] == 0) {
						this.H[j][0] = 1;
						this.H[j][1] = (short) (this.v + 10);
						this.H[j][2] = (short) (this.w + 30);
						break;
					}
				}
				graphics.setColor(new Color(255, 0, 0));
				for (int i = 0; i < this.H.length; ++i) {
					if (this.H[i][0] == 1) {
						graphics.drawRoundRect((int) this.H[i][1], (int) this.H[i][2], 2, 2, 2, 2);
					}
				}
				if (this.y >= 0) {
					this.D = 3;
				} else {
					this.D = 4;
				}
				if (a(this.v + 4, this.w, 15, 28, this.aX[this.bI][1], this.aX[this.bI][2], 28, 0) && this.y > 0
						&& this.w + 10 < this.aX[this.bI][2]) {
					if ((this.aX[this.bI][0] != 2 && this.aX[this.bI][0] != 4) || this.aX[this.bI][3] != 1) {
						this.w = this.aX[this.bI][2] - 26;
						this.x = 0;
						this.y = 0;
						this.z = this.y;
						this.A = this.x;
						this.k();
						++this.B;
						break;
					}
					this.B = 6;
				}
				int k = 12;
				for (int j = 0; j < 3; ++j) {
					if (this.aY[j][0] == 1) {
						if (this.aY[j][1] == 3) {
							k = 16;
						}
						if (a(this.v + 4, this.w, 15, 25, this.aY[j][2], this.aY[j][3], k, 10)) {
							this.aY[j][0] = 0;
							if (this.aY[j][1] == 0) {
								++this.breaks;
								this.K = true;
							}
							if (this.aY[j][1] == 2) {
								this.K = false;
							}
							if (this.aY[j][1] == 1) {
								this.j += 10;
							}
							if (this.aY[j][1] == 3) {
								this.G += 5;
								if (this.G > 15) {
									this.G = 15;
								}
							}
						}
					}
				}
				if (!this.J) {
					this.v += this.x;
				}
				this.w += this.y / 10;
				this.y += 5;
				if (this.w > scrn_height) {
					this.a(2);
				}
				if (this.w < 0) {
					this.w = 10;
					this.y += 10;
					this.y = -this.y;
				}
				if (this.v < 0) {
					this.v = 0;
					this.x = -this.x;
				}
				if (this.v > scrn_width - 27) {
					this.v = scrn_width - 27;
					this.x = -this.x;
				}
				switch (this.aU) {
				case 48: {
					if (this.breaks > 0 && !this.J) {
						this.k();
						this.J = true;
						--this.breaks;
						this.aU = 8888;
						break;
					}
					break;
				}
				case -5:
				case 53: {
					if (this.G >= 0) {
						this.y -= 10;
						if (this.bM == 1) {
							--this.G;
						}
						this.bM = (byte) (1 - this.bM);
						break;
					}
					break;
				}
				}
				break;
			}
			case 4: {
				if (this.D > 0) {
					--this.D;
					break;
				}
				this.D = 0;
				this.r = true;
				this.aX[this.bI][5] = 1;
				this.j += 100;
				this.B = 10;
				for (int k = 0; k < 3; ++k) {
					this.aY[k][0] = 0;
				}
				this.a(0);
				break;
			}
			case 5: {
				this.D = 5;
				this.w += 6;
				if (this.w > scrn_height) {
					this.a(2);
					break;
				}
				break;
			}
			case 6: {
				if (this.level_no == 9 || this.level_no == 6 || this.level_no == 0 || this.level_no == 5
						|| this.level_no == 7 || this.level_no == 2) {
					this.D = 6;
				} else {
					this.D = 7;
				}
				if (this.bK < 5) {
					++this.bK;
					this.w -= 6 - this.bK;
					break;
				}
				this.w += 6;
				if (this.w > scrn_height) {
					this.a(2);
					break;
				}
				break;
			}
			}
		}
		if (!this.K) {
			a(graphics, this.v, this.w, this.U[0], (2 * this.D + this.C) * 27, 0, 27, 30, 20);
			return;
		}
		a(graphics, this.v, this.w, this.U[1], (2 * this.D + this.C) * 27, 0, 27, 30, 20);
	}

	private static void a(final String bn) {
		if (b.bB) {
			if (bn.equals(b.bN)) {
				return;
			}
			b.bN = bn;
			c.player_death(b.bN);
			;
		}
	}

	private static void l() {
		try {
			b.bN = null;
			c.a();
		} catch (Exception ex) {
		}
	}

	private static void m() {
		final Runtime runtime = Runtime.getRuntime();
		System.out.println("---> Use " + (runtime.totalMemory() - runtime.freeMemory()) / 1024L);
	}

	private static void a(final Graphics graphics, final boolean b, final int n, final int n2) {
		graphics.setColor(new Color(16777215));
		if (b) {
			for (int i = 0; i < 10; ++i) {
				graphics.drawLine(n, n2 + i, n + 4 + i, n2 + i);
			}
			for (int i = 0; i < 10; ++i) {
				graphics.drawLine(n, n2 + 10 + i, n + 13 - i, n2 + 10 + i);
			}
			return;
		}
		for (int i = 0; i < 10; ++i) {
			graphics.drawLine(n + 8 - i, n2 + i, n + 13, n2 + i);
		}
		for (int i = 0; i < 10; ++i) {
			graphics.drawLine(n - 1 + i, n2 + 10 + i, n + 13, n2 + 10 + i);
		}
	}

	// TODO understand why are some things just not used
	static {
//		final int[] array = { 20, 30, 30, 80, 130, 140, 180, 200, 190, 160 };
//		final int[] array2 = { 12, 60, 120, 80, 60, 100, 50, 60, 100, 170 };
		b.d = new int[] { 0, 20, 20, 49, 88, 101, 123, 146, 138, 112 };
		b.e = new int[] { 23, 60, 112, 35, 37, 87, 22, 52, 89, 130 };
//		final int[] array3 = { 23, 39, 39, 73, 113, 125, 149, 170, 170, 138 };
//		final int[] array4 = { 32, 64, 115, 45, 43, 77, 30, 50, 90, 133 };
//		final int[] array5 = { 5, 13, 13, 33, 60, 64, 88, 100, 95, 76 };
//		final int[] array6 = { 13, 48, 80, 40, 24, 60, 17, 32, 63, 94 };
		b.ah = new String[] { "en", "fr", "it", "de", "se", "ru", "pt", "cn" };
		b.ai = new int[] { 23, 16, 18, 21, 21, 21, 0, 65 };
		b.aj = new int[] { 0, 4, 6 };
		b.bB = true;
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keyPressed(52);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keyPressed(54);
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			// num 2 ie up
			keyPressed(50);
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keyPressed(56);
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			keyPressed(53);
		}
		if (e.getKeyCode() == KeyEvent.VK_Z) {
			// num 0
			keyPressed(48);
		}
		if (e.getKeyCode() == KeyEvent.VK_Q) {
			// num 0
			keyPressed(-6);
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			// num 0
			keyPressed(-7);
		}
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keyReleased(52);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keyReleased(54);
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			// num 2 ie up
			keyReleased(50);
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keyReleased(56);
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			keyReleased(53);
		}
		if (e.getKeyCode() == KeyEvent.VK_Q) {
			// num 0
			keyReleased(-6);
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			// num 0
			keyReleased(-7);
		}

	}
}