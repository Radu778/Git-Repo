package demo;

import java.util.Scanner;

public class QuizProgramCaremunteestemaiinalt {
public static void main (String [] args) {
	//declaring variables here
    int n;
    
    //creating scanner
    Scanner sc=new Scanner(System.in);
    
    //displaying the questions
    System.out.println("Care este cel mai inalt varf ?");
    System.out.println("1.Vf.Moldoveanu\n2 Vf.Negoiu\n3 Vf.Ranca\n4 Vf.Parang\n5 Iesire din program ");
    System.out.println("Alege varianta corecta(1,2,3,4)");
 
    //running infinite loop
while (true) {
   	
        n=sc.nextInt();
        
    if (n==1) {
    	System.out.println("Felicitari raspunsul este corect");
    	break;	
        }
    else {
    	System.out.println("Raspunsul este gresit, incercati din nou"); }
    
    if (n==2) {
    	System.out.println("Alege varianta corecta(1,3,4)");  }
    
    if (n==3) {
    	System.out.println("Alege varianta corecta(1,2,4)");  }
    
    if (n==4) {
    	System.out.println("Alege varianta corecta(1,2,3)");  }
    
    else if (n==5) {
    	System.out.println("Multumim pentru timpul acordat");
    	break; }   
    
}
    
    
    
}
}



