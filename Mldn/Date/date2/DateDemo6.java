package date2;

import java.util.Calendar;
import java.util.GregorianCalendar;

class DateTimeee {
	private Calendar calendar = null;
	public DateTimeee (){
		this.calendar = new GregorianCalendar();  //通过子类实例化父类的
	}
	public String getDate(){  //格式为  yyyy-MM-dd HH:mm:ss.SSS
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("-");
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1, 2));
		buf.append("-");
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2));
		buf.append(" ");
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2));
		buf.append(":");
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2));
		buf.append(":");
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2));
		buf.append(".");
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));
		return buf.toString();
	}
	public String getDateComplete(){
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("年");
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1, 2));
		buf.append("月");
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2));
		buf.append("日");
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2));
		buf.append("时");
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2));
		buf.append("分");
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2));
		buf.append("秒");
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));
		buf.append("毫秒");
		return buf.toString();
	}
	public String addZero(int num,int len){
		StringBuffer s = new StringBuffer();
		s.append(num);
		while(s.length()<len){
			s.insert(0, "0");
		}
		return s.toString();
	}
}

public class DateDemo6 {
    public static void main(String args[]){
    	DateTimeee dt = new DateTimeee();
    	System.out.println(dt.getDate());
    	System.out.println(dt.getDateComplete());
    }
}
