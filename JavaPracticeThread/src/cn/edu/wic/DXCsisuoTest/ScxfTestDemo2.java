package cn.edu.wic.DXCsisuoTest;


class Info2 {
	private String name = "zjl";
	private String context = "加油，努力";
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

class Producer2 implements Runnable{
	private Info2 info = null;
	 public Producer2(Info2 info){
		 this.info=info;
	 }
	 public void run(){
		 boolean flag = false;
		 for(int i=0;i<20;i++){
			 if (flag)
			{
				this.info.set("zjl", "努力，加油");
				flag=false;
			}
			else
			{
                this.info.set("zjl+", "我一定会成功");
                flag=true;
			}
		 }
	 }
}

class Consumer2 implements Runnable{
	private Info2 info = null;
	public Consumer2(Info2 info){
		this.info=info;
	}
	public void run(){
	    for(int i=0;i<20;i++){
	    	this.info.get();
	    }
	}
}

public class ScxfTestDemo2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Info2 info = new Info2();
		Producer2 producer2 = new Producer2(info);
		Consumer2 consumer2 = new Consumer2(info);
		
		new Thread(producer2).start();
		new Thread(consumer2).start();

	}

}
