package Testtask;

import java.util.ArrayList;
import java.util.List;

public class question5 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(50);
		l.add(20);
		l.add(60);
		l.add(80);
		l.add(50);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		l.set(0, 400);
		l.set(4, 400);
		l.set(6, 400);
		System.out.println(l);
		
			
	}
}
