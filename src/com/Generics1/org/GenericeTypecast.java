package com.Generics1.org;
import java.util.*;

public class GenericeTypecast {
	public static void main(String args[]){  
	ArrayList<String> list=new ArrayList<String>();  
	list.add("rahul");  
	list.add("jai");  
	  
	String s=list.get(1);//no need to required type casting
	System.out.println("element is: "+s);  
	  
	Iterator<String> itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  
