package org.secondtest;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treeemap {
//Key : !, @, #, $, %, ^, &, (, *  Values : 10, 20, 30, 40, 50, 60, 10, 50, 40
	public static void main(String[] args) {
Map <Character,Integer> m =new TreeMap<Character,Integer>();	
		
		m.put('!', 10);
		m.put('@', 20);
		m.put('#', 30);
		m.put('$', 40);
	m.put('%', 50);
		m.put('^', 60);
		m.put('&', 10);
		m.put('(', 50);
		m.put('*', 40);
	//	System.out.println(m);
		Iterator<Entry<Character, Integer>> iterator = m.entrySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
