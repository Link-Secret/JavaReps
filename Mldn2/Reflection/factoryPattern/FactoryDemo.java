package factoryPattern;

interface Fruit {
	public abstract void eat();
}

class Apple implements Fruit {

	@Override
	public void eat() {
		System.out.println("apple");
	}
	
}

class Orange implements Fruit {

	@Override
	public void eat() {
		System.out.println("orange");
	}	
}

class Factary {
	public static Fruit getInstance(String className){  
		//该方法取得接口的实例--通过classname来决定实例化哪个实现类的实例化对象
		Fruit fruit = null;
		try {
			fruit = (Fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fruit;
	}
}


public class FactoryDemo {
     public static void main(String args[]){
    	 Fruit f = Factary.getInstance("factoryPattern.Orange");
    	 if(f != null){
    		 f.eat();
    	 }
     }
}
