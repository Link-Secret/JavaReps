package notebook;

import java.util.ArrayList;

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();
	
    public void add(String s){   //addԪ��s
    	notes.add(s);
    }
    
    public void add(int location,String s){   //��locationλ��addԪ��s
    	notes.add(location, s);
    }
    
    public int getsize(){        //����������size
    	return notes.size();
    }
    
    public String getNode(int index){   //��ѯindexλ�õ�Ԫ��
    	return notes.get(index);
    }
    
    public void removeNode(int index){  //ɾ��indexλ�õ�Ԫ��
    	 notes.remove(index);
    }
    
    public String[] list(){              //����һ�����飨����������ArrayList���������Ԫ�أ�
    	String a[] = new String[notes.size()];   //�½����飬���Һ�notes��sizeһ����
    	notes.toArray(a);       //toArrayʵ��Make a new array of a's runtime type, but my contents:
//    	for(int i=0; i<notes.size();i++){   //toarrayʵ�ֵĹ��ܡ�
//    		a[i] = notes.get(i);
//    	}
    	return a;
    }
	public static void main(String[] args) {
		NoteBook nb = new NoteBook();

		nb.add("first");
		nb.add("Secret");
		nb.add(1,"world");
		
		
		System.out.println(nb.getsize());           //��������size
		System.out.println(nb.getNode(0));
		System.out.println(nb.getNode(1));          //���λ��Ϊ1��Ԫ��
		nb.removeNode(1);                           //ɾ��λ��1��Ԫ��
		String a[] = nb.list();
		for (String s:a){                           //���a���������Ԫ��
			System.out.println(s);
		}
	}

	}
