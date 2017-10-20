package cn.edu.Reference;

import cn.edu.Reference.Book;
import cn.edu.Reference.Person;

class Person {
	private String name;
	private int age;
	private Book book;
	public Person(String name,int age){
		this.setName(name);
		this.setAge(age);
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
	public Book getBook(){
		return book;
	}
	public void setBook(Book book){
		this.book = book;
	}
}

class Book {
	private String title;
	private float price;
	private Person person;
	public Book(String title,float price){
		this.setTitle(title);
		this.setPrice(price);
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public float getPrice(){
		return price;
	}
	public void setPrice(float price){
		this.price = price;
	}
	public Person getPerson(){
		return person;
	}
    public void setPerson(Person person){
    	this.person = person;
    }
}


public class ReferenceDemo5 {
    public static void main(String args[]){
    	Person per = new Person("zz",18);
    	Book bo = new Book("JAVASE开发核心", 80.0f);
    	
    	//设置一对一关系
    	per.setBook(bo);
    	bo.setPerson(per);
    	
    	//定义从人找到书
    	System.out.println("定义从人找到书"+per.getName()+per.getAge()
    	+per.getBook().getTitle()+per.getBook().getPrice());
    	//定义从书找到人
    	System.out.println("定义从书找到人"+bo.getTitle()+bo.getPrice()
    	+bo.getPerson().getName()+bo.getPerson().getAge());
    }
}
