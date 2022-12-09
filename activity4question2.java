package com.Question2;

import java.util.Scanner;
 
class InvalidAgeWeightException extends Exception
{
	public InvalidAgeWeightException(String Str)
	{
		super(val);
	}
}

public class InvalidAgeWeightException {
	

	public static void main(String[] args) {
	
		int weight,age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();
		System.out.println("enter weight");
		weight=sc.nextInt();
		try
		{
			if(age<18 || weight<50)
			{
				throw new InvalidAgeWeightException("invalid age weight exception");
			}
			else
				System.out.println("your valid to donate blood");
		}
		catch(InvalidAgeWeightException e)
		{
			System.out.println(e);
			System.out.println("Your not valid to donate blood");
		}
		
		}
}

