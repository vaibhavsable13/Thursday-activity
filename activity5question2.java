package com.question2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FindWord {

	public static void main(String[] args) throws FileNotFoundException {
		
		new FindWord().findLongestWords();
	   }

	public String findLongestWords() throws FileNotFoundException {

	 String longest_word = "";
	 String current;
	 Scanner sc = new Scanner(new File("F:\\long.txt"));


	 while (sc.hasNext()) {
	    current = sc.next();
	     if (current.length() > longest_word.length()) {
	       longest_word = current;
	     }

	 }
	   System.out.println("\n"+longest_word+"\n");
	      return longest_word;
	}

}
