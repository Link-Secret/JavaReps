package cn.edu.base;

class Person {
	String name;
	int age;
	int a[] = new int[]{2,3,3};
	public void say(){
		System.out.println(name + "--" + age);
	}
	
}

public class ClassDemo5 {
    public static void main(String args[]){
    	Person per1 = null;
    	Person per2 = null;
    	per1 = new Person();
    	per2 = per1;
    	per1.name = "p1";
    	per1.age = 1;
    	per2.name = "p2";
    	per1.say();
    	per2.say();    	
    }
	
	
}
