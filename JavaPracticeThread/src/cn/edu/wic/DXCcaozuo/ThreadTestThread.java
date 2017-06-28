package cn.edu.wic.DXCcaozuo;


class MyThread9 extends Thread{
	private int ms;
	private String name;
	public MyThread9(String name,Integer ms){
//		super(name);  //Thread类有String name 的方法，
        this.name=name;
		this.ms=ms;  }	
	public void run(){
		try
		{	Thread.sleep(this.ms);
			System.out.println(name+"--"+ms);    }
		catch (InterruptedException e)
		{   e.printStackTrace();   }
		System.out.println(Thread.currentThread().getName()+"----"+ms);
	}	
}
public class ThreadTestThread
{    public static void main(String[] args)
	{   MyThread9 mt1 = new MyThread9("线程1",10);  //MyThread9的构造方法
		MyThread9 mt2 = new MyThread9("线程2",20);
		MyThread9 mt3 = new MyThread9("线程3",30);
		
		new Thread(mt1,"线程A").start();    //给线程命名
		new Thread(mt2,"线程B").start();
		new Thread(mt3,"线程C").start();
	}

}
