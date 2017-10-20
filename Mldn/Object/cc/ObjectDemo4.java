package cc;

interface A {
	public abstract String getInfo();
}

class B implements A {

	@Override
	public String getInfo() {
		return "hello dandan";
	}
	
}

public class ObjectDemo4 {
   public static void main(String args[]){
	   A a = new B();   //接口实例化
	   Object obj = a;   //向上转型
	   A x = (A)obj;      //向下转型
	   System.out.println(x.getInfo());
	   
   }
}
