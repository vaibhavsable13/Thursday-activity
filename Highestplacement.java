package com.Question1;

public class Highestplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
            int CSE= sc.nextInt();
        System.out.println("Enter the no of students placed in IT:");
            int IT=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
            int MECH=sc.nextInt();
        if(CSE<0||IT<0||MECH<0)
        {
            System.out.println("Input is Invalid");
        }
        else if(CSE==IT && IT==MECH)
        {
            System.out.println("None of the department has got the highest placement");
        }
        else if(CSE==IT && MECH<CSE)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("IT");
        }
        else if(CSE==MECH && IT<MECH)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("MECH");
        }
        else if(IT==MECH && CSE<MECH)
        {
            System.out.println("Highest placement");
            System.out.println("IT");
            System.out.println("MECH");
        }
        else if(CSE>IT&&CSE>MECH)
        {
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        else if(IT>CSE && IT>MECH)
        {
            System.out.println("Highest placement");
            System.out.println("IT");
        }
        else if(MECH>CSE&&MECH>IT)
        {
            System.out.println("Highest placement");
            System.out.println("MECH");
        }
    }



	}


