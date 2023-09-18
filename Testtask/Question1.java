package Testtask;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		int n =5;
		
		Scanner s= new Scanner(System.in);
		System.out.println("enterstuid");
		int nextInt = s.nextInt();
		System.out.println("stuid"+nextInt);
		System.out.println("enterstuname");
		String next = s.next();
		System.out.println("stuname"+next);
		System.out.println("enterstumark1");
		int nextInt1 = s.nextInt();
		System.out.println("mark1"+nextInt1);
		System.out.println("enterstumark2");
		int nextInt2 = s.nextInt();
		System.out.println("mark2"+nextInt2);
		System.out.println("enterstumark3");
		int nextInt3 = s.nextInt();
		System.out.println("mark3"+nextInt3);
		System.out.println("enterstumark4");
		int nextInt4 = s.nextInt();
		System.out.println("mark4"+nextInt4);
		System.out.println("enterstumark5");
		int nextInt5 = s.nextInt();
		System.out.println("mark5--"+nextInt5);
		
		int sum =  nextInt1 +nextInt2 + nextInt3 + nextInt4 + nextInt5;
		
		System.out.println("sum"+sum);
		int average = sum/n;
		System.out.println("average"+average);
		

	}

}
