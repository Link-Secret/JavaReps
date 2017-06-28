package cn.edu.wic.ThreadTest;


public class AddTest3
{
    
	/**
	 * 四个线程操作四个对象--采用内部类方法
	 */
	public static void main(String[] args)
	{
		AddTest3 at = new AddTest3();
		
		Add3 a1 = at.new Add3();
		Substract3 a2 = at.new Substract3();
		
		new Thread(a1,"aaa").start();   //Thread t = new Thread(a1); t.start();
		new Thread(a2,"bbb").start();

	}
	
	
	class Add3 implements Runnable{
		private int j=0;
		public void run(){
			for(int i=0;i<20;i++){
				j++;
				System.out.println(Thread.currentThread().getName()+j);
			}
		}
	}
	
	class Substract3 implements Runnable{
		private int j=0;
		public void run(){
			for(int i=0;i<20;i++){
				j--;
				System.out.println(Thread.currentThread().getName()+j);
			}
		}
	}
	
	
}
