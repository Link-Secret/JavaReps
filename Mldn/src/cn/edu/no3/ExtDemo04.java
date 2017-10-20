package cn.edu.no3;

class Person{					// 定义Person类
	private String name ;		// 定义name属性
	private int age ;			// 定义age属性
	public void setName(String name){
		this.name = name;	
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return this.name ;
	}
	public int getAge(){
		return this.age ;
	}
	
	public Person(){
		System.out.println("父类构造方法");
	}
	
	 void print(){
		System.out.println("父类的print方法");
	}
	
};

class Student extends Person{					// 定义Student类
	private String school;
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public Student(){
		System.out.println("子类构造方法");
	}
	
};


public class ExtDemo04{
	public static void main(String arsg[]){
		Student stu = new Student()	;// 实例化子类对象
		stu.setName("张三") ;	// 此方法在Student类中没有明确定义
		stu.setAge(30) ;
		stu.setSchool("清华");
		System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge()+stu.getSchool() ) ;

	}
};
