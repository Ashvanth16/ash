package org.secondtest;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// Key : 10, 20, 30, 40, 50, 60, 10, 20, 40  Values : java, sql, oops, Sql, oracle, DB, selenium, psql, Hadoop
Map <Integer,String> m=new HashMap<Integer,String>();
		
		
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(20, "psql");
		m.put(40, "Hadoop");
		
		System.out.println(m);
	}

}
