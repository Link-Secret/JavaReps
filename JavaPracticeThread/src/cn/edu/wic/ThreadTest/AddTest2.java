package cn.edu.wic.ThreadTest;
/**
 * 
 * 四个线程操作一个数据--内部类方法
 *
 */
public class AddTest2
{
    private int j;
	public static void main(String[] args)
	{
		AddTest2 addTest2 = new AddTest2();
		
		Inc inc = addTest2.new Inc();
		Dec dec = addTest2.new Dec();
		
		for(int i=0;i<2;i++){
			new Thread(inc).start();
			new Thread(dec).start();
		}

	}
	
	private synchronized void inc(){
		j++;
		System.out.println(Thread.currentThread().getName()+"--inc"+j);
	}
	
	private synchronized void dec(){
		j--;
		System.out.println(Thread.currentThread().getName()+"--dec"+j);
	}
	
	class Inc implements Runnable{
		public void run(){
			for(int i=0;i<20;i++){
				inc();
			}
		}
	}
	
	class Dec implements Runnable{
		public void run(){
			for(int i=0;i<20;i++){
				dec();
			}
		}
	}
}
