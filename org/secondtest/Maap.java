package org.secondtest;

import java.util.HashMap;
import java.util.Map;

public class Maap {
//Key :stdId, stdName, stdPhone, address, dob, email, gender 
	public static void main(String[] args) {
		Map <String,Object> m =new HashMap<String,Object>();
		
          m.put("stdId", 12345);
		m.put("stdName", "ashvanth v");
		m.put("stdPhone", 8148572538l);
		m.put("address", "tvmalai");
		m.put("dob", "16/05/1998");
		m.put("email", "ashvanth16598@gmail.com");
		m.put("gender", "Male");
		
		System.out.println(m);
	}

}
