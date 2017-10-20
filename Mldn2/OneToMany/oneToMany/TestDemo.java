package oneToMany;

import java.util.Iterator;

public class TestDemo {

	public static void main(String args[]){
		School school = new School("beida");
		Student st1 = new Student("one", 12);
		Student st2 = new Student("two", 15);
		Student st3 = new Student("three", 20);
		school.getAllStudents().add(st1);
		school.getAllStudents().add(st2);
		school.getAllStudents().add(st3);
		st1.setSchool(school);
		st2.setSchool(school);
		st3.setSchool(school);
		System.out.println(school);
		
		Iterator<Student> iter = school.getAllStudents().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
