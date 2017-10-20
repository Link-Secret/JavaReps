package inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo3 {

	public static void main(String args[])throws Exception{
		File f = new File("D:"+File.separator+"test.txt");
	    InputStream in = null;
	    in = new FileInputStream(f);
	    byte b[] = new byte[(int)(f.length())];  //数组长度由文件大小决定
	    in.read(b);
	    in.close();
	    System.out.println(new String(b));
	}
}
