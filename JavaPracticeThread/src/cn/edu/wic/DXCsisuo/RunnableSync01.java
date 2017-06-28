package cn.edu.wic.DXCsisuo;

class MyThread implements Runnable{
	private int ticket=5;
	public void run(){
		for(int i=0;i<100;i++){
			if(ticket>0){
			try{	Thread.sleep(1000); }
			catch (InterruptedException e)
			{  e.getStackTrace();   }
			System.out.println("还剩"+ticket--+"张票");
			}}}}

public class RunnableSync01
{

	public static void main(String[] args)
	{
	    MyThread mt1 = new MyThread();
	    
	    
	    new Thread(mt1).start();
	    new Thread(mt1).start();
	    new Thread(mt1).start();
	}

}
