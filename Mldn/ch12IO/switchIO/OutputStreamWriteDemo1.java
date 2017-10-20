package switchIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriteDemo1 {
  public static void main(String args[])throws Exception{
	  File f = new File("D:"+File.separator+"test.txt");
	  Writer out = null;
	  out = new OutputStreamWriter(new FileOutputStream(f));
	  //将字符流转换成字节流输出
	  out.write("...");
	  out.close();
  }
}
