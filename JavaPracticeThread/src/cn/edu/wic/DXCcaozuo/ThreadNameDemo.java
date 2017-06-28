package cn.edu.wic.DXCcaozuo;

class MyThread0 implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class ThreadNameDemo
{

	/**
	 * 主方法也是线程
	 */
	public static void main(String[] args)
	{
		MyThread0 mt1 = new MyThread0();
		
		new Thread(mt1, "线程1").start();
		new Thread(mt1, "线程2").start();
		mt1.run();    //主线程

	}

}
