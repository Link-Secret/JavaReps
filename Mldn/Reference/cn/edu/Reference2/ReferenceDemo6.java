package cn.edu.Reference2;

class Person {
	private String name;
	private int age;
	private Person child;
	private Book b;
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
	public Person getChild(){
		return child;
	}
	public void setChild(Person child){
		this.child = child;
	}
	public Book getBook(){
		return b;
	}
	public void setBook(Book b){
		this.b = b;
	}
}

class Book {
	private String title;
	private float price;
	private Person p;
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
		return p;
	}
	public void setPerson(Person per){
		this.p = per;
	}
}

public class ReferenceDemo6 {
    public static void main(String args[]){
    	Person per = new Person("zz",20);
    	Person chi = new Person("zzz",10);
    	Book bo = new Book("book1",100.0f);
    	Book b = new Book("一千零一夜",40.0f);
    	
    	//设置对象间的关系
    	per.setBook(bo);
    	chi.setBook(b);
    	bo.setPerson(per);
    	b.setPerson(chi);
    	per.setChild(chi);
    	
    	System.out.println("从父亲找到儿子"+per.getChild().getName()
    			+per.getChild().getBook().getTitle()+per.getChild().getBook().getPrice());
        
    
    }
}
