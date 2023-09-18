package Testtask;

import java.util.ArrayList;
import java.util.List;

public class Question6 {
	
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(200);
		l.add(600);
		l.add(100);
		l.add(700);
		l.add(900);
		
		
		System.out.println(l);
		l.set(2, 150);
		
		System.out.println(l);
	}

}
