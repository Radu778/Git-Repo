package demo;

import java.util.Scanner;

public class DisplayingContent {
public static void main (String [] args) {
	//Factorial program example
	//3!=1*2*3=6
	//6!=1*2*3*4*5*6=720
	//Declaring variables here
	int n;
	int fact_var=1;
	
	//Creating Scanner object
	Scanner sc = new Scanner(System.in);
	
	//Reading input from the user
	System.out.println("Enter a number:");
	n=sc.nextInt();
	
	//calculating factorial for loop
			//for(int i=1; i<=n; i++) {
		    //fact_var=fact_var *i;
	
	//calculating factorial while loop
	int i = 1;//initial value
	while ( i <= n ) {//terminating condition
		fact_var *= i; //fact_var=fact_var * i;
		i++; //i = i + 1;// step value
		}
			//Displaying the factorial here
			System.out.println("Factorial of the number "+n+" is "+fact_var);
}
}