package cn.edu.practice;

class Check {
	public boolean validate(String name,String password){
		if(name.equals("admin") && password.equals("password")){
			return true;
		}else{
			return false;
		}
	}
}

class Operate {
	private String info[];
	public Operate(String info[]){
		this.info = info;
	}
	public String login(){
		Check check = new Check();
		this.isExit();
		
		String name = info[0];
		String password = info[1];
		String str = null;
		if(check.validate(name, password)){
			str = "欢迎"+ name + "！";
		}else{
			str = "错误";
		}
		return str;
	}
	
	public void isExit(){
		if(this.info.length != 2){
			System.out.println("参数不正确");
		    System.exit(1);
		}
	}
}


public class LoginDemo2{
	public static void main(String args[]){
		Operate oper = new Operate(args);
		System.out.println(oper.login());
	}
}

