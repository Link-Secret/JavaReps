package c;

class BinaryTree {
	class Node{
		private Comparable data;
		private Node left;
		private Node right;
		public void addNode(Node newNode){
			if(newNode.data.compareTo(this.data)<0){
				if(this.left==null){
					this.left = newNode;
				}else{
					this.left.addNode(newNode);
				}
			}
			if(newNode.data.compareTo(this.data)>=0){
				if(this.right == null){
					this.right = newNode;
				}else{
					this.right.addNode(newNode);
				}
			}
		}
		
		public void printNode(){
			if(this.left!=null){   //先输出左子树
				this.left.printNode();
			}
			System.out.println(this.data+"\t");  //再输出根节点
			if(this.right!=null){
				this.right.printNode();  //最后输出右子树
			}
		}	
	}
	private Node root;    //根元素
	public void add(Comparable data){
		Node newNode = new Node();
		newNode.data = data;
		if(root == null){
			root = newNode;
		}
		else{
			root.addNode(newNode);   //确定节点放在左节点还是右节点
		}
	}
	public void print(){
		this.root.printNode();
	}
}


public class ComparableDemo3 {
    public static void main(String args[]){
    	BinaryTree bt = new BinaryTree();
    	bt.add(8);
    	bt.add(3);
    	bt.add(5);
    	bt.add(10);
    	bt.add(9);
    	bt.add(1);
    	bt.add(5);
    	bt.add(6);
    	System.out.println("排序");
    	bt.print();
    }
}
