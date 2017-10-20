package cn.edu;

class Demo {
	public Demo(){
		System.out.println("构造方法");
	}
	{
		System.out.println("构造代码块优先于构造方法");
	}
}

public class CodeDemo1 {
   public static void main(String args[]){
	   System.out.println("普通代码块");
	   new Demo();
   }
}
