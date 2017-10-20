package dateformat;

import java.text.DecimalFormat;

class Format {
	public void format(String pattern,double value){
		DecimalFormat df = null;
		df = new DecimalFormat(pattern);
		String str = df.format(value);
		System.out.println(pattern+"--->"+str);
	}
}

public class NumberFormatDemo2 {

	public static void main(String args[]){
		Format f = new Format();
		f.format("###", 12345);
	}
}
