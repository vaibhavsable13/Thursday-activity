package com.Question3;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class  UserDefinedExceptionToCheckName {
	
	void validateName(String name) throws InvalidNameException { 
		String[] names = { "vaibhav", "sumant", "pratik", "sid"};
        boolean found= false;
        for (String n: names)
        {
            if (n.equalsIgnoreCase(name))
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("Valid Name");
        } 
        else 
        {
            throw new InvalidNameException("Try Again!!!!!");
        }
    }
	public static void main(String[] args) {
		 
		UserDefinedExceptionToCheckName jck=new UserDefinedExceptionToCheckName();
	        Scanner sc=new Scanner(System.in);
	    
	        System.out.println("Enter Name:");
	        String name = sc.next();
	        try
	        {
	            jck.validateName(name);
	        }
	        catch(InvalidNameException e) 
	        {
	        	
	            System.out.println("Invalid Name " +e);
	        }
	}

	

}