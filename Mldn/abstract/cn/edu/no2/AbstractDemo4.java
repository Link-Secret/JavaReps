package cn.edu.no2;

abstract class A{
	public static final String flag = "zz";
	public String name = "ls";
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public abstract void print();
	//抽象方法没有方法体
}


class B extends A{

	@Override
	public void print() {
		System.out.println(flag);
		System.out.println(super.getName());
	}
	
}


public class AbstractDemo4 {
     public static void main(String args[]){
    	 B b = new B();
    	 b.print();
     }
	
}
