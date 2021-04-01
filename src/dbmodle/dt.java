package dbmodle;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class dt {  
	
	
	private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	static Timestamp date = new Timestamp(System.currentTimeMillis());
	
	public String getDate() {
		return sdf3.format(date);
	}
	
	public void setDate(Timestamp date) {
		dt.date = date;
	}
	
	public dt(Timestamp string) {
		dt.date = string;
	}
	
	public dt(String format) {
		dt.sdf3.format(date);
	}
	
	
	  public static void main(String[] args) {
	        System.out.println(sdf3.format(date));         
	    }
	
	
	
//	static SimpleDateFormat formatter= new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
//	 static Date date = new Date(System.currentTimeMillis());
//	
//	

//
//	public static void main(String[] args) {	
//		System.out.println(formatter.format(date));
//	}
}