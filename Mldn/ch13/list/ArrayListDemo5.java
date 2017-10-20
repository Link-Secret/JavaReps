package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String args[]){
		List<String> allList = null;
		allList = new ArrayList<String>();
		allList.add("hello");
		allList.add(0, "world");
		allList.add("mldn");
		List<String> allsub = allList.subList(2, 3);
		for(int i=0;i<allsub.size();i++){
			System.out.println(allList.get(i)+",");
		}
		System.out.println(allList);
		System.out.println(allsub);
	}
}
