//Q1.Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.
import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
  
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter a number:");
    	int number = scn.nextInt();
    	if(number > 0) {
    		System.out.println("The number  is positive");
    	}
    	else if(number < 0) {
    		System.out.println("The number is negative");
    	}
    	else {
    		System.out.println("The number is zero");
    	}
	
    }
}
