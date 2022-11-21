package com.Question2;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		char operator;
	    int num1, num2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    System.out.println("Enter first number");
	    num1 = input.nextInt();

	    System.out.println("Enter second number");
	    num2 = input.nextInt();

	    switch (operator) {

	      // Addition between numbers
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      // Subtraction between numbers
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      // Multiplication between numbers
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      // Division between numbers
	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }


    }

	}

}
