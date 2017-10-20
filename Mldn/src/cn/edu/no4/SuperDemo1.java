package cn.edu.no4;

    class Person {
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
    	public Person(String name , int age){
    		this.setAge(age);
    		this.setName(name);
    	}
    	
    	public String getInfo(){
    		return "姓名"+this.getName() + "年龄："+this.getAge();
    	}
    }

    class Student extends Person{

		public Student(String name, int age ,String school) {
			super(name, age);
			this.setSchool(school);
		}
		
		private String school;
		public String getSchool(){
			return school;
		}
		public void setSchool(String school){
			this.school = school;
		}
    	
		public String getInfo(){
			return super.getInfo()+"学校"+this.getSchool();
		}
    }
    
    public class SuperDemo1{
    	public static void main(String [] args){
    		Student stu = new Student("zz", 19, "北大");
    		System.out.println(stu.getInfo());
    	}
    }
