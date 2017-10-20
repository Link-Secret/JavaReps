package cc;

interface Network{
	public abstract void browse(); 
}

class real implements Network{

	@Override
	public void browse() {
		System.out.println("上网");
	}
	
}

class Proxy implements Network{

	private Network network;
	public Proxy(Network network){
		this.network = network;
	}
	
	public boolean check(){
		System.out.println("检测是否合法");
		return true;
	}
	
	@Override
	public void browse() {
		this.check();
		this.network.browse();
	}
	
}

public class ProxyDemo {
    public static void main(String args[]){
    	Network net = null;
    	net = new Proxy(new real());
    	net.browse();
    }
}
