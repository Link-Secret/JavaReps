package manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String name;
	private int credit;
	private List<Student> allStudent;
	
	public Course(){
		this.allStudent = new ArrayList<Student>();
	}
	public Course(String name,int credit){
		this();
		this.setName(name);
		this.setCredit(credit);
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getCredit(){
		return credit;
	}
	public void setCredit(int credit){
		this.credit = credit;
	}
	
	public List<Student> getStudent(){
		return this.allStudent;
	}
	
	public String toString(){   //覆写toString方法
		return "课程名"+this.name + "学分"+this.credit;
	}
}
