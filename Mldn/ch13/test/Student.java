package test;

class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int result;
	
	public Student(int id,String name,int result){
		this.setId(id);
		this.setName(name);
		this.setResult(result);
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String name(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getResult(){
		return result;
	}
	public void setResult(int result){
		this.result = result;
	}
	
	
	public String toString(){
		return "id"+this.id+"姓名"+this.name+"成绩"+this.result;
	}

	@Override
	public int compareTo(Student s) {
		if(this.result>s.result){
			return -1;
		}else if(this.result==s.result){
			return 0;
		}else{
			return 1;
		}
		
	}
	
	
}

