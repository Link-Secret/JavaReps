package test;

public class Test3 {
  public static void main(String args[]){
	  String str1 = "want you to konw one things nnn";
	  int r[] = compare(str1);
	  System.out.println("n-->"+r[0]);
	  System.out.println("o-->"+r[1]);
  }
  
  public static int[] compare(String s1){
	 char c[] = s1.toCharArray();
	 int countn = 0;
	 int counto = 0;
	 for(char ch :c){
		 if(ch == 'n'){
			 countn++;
		 }
		 if(ch == 'o'){
			 counto++;
		 }
	 }
	 int a[] = {countn,counto};
	 return a;
  }
}
