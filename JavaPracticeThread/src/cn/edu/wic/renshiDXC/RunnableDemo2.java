package cn.edu.wic.renshiDXC;


class MyThread4 implements Runnable{
	
	private int ticket =3 ;
	@Override
	public void run()
	{
	for(int i=0;i<10;i++){
//		System.out.println(Thread.currentThread().getName());
		if(ticket>0){
			System.out.println("还有"+ticket--+"张票");
			System.out.println(Thread.currentThread().getName());
			
		}
	  }
	}
	
	
}

public class RunnableDemo2
{

	/**
	 * 实化runnable接口共享一个资源
	 */
	public static void main(String[] args)
	{
		MyThread4 mt1 = new MyThread4();
		
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt1);
		
		t1.start();
		t2.start();

	}

}
