package cn.edu.wic.DXCsisuo;



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
}

    class producer implements Runnable{
    	private Info info = null;
    	public producer(Info info){
    		this.info=info;
    	}
    	public void run(){
    	  boolean flag = false;
    	  for(int i=0;i<10;i++){
    		
    		if(flag){
    			this.info.setName("zjl");
    			try
				{
					Thread.sleep(90);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
    			this.info.setContext("加油,努力");
    			flag = false;
    		}else{
    			this.info.setName("我是zjl");
    			try
				{
					Thread.sleep(90);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
    			this.info.setContext("我一定会成功的");
    			flag = true;
    		}
    	  }
    	}
    }

    
    class Consumer implements Runnable{
    	private Info info = null;
    	public Consumer(Info info){
    		this.info = info;
    	}
    	
    	public void run(){
    		for(int i=0;i<10;i++){
    		try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
    		System.out.println(this.info.getName()+"----->"+this.info.getContext());
    	 }	
    	}
    	
    }

public class ScXfTest
{
	/**
	 * 
	 */
	public static void main(String[] args)
	{
		Info i = new Info();
		producer pr = new producer(i);
		Consumer con = new Consumer(i);
		
		new Thread(pr).start();
		new Thread(con).start();
		

	}

}
