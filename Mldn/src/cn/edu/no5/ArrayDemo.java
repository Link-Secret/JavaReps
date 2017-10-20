package cn.edu.no5;

import java.util.Arrays;

class Array{
     private int[] temp;
     private int foot;
     public Array(int len){
    	 if(len>0){
    		 this.temp = new int[len];
    	 }else{
    		 this.temp = new int[1];
    	 }
     }
     
     public boolean add(int i){
    	 if(foot<temp.length){
    		 temp[foot] = i;
    		 foot++;
    		 return true;
    	 }
    	 return false;
     }
     
     public int[] getArray(){
    	 return this.temp;
     }
}

/*
 * 反转类
 */

class ReverseArray extends Array{

	public ReverseArray(int len) {
		super(len);
		// TODO Auto-generated constructor stub
	}

	public int[] getArray(){
		int count = super.getArray().length-1;
		int t[] = new int[super.getArray().length];
		for(int i = 0;i<super.getArray().length;i++){
			t[i] = super.getArray()[count];
			count--;
		}
		return t;
	}


}

/*
 * 排序类
 */

class SortArray extends Array{
       public SortArray(int len) {
		super(len);
		// TODO Auto-generated constructor stub
	}

	public int[] getArray(){
    	   Arrays.sort(super.getArray());
    	   return super.getArray();
       }

}

/*
 * 测试反转类
 */
  public class ArrayDemo {
     public static void main(String args[]){
    	 ReverseArray rev = new ReverseArray(5);
    	 System.out.println(rev.add(5));
    	 System.out.println(rev.add(6));
    	 System.out.println(rev.add(8));
    	 System.out.println(rev.add(2));
    	 System.out.println(rev.add(4));
    	 System.out.println(rev.add(9));
    	 print(rev.getArray());
     }
     public static void print(int x[]){
    	 for(int i=0;i<x.length;i++){
 			System.out.print(x[i]+",");
 		}
     }
}



/**
 * 测试排序类
 * 
 */
/*public class ArrayDemo {
	public static void main(String args[]){
		SortArray sa = new SortArray(5);
	   	 System.out.println(sa.add(6));
	   	 System.out.println(sa.add(8));
	   	 System.out.println(sa.add(2));
	   	 System.out.println(sa.add(4));
	   	 System.out.println(sa.add(9));
	   	 print(sa.getArray());
	}
	public static void print(int x[]){
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]+",");
		}
	}
}*/