package cn.edu.thiss;

class Person{
	public String getInfo(){
		System.out.println("person类"+this);
		return null;
	}
}

public class ThisDemo6 {
    public static void main(String args[]){
    	Person per1 = new Person();
    	Person per2 = new Person();
    	per1.getInfo();
    	System.out.println("main"+per1);
    	per2.getInfo();
    	System.out.println("main"+per2);
    }
}
