package cn2;
/*
 * 对象数组的静态初始化
 */
class Person {
	private String name;
	public Person(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}

public class ObjectArrayDemo2 {
     public static void main(String args[]){
    	 Person per[] = {new Person("p1"),new Person("p2"),new Person("p3")};
    	 int a[] = {1,2,3};
    	 for(int i=0;i<per.length;i++){
    		 System.out.println(per[i].getName());
    		 System.out.println(a[i]);
    	 }
     }
}
