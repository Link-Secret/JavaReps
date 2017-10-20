package cc;

interface Pet {
	public abstract String getName();
	public abstract String getColor();
	public abstract int getAge();
}

class Dog implements Pet {
    private String name;
    private String color;
    private int age;
	
    public Dog(String name,String color,int age){
    	this.setName(name);
    	this.setColor(color);
    	this.setAge(age);
    }
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
	@Override
	public String getColor() {
		return color;
	}
	
    public void setColor(String color){
    	this.color = color;
    }
	@Override
	public int getAge() {
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
}

class Cat implements Pet {
	private String name;
    private String color;
    private int age;
	
    public Cat(String name,String color,int age){
    	this.setName(name);
    	this.setColor(color);
    	this.setAge(age);
    }
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
	@Override
	public String getColor() {
		return color;
	}
	
    public void setColor(String color){
    	this.color = color;
    }
	@Override
	public int getAge() {
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
}

class PetShop {
	private Pet[] pets;
	private int foot;
	//宠物店初始化时候设置可以存储的宠物对象的数组
	//动态数组初始化
	public PetShop(int len){
		if(len>0){
			this.pets = new Pet[len];
		}else{
			this.pets = new Pet[1];
		}
		
	}
	//判断是否可以增加宠物   多态
	public boolean add(Pet pet){
		boolean flag = false;
		if(this.foot < this.pets.length){
			//新增宠物添加到对象数组中
			this.pets[this.foot] = pet;
			this.foot++;
			flag = true;
		}else{
			flag = false;
		}
		
		return flag;                          
	}
	
	public Pet[] search(String keyword){
		Pet p[] = null;
		int count = 0;//确定开辟的对象数组个数
		for(int i=0;i<this.pets.length;i++){
			if(this.pets[i] != null){
			if(this.pets[i].getName().indexOf(keyword)!=-1 
					||this.pets[i].getColor().indexOf(keyword)!=-1){
				count++;    
			 }
		   }
	     }
		p = new Pet[count];
		int f=0;
		for(int i=0;i<this.pets.length;i++){
			//向对象数组中添加对象
			if(this.pets[i]!=null){
				if(this.pets[i].getName().indexOf(keyword)!=-1
				     ||this.pets[i].getColor().indexOf(keyword)!=-1){
					p[f] = this.pets[i];
					f++;
				}
			}
		}
		
		
		
		return p;
	}
}


public class PetShopDemo {
    public static void main(String args[]){
    	PetShop petshop = new PetShop(3);
    	petshop.add(new Dog("杨蛋蛋","蛋蛋色",3));
    	petshop.add(new Dog("杨萌萌","萌萌色",3));
    	petshop.add(new Dog("杨蛋蛋","蛋蛋色",3));
    	petshop.add(new Dog("杨蛋蛋","蛋蛋色",3));
    	petshop.add(new Dog("杨蛋蛋","蛋蛋色",3));
    	print(petshop.search("蛋蛋"));
    }
    public static void print(Pet[] pet){
    	for(int i=0;i<pet.length;i++){
    		if(pet[i] != null){
    			System.out.println(pet[i].getName()+pet[i].getColor()+pet[i].getAge());
    		}
    	}
    }
}
