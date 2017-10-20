package cn.edu.no1;

abstract class A{
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	//有参数的构造方法
	public A(String name ,int age){
		this.setName(name);
		this.setAge(age);
	}
	//抽象方法
	public abstract String print();
}


class B extends A{
    private String school;
    public String getSchool(){
    	return school;
    }
    public void setSchool(String school){
    	this.school = school;
    }
	public B(String name, int age,String school) {
		super(name, age);
		this.setSchool(school);
	}

	@Override
	public String print() {
		return "姓名"+super.getName()+"年龄"+super.getAge()+
				"学校"+this.getSchool();
		
	}
	
}


public class AbstractDemo1{
	public static void main(String args[]){
		B b = new B("zz",12,"qh");
		System.out.println(b.print());
		
	}
}