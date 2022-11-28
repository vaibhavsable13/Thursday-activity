package com.Question1;

import java.util.Scanner;
class TransposeMatrix {
	 int i, j,temp;
	 int row,column;
	 int array[][]; 

	 TransposeMatrix(int row,int column)
	 {
		 this.row=row;
		
		 this.column=column;
		 
		 array=new int [row][column];
	 }
	 TransposeMatrix(int array[][])
	 {
		 this.array=array;
		 this.row=array.length;
		 this.column=array[0].length;
	 }

	 void read(Scanner sc) 
	 {
		  
	//   int array[][] = new int[row][column];  
	    System.out.println("Enter matrix:");  
	    for(i=0;i<row;i++)  
	    {  
	        for(j=0;j<column;j++)   
	            {  
	            array[i][j]=sc.nextInt();  
	        //    System.out.print(" "); 
	            
	            }  
	    }  
	 }
	 
	 void trans()
	 {
	 
	int temp[][]=new int[column][row];
	    for(i=0;i<row;i++)  
	        {  
	            for(j=0;j<column;j++)  
	            {  
	            	temp[j][i]=array[i][j];	            		  	            	
	            } 	            
	        }
	    array=temp;	    
	        }  
	 
	 void display()
	 {
		 //displaying the matrix 
	 System.out.println("The above matrix after Transpose is :");  	
	   
	 for(i=0;i<row;i++)  
	        {  
	            for(j=0;j<column;j++)  
	            {  
	                System.out.print(array[i][j]+" ");  
	            }  
	            System.out.println(" ");  
	        }  
	    }  
}

public class TransposeMain {

	public static void main(String[] args) {
	
			int row,column;
		//creating the instance of TransposeMatrix 
		//accessing the elements using scanner class
		
			System.out.println("Enter rows:");
		 Scanner s=new Scanner(System.in);
	    row = s.nextInt(); 	
	    
	    System.out.println("enter column :");
	    column = s.nextInt(); 
		
	    TransposeMatrix t=new TransposeMatrix(row,column);	 
			
	        t.read(s);	//calling a method
			t.trans();
			t.display();
		}

	}