public class Strings {
	public static void main (String[] Args) {
		String greeting = "Hello";
		System.out.println(greeting);
		
		// String Length
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		/*
		The toUpperCase() method converts a string to upper case letters.
		The toLowerCase() method converts a string to lower case letters.
		*/
		String txt2 = "Hello World";
		System.out.println(txt2.toUpperCase());
		System.out.println(txt2.toLowerCase());
		
		// Finding a Character in a String
		String txt3 = "Please locate where 'locate' occurs!";
		System.out.println(txt3.indexOf("locate"));
		
		/* You can use the charAt() method to access a character 
		at a specific position in a string:*/
		String txt4 = "Hello";
		System.out.println(txt4.charAt(0));
		System.out.println(txt4.charAt(3));
		
		// Comparing Strings
		String txt5 = "Hello";
		String txt6 = "Hello";
		
		String txt7 = "Greetings";
		String txt8 = "Great things";
		
		System.out.println(txt5.equals(txt6));
		System.out.println(txt7.equals(txt8));
		
		// Removing Whitespace
		String txt9 = "   Hello World!   ";
		System.out.println("Before: [" + txt9 + "]");
		System.out.println("After: [" + txt9.trim() + "]");
		
		// String Methods: https://www.w3schools.com/java/java_ref_string.asp
	}
}