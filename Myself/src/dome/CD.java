package dome;


public class CD extends Item{

    private String artist;




	
	public CD(String title, String artist, int playTime,boolean gotIt,
			String comment) {     //构造器
		super(title,playTime,gotIt,comment);
//      this.title = title;
//		SetTitle(title);
		this.artist = artist;
//      this.numofTracks = numofTracks;
//		this.playTime = playTime;
//		this.comment = comment;
	
	}
    
	public void print(){
		 System.out.print("CD:");
		 super.print();
		 System.out.println(":"+artist);

	}
	
	@Override
	public String toString() {      //object(公共父类)的toString
		return "CD [artist=" + artist + "]"+super.toString();
	}
    
	@Override
	public boolean equals(Object obj) {
		// TODO 自动生成的方法存根
		return super.equals(obj);
	}

	public static void main(String[] args) {
	    CD cd = new CD("a","b",2,false, ".....");
	    cd.print();
		System.out.println(cd.toString());
	}


}
