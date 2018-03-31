package com.Generics1.org;

import java.util.*;
import java.util.ArrayList;

public class Collectionscl1 {
	public static void main(String args[])
	{
		List list = new ArrayList();
		list.add("srinivas");
		list.add("dande");
		list.add("kumar");
		list.add("anand");
		System.out.println(list);
		List list2 = new ArrayList();
		list2.add("java");
		list2.add("jdbc");
		list2.add("servlets");
		list2.add("jsp");
		System.out.println("list2:"+list2);
		Collections.copy(list2,list);
		System.out.println("list2:"+list2);	
	}

}
