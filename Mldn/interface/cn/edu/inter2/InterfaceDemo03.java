package cn.edu.inter2;

interface A {
	public static final String name = "zz";  //全局常量
	public abstract void print();
	
}

abstract class B implements A {
	//此时抽象类B中有A接口的一个抽象方法
}


class X extends B{

	

	@Override
	public void print() {
		System.out.println("hello");
		
	}

}

public class InterfaceDemo03 {
	public static void main(String args[]){
		X x = new X();
		x.print();
	}
}