package dome;

public class Item {
	    private String title ;
	    private int playTime;
	    private boolean gotIt;
	    private String comment;
	    
	public Item(){
		
	}

	public Item(String title, int playTime, boolean gotIt, String comment) {
			super();
			this.title = title;
			this.playTime = playTime;
			this.gotIt = gotIt;
			this.comment = comment;
		}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
//    public void SetTitle(String title){
//    	this.title = title;
//    }
	public void print() {
		System.out.print(title+playTime+gotIt+comment);
		
	}

}
