package singleMessage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/*
 * 该类用于保存和读取文件中的对象
 */
public class FileOperate {

	private File file= null;
	public FileOperate(String pathName){
		this.file = new File(pathName);
	}
	
	public boolean save(Object obj) throws Exception{   //保存对象
		ObjectOutputStream oos = null;    //对象输出流
		boolean flag = false;
		try {
			oos = new ObjectOutputStream(
					new FileOutputStream(file));  //实例化对象输出流
			oos.writeObject(obj);   //保存对象
			flag = true;
		} catch (Exception e) {
			throw e;
		}finally {
			if(oos != null){
				oos.close();
			}
		}
		return flag;
		
	}
	
	  public Object load() throws Exception{   //读取对象
		  Object obj = null;
		  ObjectInputStream ois = null;
		  try {
			ois = new ObjectInputStream(
					new FileInputStream(this.file));   //实例化对象输入流
			obj = ois.readObject();
		} catch (Exception e) {
			throw e;
		}finally {
			if(ois != null){
				ois.close();
			}
		}  
		  return obj;
	  }
}
