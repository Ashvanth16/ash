package org.secondtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Treset {

	public static void main(String[] args) {
	//Input : List = 10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20,30

		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(10);
		l.add(20);
		l.add(30);
		Set<Integer> s=new TreeSet<Integer>();
		s.addAll(l);
		
		
		Iterator<Integer> iterator = s.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}

}
