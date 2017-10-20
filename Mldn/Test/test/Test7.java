package test;

class Personnel {
	@SuppressWarnings("unused")
	private int id;
	private String name;
	private float salary;
	@SuppressWarnings("unused")
	private String department;
	public Personnel() {
		
	}
	public Personnel(String name) {
		this.name = "无名氏";
		this.salary = 0.0f;
	}
	public Personnel(int id,String name){
		this.id = id;
		this.name = name;
	}
	public Personnel(int id,String name,float salary,String department){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public String getName(){
		return name;
	}
	public float getSalary(){
		return salary;
	}
}

public class Test7 {
    public static void main(String args[]){
    	Personnel per1 = new Personnel("无名");
    	System.out.println(per1.getName()+per1.getSalary());
    }
}
