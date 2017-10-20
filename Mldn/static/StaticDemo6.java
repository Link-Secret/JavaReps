
class Demo {
	private static int count = 0;
	public Demo(){
		count++;
		System.out.println(count);
	}
}

public class StaticDemo6 {
      public static void main(String args[]){
    	  new Demo();
    	  new Demo();
    	  new Demo();
      }
}
