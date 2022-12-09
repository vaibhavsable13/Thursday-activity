package question1;
import java.util.Scanner;
public class ArithmeticExceptionclass {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter first number:");
		a=s.nextInt();
		
		System.out.println("Enter second number:");
		b=s.nextInt();
			try
			{
				c=a/b;
			    System.out.println("Division ="+c);
			}
			
			catch(ArithmeticException e)
			{
				
				System.out.println(e);
			}
			try
			{
				if(a==0 && b==0)
				{
					System.out.println("number is not entered");
				}
			}
			catch(NullPointerException e)
			
			{
				
				System.out.println(e);
			}
			
			
		}
}