package cn.edu.inter3;

interface A {
	public static final String name = "zz";  //全局常量
	public abstract void print();
	
}

interface B {
	public abstract void say();
}

interface C extends A,B {
	//此时抽象类B中有A接口的一个抽象方法
}


class X implements C{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}

	


}

public class InterfaceDemo03 {
	public static void main(String args[]){
		X x = new X();
		x.print();
	}
}