//import java.io.BufferedInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import javax.microedition.media.Manager;
//import javax.microedition.media.MediaException;
//import javax.microedition.media.Player;

//import javax.sound.sampled.AudioFormat;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioPermission;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;

public final class c {
	private String a = "";
	private int loopCount;
	private String c = null;
	private static c e = new c();

	private c() {
	}

	public static void player_death(String var0) {
		e.loopCount = 1;
		e.c_void(var0);
	}

	public static void backgroundMusic(String var0) {
		if (e.a.equals("")) {
			e.loopCount = 99;
			e.c_void(var0);
			e.a = var0;
		}

	}

	public static void a() {
		e.b();
		e.a = "";
	}

	private synchronized void c_void(String var1) {
		this.b();
		this.c = null;
		if (var1 != null) {
			if (var1.equals("music")) {
				b.bg_clip.loop(loopCount);
				b.bg_clip.start();
			} else {
				b.die_clip.loop(loopCount);
				b.die_clip.start();
			}
			this.c = "Playing";
			return;
		}
	}

	private void b() {
		if (this.c != null) {
			b.bg_clip.close();
			b.die_clip.close();
			b.bg_clip.stop();
			b.die_clip.stop();
		}
//
//      if (this.d != null) {
//         try {
//            this.d.close();
//         } catch (Exception var1) {
//         }
//
//         this.d = null;
//      }

	}
}
