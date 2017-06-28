package cn.edu.wic.ThreadTest;

/**
 *
 * 电脑制造者和搬走者--采用内部类
 *
 */
public class ComputerTransfer2
{
    private int number2 = 0;
    boolean flag = false;
	
	public static void main(String[] args)
	{
		
		ComputerTransfer2 ct1 = new ComputerTransfer2();
		
		
		Producer2 producer0 = ct1.new Producer2();
		Transfer2 transfer0 = ct1.new Transfer2();
		
		new Thread(producer0,"线程1").start();
		new Thread(transfer0,"线程2").start();
	}
	
	public synchronized void producer2(){
		if(flag){
			try
			{
				super.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		 try
		{
			Thread.sleep(30);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		   System.out.println(Thread.currentThread().getName()+"--->"+(++number2));
		   flag=true;
		   super.notify();
		   
	}
	
	public synchronized void transfer2(){
		if(!flag){
			try
			{
				super.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		try
		{
			Thread.sleep(30);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"--->"+number2);
		flag = false;
		super.notify();
	}
	
	
	class Producer2 implements Runnable{
		
		public void run(){
			for(int i=0;i<20;i++){
				producer2();
			}
			
		}
	}
	
	class Transfer2 implements Runnable{
		
		public void run(){
			for(int i=0;i<20;i++){
				transfer2();
			}
		}
	}

}
