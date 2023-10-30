package binarytodecimal;

import java.util.Scanner;

public class ConvertUsingUsingMethod {
	public static void main(String args[]){  
	    Scanner input = new Scanner( System.in );
	    System.out.print("Input: ");
	    String binaryStr =input.nextLine();
	    System.out.println("Output: "+Integer.parseInt(binaryStr,2));
    } 
}
