package cn.edu.wic.DXCcaozuo;

class Mythread5 implements Runnable{
	public void run(){
		System.out.println("进入休眠");
		try{  Thread.sleep(10000);
			System.out.println("完成休眠");
		}catch(Exception e){
			System.out.println("休眠被终止");
			return;
		}	
		System.out.println("线程正常完成"+Thread.currentThread().getName());
	}
}
public class ThreadInterruptDemo
{

	public static void main(String[] args)
	{
		Mythread5 mt = new Mythread5();
		Thread t = new Thread(mt);
		t.start();
		try
		{		Thread.sleep(1000);   }
		catch (Exception e){}
		t.interrupt();
	}
}
