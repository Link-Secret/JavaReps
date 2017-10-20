package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {

	public static void main(String args[]){
		List<Student> allstudent = new ArrayList<Student>(); 
		Student st1 = new Student(1, "一",11);
		Student st2 = new Student(2,"二",22);
		Student st3 = new Student(3,"三",33);
		Student st4 = new Student(4,"四",44);
		Student st5 = new Student(5, "五", 55);
		
		allstudent.add(st1);
		allstudent.add(st2);
		allstudent.add(st3);
		allstudent.add(st4);
		allstudent.add(st5);
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(st5);
		
		System.out.println("---");
		
		System.out.println(allstudent);
		
		Iterator<Student> i = allstudent.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
