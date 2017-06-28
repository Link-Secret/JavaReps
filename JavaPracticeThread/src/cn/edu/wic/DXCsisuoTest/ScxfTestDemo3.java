package cn.edu.wic.DXCsisuoTest;


class Info3 {
	private String name = "zjl";
	private String context = "加油，努力";
	boolean flag = false;
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
	
	public synchronized void set(String name, String context){  //同步方法
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
		   flag = false;
		   super.notify();
		
		}
	
	public synchronized void get(){              //同步方法，将get，set方法封装到同步方法中
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
		System.out.println(this.getName()+"---"+this.getContext());
		flag = true;
		super.notify();
	 }
	}


class Producer3 implements Runnable{
	private Info3 info = null;
	public Producer3 (Info3 info){  //有参数构造方法，就可以向线程添加参数
		this.info=info;
	}
	public void run(){
	   boolean flag = false;
	   for(int i=0;i<20;i++){
		   if (flag)
		{
			this.info.set("zjl", "加油，努力");
			flag = false;
		}
		else
		{
             this.info.set("zjl", "我一定会成功");
             flag=true;
		}
	   }
	}
}

class Consumer3 implements Runnable{
	private Info3 info =null;
	public Consumer3(Info3 info){
		this.info = info;
	}
	public void run(){
		for(int i=0;i<20;i++){
			this.info.get();
		}
	}
}

public class ScxfTestDemo3
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Info3 info = new Info3();
		Producer3 producer3 = new Producer3(info);
        Consumer3 consumer3 = new Consumer3(info);
        
        new Thread(producer3).start();
        new Thread(consumer3).start();
	}

}
