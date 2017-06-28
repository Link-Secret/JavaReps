package cn.edu.wic.renshiDXC;

  class MyThread extends Thread{
	  private String name;
	  private String password;
	  
	  public MyThread(String name,String password){
		  this.name = name;
		  this.password = password;
	  }
	  
	 @Override
	  public void run(){
		  for(int i=0;i<5;i++){
			  System.out.println(name+":你的密码为"+password);
		  }
	  }
  }


public class ThreadDemo1
{

	/**
	 * 继承Thread实现多线程
	 */
	public static void main(String[] args)
	{
		MyThread mt1 = new MyThread("A", "admin");
		MyThread mt2 = new MyThread("B", "Badmin");
		
		mt1.start();
		mt2.start();

	}

}
