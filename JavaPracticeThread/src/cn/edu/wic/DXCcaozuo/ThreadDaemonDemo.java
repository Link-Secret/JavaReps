package cn.edu.wic.DXCcaozuo;

class MyThread6 implements Runnable{
	public void run(){
		while (true)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class ThreadDaemonDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		MyThread6 mt = new MyThread6();
		
		Thread t = new Thread(mt);
		t.setDaemon(true);
		System.out.println(t.isAlive());
		t.start();
        System.out.println(t.isAlive());
	}

}
