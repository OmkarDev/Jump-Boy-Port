package utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Utils {


	public static String jar_folder = null;
	public static String res_folder = null;
	
	public static InputStream deepCopy(InputStream inputStream) throws IOException {
		long past = System.currentTimeMillis();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int bytesRead;
		while ((bytesRead = inputStream.read(buffer)) != -1) {
			byteArrayOutputStream.write(buffer, 0, bytesRead);
		}
		return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
	}
}
