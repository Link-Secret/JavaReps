package comparable;

import java.util.Arrays;

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private float score;
    
    public Student(String name,int age,float score){
    	this.name  = name;
    	this.age = age;
    	this.score = score;
    }
	
    public String toString(){
    	return name+"\t\t"+age +"\t\t"+score;
    }
    
	@Override
	public int compareTo(Student st) {
		if(this.score>st.score){
			return -1;
		}
		else if(this.score<st.score){
			return 1;
		}else {
			if(this.age>st.age){
				return 1;
			}else if(this.age<st.age){
				return -1;
			}else{
				return 0;
			}
		}
	}
	
}

public class ComparableDemo {
    public static void main(String args[]){
    	Student stu[] = {new Student("a",2,2.0f),new Student("b",3,3),new Student("c",3,3),new Student("d",1,1.1f)};
        Arrays.sort(stu);
        for(int i=0;i<stu.length;i++){
        	System.out.println(stu[i]);
        }
    }
}
