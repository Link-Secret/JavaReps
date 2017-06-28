package cn.edu.wic.DXCcaozuo;


class MyThread8 implements Runnable{
	private int ms;
	private String name;
	public MyThread8(String name, Integer ms){
		this.name= name;
		this.ms = ms;
	} public void run(){
		try{   Thread.sleep(ms);
			System.out.println(name+ms);   }
		catch (Exception e)
		{	e.printStackTrace();  }
		System.out.println(Thread.currentThread().getName()+"---"+ms);
	}  }
public class ThreadTest
{  public static void main(String[] args)
	{   MyThread8 mt1 = new MyThread8("线程1",10);  //MyThread8的构造方法
		MyThread8 mt2 = new MyThread8("线程2",20);
		MyThread8 mt3 = new MyThread8("线程3",30);
		
		Thread t1 = new Thread(mt1,"线程A");    //给线程命名
		Thread t2 = new Thread(mt2,"线程B");
		Thread t3 = new Thread(mt3,"线程C");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
