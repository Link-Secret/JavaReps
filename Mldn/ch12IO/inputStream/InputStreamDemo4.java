package inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo4 {
   public static void main(String args[])throws Exception{
	   File f = new File("D:"+File.separator + "test.txt");
	   InputStream in = null;
	   in = new FileInputStream(f);
	   byte b[] = new byte[(int)(f.length())];
	   for(int i=0;i<b.length;i++){
		   b[i] = (byte) in.read();  //以数字的方式读取内容
	   }
	   in.close();
	   System.out.println(new String(b));  //数组变成字符串输出
   }
}
