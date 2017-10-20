package singleMessage;

import java.io.Serializable;

public class Person implements Serializable{  //该类的对象可以被序列化
	
    /**
	 * 封装Person类，该类对象可被序列化
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String name;
    private int age;
    public Person(String name,int age){
    	this.setName(name);
    	this.setAge(age);
    }
    public String toString(){
    	return "姓名"+this.name +"年龄"+this.age;
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
}
