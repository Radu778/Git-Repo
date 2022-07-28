package demo;

import java.util.Scanner;

public class Quizprogram {

	public static void main(String[] args) {
		
		// declaring variables here
		int n;
			
		//creating Scanner
		Scanner sc=new Scanner(System.in);
		
		//displaying
		System.out.println("Care este raul care trece prin Simeria?");
		System.out.println("1.Olt\n2 Mures\n3 Arges\n4 Ialomita\n5 Iesire din program");
		
		//running infinite loop
		while (true) {			
			
		//reading input from the user	
		System.out.println("Alege varianta corecta(1,2,3,4)");
		n=sc.nextInt();
		
		//validating user choices
		if (n==2) {
			System.out.println("Felicitari raspunsul este corect");
			break;
		}
		else if (n==5) {
			System.out.println("Multumim pentru timpul acordat");
			break;
		}
		else {
			System.out.println("Raspunsul este gresit");
		}
		}
			
	}

}
