package demo;

import java.util.Scanner;

public class DisplayingContentTest {
public static void main(String []args) {
	
	//Declaring variables here
	int n;
	int fact_var=1;
	
	//Creating a scanner
	Scanner sc=new Scanner(System.in);
	
	//Reading input from the user
	System.out.println("Enter a number:");
	n=sc.nextInt();
	
	//calculating factorial for loop 
	for(int i=1; i<=n; i++) {
		fact_var *=i;
	}
	//Displaying the factorial here
	System.out.println("Factorial of the number "+n+" is "+fact_var);
}
}
