package Testtask;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class question9 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "sql");
		m.put(50, "oracle");
		m.put(60, "db");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "hadoop");
		
		System.out.println(m);
		
	}
}
