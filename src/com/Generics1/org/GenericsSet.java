package com.Generics1.org;

import java.util.*;

public class GenericsSet {
	public static void main(String args[])
	{
		System.out.println("\n using generic with set");
		Set<String>set = new HashSet<String>();
		set.add("srinivas");
		set.add("manish");
		set.add("Dharmendra");
		set.add("dande");
		set.add("dande");//duplicate are not allowed in set
		Iterator<String>it = set.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

}
