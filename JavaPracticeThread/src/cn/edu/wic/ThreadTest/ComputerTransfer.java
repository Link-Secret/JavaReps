package cn.edu.wic.ThreadTest;

class Info{
	private int number =0;
	boolean flag = false;

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public synchronized void set(){
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
				
				System.out.println(Thread.currentThread().getName()+"--->生产了"+(++number));
				flag=true;
				super.notify();
			}
		
	
	  public synchronized void get(){
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
		  System.out.println(Thread.currentThread().getName()+"-->搬运了"+number);
		  flag = false;
		  super.notify();
	  }
	}
	
class Producer implements Runnable{
	private Info info = null;
	
	
	public Producer(Info info){
		this.info=info;
	}
	public void run(){
		for(int i=0;i<20;i++){
			this.info.set();
		}
	}
}

class Transfer implements Runnable{
	private Info info=null;
	public Transfer(Info info){
		this.info=info;
	}
	public void run(){
		for(int i=0;i<20;i++){
		this.info.get();
		}
	}
}

public class ComputerTransfer
{

	/**
	 * 
	 * 电脑制造者和搬走者--方法一
	 */
	public static void main(String[] args)
	{
		Info info = new Info();
		Producer producer = new Producer(info);
		Transfer transfer = new Transfer(info);
		
		new Thread(producer).start();
		new Thread(transfer).start();
	}

}
