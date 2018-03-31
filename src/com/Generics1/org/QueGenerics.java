package com.Generics1.org;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueGenerics {
	public static void main(String args[])
	{
		Queue<String>que = new PriorityQueue<String>();
		que.add("srinivas");
		que.add("manish");
		que.add("kummar");
		que.add("dande");
		que.add("srinivas");
		que.add("ranjan");
		System.out.println("Size:"+que.size());
		System.out.println("peek:"+que.peek());
		System.out.println("Size:"+que.size());
		System.out.println("Element:"+que.element());
		System.out.println("Size:"+que.size());
		System.out.println("Poll:"+que.poll());
		System.out.println("Size:"+que.size());
	
	}

}
