package cn.edu.wic.renshiDXC;

      class MyThread2 implements Runnable{

	  private String name;
	  
	  public MyThread2(String name){
		  this.name=name;
	  }
	  
	   @Override
	  public void run(){
		  for(int i=0;i<3;i++){
			  System.out.println(name+":数字为"+i);
		  }
	  }
}


public class RunnableDemo1
{

	/**
	 * 实现Runnable接口实现多线程
	 */
	public static void main(String[] args)
	{
		MyThread2 mt1 = new MyThread2("A");
		MyThread2 mt2 = new MyThread2("B");
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);   //还是要实例化Thread方法，因为需要start方法调用run方法
		
		t1.start();
		t2.start();

	}

}
