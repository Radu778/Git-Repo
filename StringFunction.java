package demo;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //initializing string with some string values
		String string_var1="string functions program:";
		String string_var2="string functions";
		
		//Commonly Used string function
		System.out.println("Sting Operation are:");
		
		//Getting character at specific position
		System.out.println(string_var1.charAt(3));
		
		//Getting unicode character at specific index
		System.out.println(string_var1.codePointAt(3));
		
		//Getting unicode character before the specific index
		System.out.println(string_var1.codePointBefore(3));
		
		//Counting number of unicode character between indexes given
		System.out.println(string_var1.codePointCount(0,5));
		
		//Compare two strings lexicographically i.e based on inicode value
		System.out.println("\nstring comparation function");
		
		System.out.println(string_var1.compareTo(string_var2));
		
		//Compare two strings lexicographically ignoring the case
		System.out.println(string_var1.compareToIgnoreCase(string_var2));
		
		//Appends a string with anothers
		System.out.println("\nConcatenated string");
		System.out.println(string_var1.concat(string_var2));
		
		//Checks whether a string contains another string
		System.out.println(string_var1.contains(string_var2));
		
		//Checks whether a string ends with specific character
		System.out.println(string_var1.endsWith(string_var2));
		
		//Compare and returns true if the strings are equals
		System.out.println(string_var1.equals(string_var2));
		
		//Compare and returns true if the strings are equals by inoring the case
		System.out.println(string_var1.equalsIgnoreCase(string_var2));
		
		//hash code for a string is computed like this
		//s(0)*31^(n-1)+s(1)*31^(n-2)+....+s(n-1)
		System.out.println(string_var1.hashCode());
		
		//Gets the position of first occurrence of specific characters
		System.out.println(string_var1.indexOf("program"));
		
		//verifies if string are equals
		String string_var4="demo";
		System.out.println(string_var4.isEmpty());
		
		//Gets position of first occurrence of specific characters
		String string_var3 = "functions program functions";
		System.out.println("\nlast occurrence functions");
		System.out.println(string_var1.lastIndexOf("functions"));
	}

}