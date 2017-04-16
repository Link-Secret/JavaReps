package notebook;

import java.util.ArrayList;

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();
	
    public void add(String s){   //add元素s
    	notes.add(s);
    }
    
    public void add(int location,String s){   //在location位置add元素s
    	notes.add(location, s);
    }
    
    public int getsize(){        //返回容器的size
    	return notes.size();
    }
    
    public String getNode(int index){   //查询index位置的元素
    	return notes.get(index);
    }
    
    public void removeNode(int index){  //删除index位置的元素
    	 notes.remove(index);
    }
    
    public String[] list(){              //返回一个数组（这个数组表达ArrayList里面的所有元素）
    	String a[] = new String[notes.size()];   //新建数组，并且和notes的size一样大
    	notes.toArray(a);       //toArray实现Make a new array of a's runtime type, but my contents:
//    	for(int i=0; i<notes.size();i++){   //toarray实现的功能。
//    		a[i] = notes.get(i);
//    	}
    	return a;
    }
	public static void main(String[] args) {
		NoteBook nb = new NoteBook();

		nb.add("first");
		nb.add("Secret");
		nb.add(1,"world");
		
		
		System.out.println(nb.getsize());           //输出对象的size
		System.out.println(nb.getNode(0));
		System.out.println(nb.getNode(1));          //输出位置为1的元素
		nb.removeNode(1);                           //删除位置1的元素
		String a[] = nb.list();
		for (String s:a){                           //输出a数组里面的元素
			System.out.println(s);
		}
	}

	}

