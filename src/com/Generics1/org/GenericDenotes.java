package com.Generics1.org;
import java.util.*;

public class GenericDenotes {
	public static void main(String args[])
	{
		ArrayList <Integer>inList = new ArrayList<Integer>();
		inList.add(1234);
		inList.add(4567);
		inList.add(8910);
		showElement(inList);
		ArrayList <Float>fList = new ArrayList<Float>();
		fList.add(123.456F);
		fList.add(456.43F);
		fList.add(123.453F);
		showElement(fList);
	} 
	static void showElement(List<? extends Number>list) {
	
		for(Number num:list) {
			System.out.println(num+",");
			
			
		}
		System.out.println("/n");
	}
}
