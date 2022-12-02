package com.question1;

//code to reverse a no  and sum of digits using inheritance

import java.util.Scanner;
class Reverse
{
	public void reverseNumber() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse:");
	    int num=sc.nextInt();
	    int rev=0;
	    
	    {
	     while(num!=0)
	     {
	    	  int remainder=num %10;
	    	  rev=rev*10+remainder;
	    	  num=num/10;  
	     }
	     
	     System.out.println("the reverse of given number is:"+rev);	
		
	}
	}
		
	
	
}