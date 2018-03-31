package com.Generics1.org;
import java.util.Calendar;

public class ClaenderClass {
	public static void main(String args[])
	{
		Calendar today = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE,13);
		cal.set(Calendar.YEAR,2014);
		System.out.println("AFTER TODAY:"+today.after(cal));
		System.out.println("BEFORE TODAY:"+today.before(cal));
		System.out.println("compareTo:"+today.compareTo(cal));
		
	}

}
