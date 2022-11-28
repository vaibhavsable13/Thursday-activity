package com.Question2;

public class ArithmeticMain {

		public static void main(String[] args) {
	        Adder a = new Adder();
	        
	        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
	        
	        System.out.print(a.add(50,35) + " " + a.add(56,40) + " " + a.add(21,40) + "\n");
		}

	}