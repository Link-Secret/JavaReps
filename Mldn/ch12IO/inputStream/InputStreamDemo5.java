package inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//根据是否读取到文件末尾来判断文件的输入
public class InputStreamDemo5 {

	public static void main(String args[])throws Exception{
		File f = new File("D:"+File.separator+"test.txt");
		InputStream in = null;
		in = new FileInputStream(f);
		int len = 0;
		byte b[] = new byte[1024];
		int temp = 0;
		while((temp=in.read())!=-1){
			b[len] = (byte) temp;
			len++;
		}
		in.close();
		System.out.println(new String(b,0,len));
	}
}
