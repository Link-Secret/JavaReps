package cn.edu.wic.DXCcaozuo;

class MyThread2 implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName()+i);
			
		}
	}
}

public class ThreadAliveDemo
{

	/**
	 * 判断线程是否存活
	 */
	public static void main(String[] args)
	{
		MyThread2 mt = new MyThread2();
		Thread t1 = new Thread(mt);
		
		System.out.println("start执行之前"+t1.isAlive());
		t1.start();
		System.out.println("start执行之后"+t1.isAlive());
		
		for(int i=0;i<3;i++){
			System.out.println("main运行"+i);
		}
        System.out.println("代码执行之后"+t1.isAlive());  //如果最后 
	}

}
