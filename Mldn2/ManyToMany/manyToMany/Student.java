package manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private int age;
	private List<Course> allCourse;
	
	public Student(){             //无参构造函数实例化Course集合
		this.allCourse = new ArrayList<Course>();
	}
	public Student(String name,int age){  //构造函数调用无参构造函数，初始化对象
		this();
		this.setAge(age);
		this.setName(name);
	}
	
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
	
	public List<Course> getCourse(){
		return this.allCourse;
	}
	
	public String toString(){
		return "学生姓名"+this.name +"学生年龄"+this.age;
	}
}
