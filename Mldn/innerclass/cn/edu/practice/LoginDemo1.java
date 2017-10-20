package cn.edu.practice;

public class LoginDemo1 {

	public static void main(String args[]){
		if(args.length != 2){
			System.out.println("参数个数不正确");
			System.out.println("格式 java LoginDemo01 用户名 密码");
			System.exit(1);
		}
		
		String name = args[0];
		String password = args[1];
		if(name.equalsIgnoreCase("admin") &&
				password.equalsIgnoreCase("123")){
			System.out.println("欢迎"+name+"登录");
		}else{
			System.out.println("错误的用户名或者密码");
		}
		
	}
	
}
