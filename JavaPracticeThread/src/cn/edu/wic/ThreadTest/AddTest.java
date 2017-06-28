package cn.edu.wic.ThreadTest;




class Add implements Runnable{
	 int numberA = 0;
	
	public void run(){
		for(int i =0;i<20;i++){
			try
			{
				Thread.sleep(30);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"numberA"+numberA++);
		}
   }
}

class Substract implements Runnable{
	  int numberS=0;
	  
	  public void run(){
			
		
		  for(int i=0;i<20;i++){
			  try
			{
				Thread.sleep(30);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			  System.out.println(Thread.currentThread().getName()+"---"+"numberS"+numberS--);
		  }
		  
  }
}

public class AddTest
{

	/**
	 * 四个线程操作四个对象
	 */
	public static void main(String[] args)
	{
		
		Add add = new Add();
		Add add2 = new Add();
		Substract substract = new Substract();
		Substract substract2 = new Substract();
		
		new Thread(add,"A1").start();
		new Thread(add2,"A2").start();
		
		new Thread(substract,"S1").start();
		new Thread(substract2,"S2").start();
	}

}
