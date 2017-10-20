package c;

class Personnel {
	private String name;
	private int age;
	private String sex;
	public Personnel(String name,int age,String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void print(){
		System.out.println(this.name + this.age +this.sex);
	}
}

class Administrater extends Personnel {
    private String post;
    private int AnnualPay;
	public Administrater(String name, int age, String sex,String post,int AnnualPay) {
		super(name, age, sex);
		this.post = post;
		this.AnnualPay = AnnualPay;
	}	
}

class worker extends Personnel {
    private String sector;
    private int salary;
	public worker(String name, int age, String sex,String sector,int salary) {
		super(name, age, sex);
		this.sector = sector;
		this.salary = salary;
		}
	}
