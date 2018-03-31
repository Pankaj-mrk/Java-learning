package com.Generics1.org;
import java.text.*;
import java.util.Date;

public class SimpleDateFormat {
	public SimpleDateFormat(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	throws Exception{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-mm-dd");
		String res= fmt.format(new Date());
		System.out.println(res);
		SimpleDateFormat fmt1 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String res1 =  fmt1.format(new Date());
		System.out.println(res1);
		Date date = fmt.parse("2013-10-25");
		System.out.println(date);
		
		
	}

	private Date parse(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private String format(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}

	
		
	


