package com.Generics1.org;

import java.util.PriorityQueue;
import java.util.Queue;

public class Geneque {
	public static void main(String args[])
	{
		Queue<Stud>que = new PriorityQueue<Stud>();
		que.add(new Stud());
		que.add(new Stud());
		System.out.println("main completed");
	}

}
class Stud{
}
