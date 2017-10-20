package cn.edu.factory;

interface Fruit{
	public abstract void eat();
}

class Apple implements Fruit {

	@Override
	public void eat() {
		System.out.println("eat apple");
	}
}

class Orange implements Fruit {

	@Override
	public void eat() {
		System.out.println("eat orange");
	}
	
}

class Factory {
	//根据需要来实例化对象
	public static Fruit getInstance(String className){
		Fruit fruit = null;
		if("apple".equals(className)){
			fruit = new Apple();
		}
		if("orange".equals(className)){
			fruit = new Orange();
		}
		return fruit;
	}
}


public class InterfaceCaseDemo4 {
      public static void main(String args[]){
    	  Fruit fruit = null;
    	  fruit = Factory.getInstance("apple");
    	  //调用工厂方法取得实例
    	  fruit.eat();
      }
}
