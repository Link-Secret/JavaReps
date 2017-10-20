package cn.edu.inter;

interface USB{
	public abstract void start();
	public abstract void stop();
}

class Flash implements USB{
	@Override
	public void start() {
		System.out.println("flash start");	
	}

	@Override
	public void stop() {
		System.out.println("flash stop");		
	}	
}


class Print implements USB {
	@Override
	public void start() {
		System.out.println("Print start");	
	}

	@Override
	public void stop() {
		System.out.println("Print stop");
	}	
}

class Computer {
	public static void plugin(USB usb){
		usb.start();
		System.out.println("usb设备开始工作");
		usb.stop();
	}
}


public class InterfaceCaseDemo2 {
     public static void main(String args[]){
    	 /*Computer computer = new Computer();
    	 computer.plugin(new Flash());
    	 computer.plugin(new Print());*/  //对象方法
    	 Computer.plugin(new Flash());  //类方法
    	 Computer.plugin(new Print());
     }
}
