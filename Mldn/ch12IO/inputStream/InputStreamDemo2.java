package inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


//根据文件的大小输出内容
public class InputStreamDemo2 {
   public static void main(String args[])throws Exception{
	   File f = new File("D:"+File.separator+"test.txt");
	   InputStream  in = null;
	   in = new FileInputStream(f);
	   byte b[] = new byte[1024];
	   int len = in.read(b);
	   in.close();
	   System.out.println(new String(b, 0, len));  //0是index
   }
}
