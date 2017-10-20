package c;

class Person {
	private String name;
	private String addr;
	private char sex;
	private int age;
	public Person(String name,String addr,char sex,int age){
		this.name = name;
		this.addr = addr;
		this.sex = sex;
		this.age = age;
	}
	public Person(String name,String addr){
		this.name = name;
		this.addr = addr;
	}
	public Person(){
		
	}
	public void print(){
		System.out.println(this.name+this.addr+this.sex+this.age);
	}
	public String getName( ){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAddr(){
		return addr;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public char getSex(){
		return sex;
	}
	public void setSex(char sex){
		this.sex = sex;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}


class Student extends Person {
	private int math;
	private int english;
	public Student(String name,String addr,char sex,int age,int math,int english){
		super(name, addr, sex, age);
		this.math = math;
		this.english = english;
	}
	public Student(int math,int english){
		this.math = math;
		this.english = english;
	}
	public Student(){
		
	}
	public void print(){
		System.out.println(super.getName()+super.getAddr()+super.getSex()+super.getAge()+this.math+this.english);
	}
}

public class Test3 {
    public static void main(String args[]){
    	Person p = new Person("zz", "z", 'm', 2);
    	Student s = new Student("ss", "s", 'w', 3, 234, 567);
    	p.print();
    	s.print();
    }
}
