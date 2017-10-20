package switchIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderDemo1 { 
   public static void main(String args[])throws Exception{
	   File f = new File("D:"+File.separator+"test.txt");
	   Reader in = null;
	   in = new InputStreamReader(new FileInputStream(f));
	   //将字节流转换成字符流
	   char c[] = new char[1024];
	   int len = in.read(c);
	   in.close();
	   System.out.println();
   }
}
