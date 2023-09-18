package org.secondtest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash {
//Input : List = 10, 20, 30, 90, 10, 10, 40, 50 Input : List = 30, 40, 50, 60, 80
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		
          s.add(10);
          s.add(20);
          s.add(30);
          s.add(90);
          s.add(10);
          s.add(10);
          s.add(40);
          s.add(50);
          Set<Integer> s1=new HashSet<Integer>();
          s1.add(30);
          s1.add(40);
          s1.add(50);
          s1.add(60);
          s1.add(80);
         s.retainAll(s1);
         System.out.println(s);
	}

}
