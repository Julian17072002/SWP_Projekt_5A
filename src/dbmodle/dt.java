package dbmodle;

import java.sql.Date;

import java.text.SimpleDateFormat;


public class dt {  

	static SimpleDateFormat formatter= new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
	static Date date = new Date(System.currentTimeMillis());
	
	
	public String getDate() {
		return formatter.format(date);
	}
	
	public void setDate(Date date) {
		dt.date = date;
	}
	
	public dt(Date string) {
		dt.date = string;
	}
	
	
	
	public dt(String format) {
		dt.formatter.format(date);
	}

	public static void main(String[] args) {	
		System.out.println(formatter.format(date));
	}

	
	
	
//	public static void main(String[] args) {	
//		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
//		Date date = new Date(System.currentTimeMillis());
//		System.out.println(formatter.format(date));
//	}
		
//	public Date getDatetime1() {
//		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
//		Date date = new Date(System.currentTimeMillis());
//		System.out.println(formatter.format(date));
//		return date;
//	}
//
//	public static void setDatetime1(Date datetime1) {
//		dt.datetime1 = datetime1;
//	}
//	

	







}  