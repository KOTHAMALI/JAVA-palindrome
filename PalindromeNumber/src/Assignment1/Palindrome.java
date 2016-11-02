package Assignment1;

import java.util.Scanner;

public class Palindrome {
	
	public static void palindrom(){ // object creation is avoided by using static while calling this method
	try{         // Exceptions handled using try catch blocks
	Scanner S = new Scanner(System.in);
	System.out.println("enter a number to check Palindrome");
    int number = S.nextInt();
    int remainder;
    int reverse = 0;
	int check = number; // storing the original no entered by user
	
	
	while(number>0)    // loop used to iterate till the end of the given no
	{
		remainder = number%10;
		number = number/10;
		reverse = reverse *10 +remainder;
	}
	
	if(check==reverse) // checks whether the given no is equal to reverse of a number
	{
		System.out.println("entered no is a palindrome number");
	}
	else
	{
		System.out.println("entered no is not a palindrome number");
		S.close();
	}
	}
	catch(Exception e)
	{
		System.out.println("InputMismatchException");
	}
	
	}
	public static void main(String[] args) {
		palindrom();
		
	}
}
