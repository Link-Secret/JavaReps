package regex;

import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String args[]){
		String str = "12a3456";
		if(Pattern.compile("[0-9]+").matcher(str).matches()){
			System.out.println("由数字组成");
		}else{
			System.out.println("不是数字组成");
		}
	}
}
