package cn.edu.no2;

abstract class D{
	public abstract void say();
}
class F extends D {
	
	public  void say(){
		System.out.println("sss");
	}	
}

abstract class T extends D{
	
}

class M extends F{
	
}

public class Test {
   public static void main(String args[]){
	   M m = new M();
	   m.say();
   }
}
