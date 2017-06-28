package cn.edu.wic.DXCcaozuo;

class MyThread3 implements Runnable {
   public void run(){
	   for(int i=0;i<50;i++){
		   System.out.println("线程"+Thread.currentThread().getName()+i);
	   }
   }
}

public class ThreadJoinDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	  MyThread3 mt = new MyThread3();
	  Thread t1 = new Thread(mt);
	  
	  t1.start();
	  
	  for(int i=0;i<40;i++){
		  if(i>30){
			  try
			{
				t1.join();
			}
			catch (InterruptedException e)
			{
				// TODO: handle exception
			}
		  }
		  System.out.println("main线程--"+i);
	  }
	
	}
	
}

