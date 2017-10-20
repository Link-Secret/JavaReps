package oneToMany;

import java.util.ArrayList;
import java.util.List;

public class School {

	private String name;      //学校名字
	private List<Student> allStudents;
	
	public School(){
		this.allStudents = new ArrayList<Student>();
	}
	
	public School(String name){
		this();
		this.setName(name);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public List<Student> getAllStudents(){
		return this.allStudents;
	}
	
	public String toString(){
		return "校名"+this.name ;
	}
}
