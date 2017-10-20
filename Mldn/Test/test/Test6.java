package test;

public class Test6 {
   public static void main(String args[]){
	   String str = "11120170916111";
	   String s = str.substring(3,11);
	   System.out.println(s);
	   String s2 = str.replaceAll("111", "");
	   System.out.println(s2);
	   char s3 = str.charAt(8);
	   System.out.println(s3);
	   String s4 = str.replaceAll("1", "");
	   System.out.println(s4);
	   String str2 = "1 1 1 3 4 5";
	   String s5 = str2.replaceAll(" ", "");
	   System.out.println(s5);
   }
}
