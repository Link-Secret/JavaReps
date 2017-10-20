package inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo1 {

	public static void main(String args[])throws Exception{
		File f = new File("D:"+File.separator+"test.txt");
		InputStream in = null;
		in = new FileInputStream(f);
		byte b[] = new byte[1024]; //先开辟空间，再接收数据
		in.read(b);   //取出内容，读取到byte数组中
		in.close();
		System.out.println(new String(b));  //新建一个匿名字符串对象存放
	}
}
