package coin;

import java.util.HashMap;
import java.util.Scanner;


public class Coin {
    private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
    
    public Coin(){  //构造函数、
    	coinnames.put(1, "one");
    	coinnames.put(2,"two");
    	coinnames.put(10, "ten");
    	
    	System.out.println(coinnames.keySet().size());  //输出coinsname（hashmap类型）的key值的size
    	System.out.println(coinnames);  //输出hashmap
    	
    	for(Integer k : coinnames.keySet()){   //遍历coinsname并输出，对于coinsname里面的key值（integer）
    		String s = coinnames.get(k);       //get k的值再赋给s
    		System.out.println(s);
    	}
    }
    
    public String getName(int amount){  //接口
    	if(coinnames.containsKey(amount))   //如果存在contains这个key(amount)
    	  return coinnames.get(amount); 
    	else 
			return "NOT FOUND";	
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();    //创建对象
		String name = coin.getName(amount);  //将对象get的amount传给name
		System.out.println(name);    //输出name

	}

}
