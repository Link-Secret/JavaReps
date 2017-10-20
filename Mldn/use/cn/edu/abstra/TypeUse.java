package cn.edu.abstra;
/*
 * 模板设计
 */
abstract class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void say(){
		System.out.println(this.getContent());;
	}
	public abstract String getContent();
}

class Student extends Person{
	private double score;
    public Student(String name, int age,float score) {
		super(name, age);
		this.score = score;
	}
	
	@Override
	public String getContent() {
		return "1." + super.getName()+"2."+super.getAge()+"3."+this.score;
	}
	
}

class Worker extends Person{
	private double solary;
	public Worker(String name, int age,double solary) {
		super(name, age);
		this.solary = solary;
		
	}

	@Override
	public String getContent() {
		return "1." + super.getName()+"||2."+super.getAge()+"||3."+this.solary;
	}
	
}

public class TypeUse {
    public static void main(String args[]){
    	Person per1 = null;
    	Person per2 = null;
    	per1 = new Student("11", 22, 20000);
    	per2 = new Worker("ss", 21, 22000);
    	per1.say();
    	per2.say();
    }
}
