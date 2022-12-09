package question1;
import java.util.Scanner;
public class ArithmeticExceptionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		//  asks the user to input two numbers
		System.out.println("Enter 1st number : ");
		a=sc.nextInt();
		System.out.println("Enter 2nd number : ");
		b=sc.nextInt();			
	try
	{
		//first number is then divided by the second number and display the result on screen
		c=a/b;
		System.out.println("Result:"+c);
	}
	catch(ArithmeticException e)
	{
		//Arithmetic Exception is thrown when user try to divide by zero
		System.out.println("Arithmetic Exception occured");
	}
	}

}
