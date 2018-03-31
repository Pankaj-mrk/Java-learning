package com.Generics1.org;

import java.util.Collection;
import java.util.*;

public class SingleCollect {
	public static void main(String args[])
	{
		Set s = Collections.singleton("jlc");
		System.out.println(s);
		s.add("HELLO");
		List list = Collections.singletonList("jlc");
		System.out.println(list);
		list.add("HELLO");
	}

}
