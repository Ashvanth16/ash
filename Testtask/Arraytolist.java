
package Testtask;

import java.util.Arrays;
import java.util.List;

public class Arraytolist {

	public static void main(String[] args) {
		String dictionary[]= {"abc","abcd","cba","acb","cde","jkkk","rtyu"
		};
		String query[]= {"abc","ced","hfg4er"};
		
		List<String> dic = Arrays.asList(dictionary);
		List<String> queryli = Arrays.asList(query);
		dic.addAll(queryli);
		System.out.println(dic);
}}
