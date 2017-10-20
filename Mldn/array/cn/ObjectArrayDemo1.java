package cn;
/*
 * 对象数组的动态初始化
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

public class ObjectArrayDemo1 {
    public static void main(String args[]){
    	Person per[] = new Person[3];
    	int a[] = new int[3];
    	for(int i=0;i<per.length;i++){
    		System.out.print(per[i]+"..");
    		System.out.println(a[i]);
    	}
    	System.out.println();
        per[0] = new Person("p1");
        per[1] = new Person("p2");
        per[2] = new Person("p3");
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for(int i=0;i<per.length;i++){
        	System.out.println(per[i].getName());
        	System.out.println(a[i]);
        }
    }
}
