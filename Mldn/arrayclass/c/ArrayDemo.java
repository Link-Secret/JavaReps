package c;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String args[]){
		int temp[] = {1,2,3,4,5,6};
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		int point = Arrays.binarySearch(temp, 3); //检索元素3在temp中的下标
		System.out.println(point);
		Arrays.fill(temp, 222);   //填充数组的所有元素
		System.out.println(Arrays.toString(temp));
	}
}
