package Testtask;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class question7 {

	public static void main(String[] args) {
		Map<Integer,String> m=new TreeMap<Integer,String>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "selenium");
		
		Set<Entry<Integer,String>> entrySet = m.entrySet();
		for(Entry<Integer,String> mapval:entrySet)
		{
			System.out.println(mapval.getKey());
			System.out.println(mapval.getValue());
		}
		
	}

}
