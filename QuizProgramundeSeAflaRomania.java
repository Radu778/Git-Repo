package demo;

import java.util.Scanner;

public class QuizProgramundeSeAflaRomania {

	public static void main(String[] args) {
		//declaring variabil here
		int n;
		
		//creating the scanner here
        Scanner sc=new Scanner(System.in);
        
        //displaying
        System.out.println("Pe ce continent se afla Romania?");
        System.out.println("1. Africa\n2. Europa\n3. Asia\n4. America de Sud\n5. Iesire din program");
        System.out.println("Alege varianta de raspuns corecta");
        
        //infinite loop
        while (true) {
        n=sc.nextInt();
        if (n==2) { System.out.println("Raspunsul este corect");
        break;}
        else {System.out.println("Raspunsul este gresit, incercati din nou");}
        }
	}

}
