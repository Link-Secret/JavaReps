package dome;

public class DVD extends Item{
//初始化
    private String director;

	
    
    
	public DVD(String title, String director, int playTime,Boolean gotIt, String comment) {
		super(title,playTime,gotIt,comment);      //构造器
//		this.title = title;
		this.director = director;
//		this.playTime = playTime;
//		this.comment = comment;
	}

	public static void main(String[] args) {
//		DVD dvd = new DVD(null, null, 0, true, ">>>>");
//		dvd.print();

	}

	public void print() {    //dvd 的输出
        	System.out.print("DVD:");
        	super.print();
        	System.out.println(director);  //
		
	}

}
