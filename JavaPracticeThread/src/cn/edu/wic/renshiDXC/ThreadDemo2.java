package cn.edu.wic.renshiDXC;

class MyThread3 extends Thread{
	private int ticket=3;
	
	public void run(){
	      for(int i=0;i<10;i++){
			if (ticket>0){
	          System.out.println("还剩"+ticket--+"张票");
		      }
	      }
	}
	
}


public class ThreadDemo2
{

	/**
	 * 继承Thread和实现Runnable接口的差别---共享资源的差别
	 */
	public static void main(String[] args)
	{
		MyThread3 mt1 =new MyThread3();
		MyThread3 mt2 = new MyThread3();
		MyThread3 mt3 = new MyThread3();
		
		mt1.start();
		mt2.start();
		mt3.start();

	}

}
