package cn.edu.cast;

class A {
	public void fun1(){
		System.out.println("A-fun1");
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


public class Cast1 {
      public static void main(String args[]){
    	  A a = new B();
    	  a.fun1();
      }
}
