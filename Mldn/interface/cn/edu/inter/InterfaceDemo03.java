package cn.edu.inter;

interface A {
	public static final String name = "zz";  //全局常量
	public abstract void print();
	
}

interface B {
	public abstract void say();
}


class X implements A , B{

	@Override
	public void say() {
		System.out.println("--"+name);
		
	}

	@Override
	public void print() {
		System.out.println("hello");
		
	}

}

public class InterfaceDemo03 {
	public static void main(String args[]){
		X x = new X();
		x.say();
		x.print();
	}
}