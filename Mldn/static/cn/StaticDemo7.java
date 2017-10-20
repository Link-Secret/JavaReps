package cn;

class demo{
	private String name;
	private static int count =0;
	public demo(){
		count ++;
		this.name =" "+ count;
	}
	public demo(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}

public class StaticDemo7 {
    public static void main(String args[]){
    	System.out.println(new demo().getName());
    	System.out.println(new demo("杨蛋蛋").getName());
    	System.out.println(new demo().getName());
    }
}
