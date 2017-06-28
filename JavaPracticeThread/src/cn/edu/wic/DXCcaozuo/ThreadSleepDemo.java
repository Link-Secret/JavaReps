package cn.edu.wic.DXCcaozuo;

class MyThread4 implements Runnable{
	 public void run(){
		 for(int i=0;i<20;i++){
			 try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				// TODO: handle exception
			}
			 System.out.println("线程--》"+Thread.currentThread().getName()+i);
		 }
	 }
}
public class ThreadSleepDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		MyThread4 mt = new MyThread4();
		Thread t = new Thread(mt);
		new Thread(mt).start();
		t.start();
		for(int i=0;i<30;i++){
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				// TODO: handle exception
			}
			System.out.println("main-->"+i);
		}
	
	}

}
