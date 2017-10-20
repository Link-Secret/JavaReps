package outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

//向文件后面添加内容而不是覆盖
public class OutputStreamDemo2 {

	public static void main(String args[])throws Exception{
		File f = new File("D:"+File.separator+"test.txt");
		OutputStream out = null;
		//实例化子类的对象，并且使用含有两个参数的构造方法，第二个构造方法为是否append
		out = new FileOutputStream(f, true);
		String str = "\r\nappend!!";
		byte b[] = str.getBytes();
		out.write(b);
		out.close();
		
	}
}
