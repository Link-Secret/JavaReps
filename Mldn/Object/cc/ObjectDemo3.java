package cc;

class Person {
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){
		//如果地址相同则肯定相同
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Person)){
			return false;
		}
		//对属性进行判断
		Person per = (Person)obj;
		//使用字符串中覆写object父类的equals方法，比较每个字符是否相等
		if(per.name.equals(this.name) && per.age==this.age){
			return true;
		}else{
			return false;
		}
	}
	public String toString(){
		return "1."+this.name +"2." +this.age;
	}
}


public class ObjectDemo3 {
    public static void main(String args[]){
    	Person p1 = new Person("la",2);
    	Person p2 = new Person("la",3);
    	System.out.println(p1.equals(p2));
    	System.out.println(p1.equals("蛋"));
    	System.out.println(p1);
    }
}
