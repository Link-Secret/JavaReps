package outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class OutputStreamDemo1 {

	public static void main(String args[])throws Exception{
		File f = new File("D:"+File.separator+"test.txt");
		OutputStream out = null;
		out = new FileOutputStream(f);
		String str = "hello world";
		byte b[] = str.getBytes();
		out.write(b);
		out.close();
	}
}
