package cn.edu2;

class singleton {
	private static singleton instance = new singleton();
	private singleton(){
		
	}
	public static singleton getinstance(){
		return instance;
	}
	public void print(){
		System.out.println("hello,world");
	}
}


public class SingleDemo5 {
    public static void main(String args[]){
    	singleton sin = null;
    	sin = singleton.getinstance();
    	sin.print();
    }
}
