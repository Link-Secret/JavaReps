package cn.edu.wic.DXCcaozuo;

class MyThread7 implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
		try
		{
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+i);
		}
		catch (Exception e)
		{
			System.out.println(Thread.currentThread().getName()+i);
		}	
		}
	}
}

public class Threadpriority
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new MyThread7(),"线程A");
		Thread t2 = new Thread(new MyThread7(),"线程B");
		Thread t3 = new Thread(new MyThread7(),"线程C");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
