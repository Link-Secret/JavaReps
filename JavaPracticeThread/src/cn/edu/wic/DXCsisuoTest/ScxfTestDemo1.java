package cn.edu.wic.DXCsisuoTest;

class Info{
	private String name = "zjl";
	private String context = "加油,努力";

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getContext()
	{
		return context;
	}
	public void setContext(String context)
	{
		this.context = context;
	}
	
	public synchronized void set(String name,String context){
		this.setName(name);
		try
		{
			Thread.sleep(30);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		this.setContext(context);
		
	}
	public synchronized void get(){
		
		try
		{
			Thread.sleep(30);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(this.getName()+"-->"+this.getContext());
	}
}

class producer implements Runnable{
	  private Info info = null;
	  public producer(Info info){
		  this.info= info;
	  }
	  public void run(){
		  boolean flag = false;
		  for(int i=0;i<20;i++){
			  if(flag){
				this.info.set("zjl", "加油努力");
				  flag= false;
			  }else {
				this.info.set("zjl", "我一定会成功的");
					  flag=true;
				  }
		  }
	  }
}

class Consumer implements Runnable{
	private Info info = null;
	public Consumer(Info info){
		this.info=info;
	}
	public void run(){
		for(int i=0;i<20;i++){
			try
			{
				Thread.sleep(130);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
	 	  this.info.get();
	  }
	}
}

public class ScxfTestDemo1
{

	/**
	 * 解决：线程生产完才能获取
	 */
	public static void main(String[] args)
	{
		Info i = new Info();
		producer producer = new producer(i);
		Consumer consumer = new Consumer(i);
		
		new Thread(producer).start();
        new Thread(consumer).start();
	}

}
