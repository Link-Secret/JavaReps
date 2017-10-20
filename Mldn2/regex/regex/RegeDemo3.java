package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegeDemo3 {

	public static void main(String args[]){
		String str = "1970-01-01";
		String pat = "\\d{4}-\\d{2}-\\d{2}";
		Pattern p = Pattern.compile(pat);  //实例化pattern类
		Matcher m = p.matcher(str);
		if(m.matches()){
			System.out.println("格式合法");
		}else{
			System.out.println("日期格式不合法");
		}
	}
}
