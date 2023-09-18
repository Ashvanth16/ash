package org.secondtest;

import java.util.Scanner;

public class validphone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("print phone number");
        String next = null;
        
        for(int i=0;i<=1;i++)
        {
         next = sc.next();
         int length = next.length();
         
         if(length == 10) {
         	System.out.println("valid");
         }else {
         	System.out.println("invalid");
         }
        }
        
        


}}
