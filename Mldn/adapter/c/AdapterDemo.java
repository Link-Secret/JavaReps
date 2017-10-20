package c;

interface Window {
	public abstract void open();
	public abstract void close();
	public abstract void a();
	public abstract void b();
}

abstract class WindowAdapter implements Window {
	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
}

class Windowimp extends WindowAdapter {
	public void open(){
		System.out.println("open");
	}
	public void close(){
		System.out.println("close");
	}
}


public class AdapterDemo {
    public static void main(String args[]){
    	Windowimp win = new Windowimp();
    	win.open();
    	win.close();
    }
}
