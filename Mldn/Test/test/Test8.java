package test;

class Blank{
	private String name;
	private int balance;
	public Blank(String name,int balance){
		this.setName(name);
		this.balance = balance;
	}
	public int getBalance(){
		return balance;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}

public class Test8 {
    public static void main(String args[]){
    	Blank blank = new Blank("zz",0);
    	
    	System.out.println(blank.getBalance());
    }
}
