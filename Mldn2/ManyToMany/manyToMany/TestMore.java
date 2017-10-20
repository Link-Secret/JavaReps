package manyToMany;

import java.util.Iterator;
import java.util.List;

public class TestMore {

	public static void main(String args[]){
		Student st1 =  new Student("one", 11);
		Student st2 = new Student("two", 12);
		Student st3 = new Student("three", 13);
		
		Course c1 = new Course("java", 3);
		Course c2 = new Course("spring", 2);
		
		st1.getCourse().add(c1);
		st2.getCourse().add(c1);
		st2.getCourse().add(c2);
		st3.getCourse().add(c2);
		                                //双向关系
		c1.getStudent().add(st1);
		c1.getStudent().add(st2);
		c2.getStudent().add(st2);
		c2.getStudent().add(st3);
		
		System.out.println(st1);
		Iterator<Course> iter1 = st1.getCourse().iterator();
		while(iter1.hasNext()){
			System.out.print(iter1.next());
		}
		System.out.println();
		System.out.println("---");
		
		System.out.println(st3);
		Iterator<Course> iter2 = st3.getCourse().iterator();
		while(iter2.hasNext()){
			System.out.print(iter2.next());
		}
		System.out.println();
		System.out.println("....");
		
		System.out.println(c2);
		for(Student i : c2.getStudent()){
			System.out.println(i);
		}
		
	}
}
