package obser;

import java.util.Observable;
import java.util.Observer;

class House extends Observable {
	private float price;
	public House(float price){
		this.price = price;
	}
	public float getPrice(){
		return price;
	}
	public void setPrice(float price){
		super.setChanged();       //设置变化点
		super.notifyObservers(price);   //通知观察者价格变动
		this.price = price;
	}
	public String toString(){
		return "房子价格为"+this.price;
	}
}

class HousePriceObserver implements Observer{
	private String name;
	public HousePriceObserver(String name){
		this.name = name;
	}
	@Override
	public void update(Observable ob, Object arg) {
		if(arg instanceof Float){
			System.out.print(this.name + "观察到价格修改为");
			System.out.println(((Float)arg).floatValue());
		}
	}
}

public class ObserDemo1 {

	public static void main(String args[]){
		House h = new House(100000);
		HousePriceObserver hp1 = new HousePriceObserver("观察者a");
		HousePriceObserver hp2 = new HousePriceObserver("观察者b");
		HousePriceObserver hp3 = new HousePriceObserver("观察者c");
		h.addObserver(hp1);
		h.addObserver(hp2);
		h.addObserver(hp3);
		System.out.println(h);
		h.setPrice(2000);
		System.out.println(h);
	}
}
