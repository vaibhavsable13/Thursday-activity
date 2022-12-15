package com.question1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadWriteFile {
	 static void  readWrite() throws IOException
	 {
			System.out.println(" enter the choice ");
			System.out.println(" choice 1 for write and choice 2 for read ");
			Scanner in=new Scanner(System.in);
			
			int a=in.nextInt();
			if(a==1) {
				try {
				FileOutputStream fout = new FileOutputStream("F:\\write.txt");
				String s="Welcome to java course";
				byte b[]=s.getBytes();  // change byte into array
				fout.write(b); 
				fout.close();
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}
			else if(a==2)
			{
				try
				{
				FileInputStream fin = new FileInputStream("F:\\read.txt");
				
				while(( a=fin.read())!=-1) {   //reading file till -1
					System.out.print((char)a);
				}
				fin.close();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else {
				System.out.println("Invalid Input please re-enter ");
			}
			System.out.println("Done");
		}
		public static void main(String[] args) throws IOException {
				ReadWriteFile rd =new ReadWriteFile() ;
				rd.readWrite();
			}
		}