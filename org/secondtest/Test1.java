package org.secondtest;

public class Test1 {
public static void main(String[] args)
{ 
try

{ 
	System.out.println("1"); 
int data = 5 / 0; }


catch(ArithmeticException e)

{ 
System.out.println("2"); 
} 
finally
   {
System.out.println("3");
 } 
System.out.println("4"); 
}
}
