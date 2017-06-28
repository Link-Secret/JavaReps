package cn.edu.wic.ThreadTest;

class Info2 {
	private int number4=0;
	
	public synchronized void add(){
		try
		{
			Thread.sleep(30);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		number4++;
		System.out.println(Thread.currentThread().getName()+"---"+number4);
	}
	public synchronized void substract(){
		try
		{
			Thread.sleep(30);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		number4--;
		System.out.println(Thread.currentThread().getName()+"-->"+number4);
	}
}

class Add2 implements Runnable{
	private Info2 info=null;
	
	public Add2(Info2 info){
		this.info=info;
	}
	
	public void run(){
		for(int i=0;i<20;i++){
			this.info.add();
		}
	}
}

class Substract2 implements Runnable{
	private Info2 info=null;
	public Substract2(Info2 info){
		this.info=info;
	}
	
	public void run(){
		for(int i=0;i<20;i++){
			this.info.substract();
		}
	}
}


public class AddTest4
{
    
	/**
	 * 四个线程操作一个数据--方法一
	 */
	public static void main(String[] args)
	{
		Info2 info = new Info2();
		
		
		
		Add2 add1 = new Add2(info);
		Add2 add2 = new Add2(info);
		Substract2 substract1 = new Substract2(info);
		Substract2 substract2 = new Substract2(info);
		
		new Thread(add1).start();
		new Thread(add2).start();
		new Thread(substract1).start();
		new Thread(substract2).start();

	}

}
