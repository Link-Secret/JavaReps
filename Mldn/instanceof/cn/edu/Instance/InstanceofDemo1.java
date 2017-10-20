package cn.edu.Instance;

class A{
	public void fun1(){
		System.out.println("A_fun1");
	}
	public void fun2(){
		System.out.println("A-fun2");
	}
}

class B extends A{
	public void fun1(){
		System.out.println("B-fun1");
	}
	public void fun3(){
		System.out.println("B-fun3");
	}
}

public class InstanceofDemo1 {
    public static void main(String args[]){
    	A a = new A();
    	System.out.println(a instanceof A);
    	System.out.println(a instanceof B);
    }
}
