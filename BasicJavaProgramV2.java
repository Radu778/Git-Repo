package demo;

import java.util.Scanner;
public class BasicJavaProgramV2 {
	public static void main (String [] args) {
		
		int num1, num2 ;// the input of the num1 and num2 numbers is hard code
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		
		System.out.println("Arithmetic operations of the two numbers are:");
		System.out.println("Adition of the numbers ist:"+(num1+num2));
		System.out.println("Substraction of the numbers ist:"+(num1-num2));
		System.out.println("Multiplication of the numbers ist:"+(num1*num2));
		System.out.println("Division of the numbers ist:"+(num1/num2));
		System.out.println("Modulo of the numbers ist:"+(num1%num2));
	}
}
