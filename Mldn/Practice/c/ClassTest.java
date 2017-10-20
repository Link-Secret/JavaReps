package c;

interface ClassName {
	public abstract String getClassName();
}

class Company implements ClassName{

	@Override
	public String getClassName() {
		String className = this.getClass().getName();
		return className;
	}
	
}

public class ClassTest {
    public static void main(String args[]){
    	Company company = new Company();
    	System.out.println(company.getClassName());;
    }
}
