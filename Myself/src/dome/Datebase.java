package dome;

import java.util.ArrayList;

public class Datebase {
//  private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
    private ArrayList<Item> listItem = new ArrayList<Item>();
	
//    public void add(CD cd){     //容器中add cd
//    	listCD.add(cd);
//    }
//    
//    public void add(DVD dvd) {
//		listDVD.add(dvd);
//	}
    
      private void add(Item item){   //item 是多态变量，cd和dvd的对象赋给父类时发生了向上造型
    	 listItem.add(item);
      }
    
//    public void list(){
//    	for(CD cd : listCD){
//    		cd.print();
//    	}
//    	for(DVD dvd : listDVD){
//    		dvd.print();
//    	}
//    }
      public void list(){
    	  for(Item item : listItem){
    		  item.print();
    	  }
      }
      
      
	public static void main(String[] args) {
//		Datebase db = new Datebase();
//        db.add(new CD("abc", "abc", 4, 60, "....."));
//        db.add(new CD("abd", "abd", 4, 60, "....."));
//        db.add(new DVD("abd", "abd", 60, "....."));
//          db.list();
		  Datebase db = new Datebase();
		  db.add(new CD("abc",null,0,true,"...."));
		  db.add(new CD(null, null, 0, true, null));
		  db.add(new DVD(null, null, 0, true, null));
		  db.list();
	}

}
