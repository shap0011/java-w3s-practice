public class StringMethods {
	public static void main (String[] args) {
		
		/* The charAt() method returns the character 
		at the specified index in a string.*/
		// public char charAt(int index)
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);
		
		/* The codePointAt() method returns the Unicode 
		value of the character at the specified index in a string.*/
		// public int codePointAt(int index)
		String myStr2 = "Hello";
		int result2 = myStr2.codePointAt(0);
		System.out.println(result2);
		
		/*The codePointBefore() method returns the Unicode value of 
		the character before the specified index in a string.*/
		// public int codePointBefore(int index)
		String myStr3 = "Hello";
		int result3 = myStr3.codePointBefore(1);
		System.out.println(result3);
		
		/*The codePointCount() method returns the number of Unicode 
		values found in a string.*/
		// public int codePointCount(int startIndex, int endIndex)
		String myStr4 = "Hello";
		int result4 = myStr4.codePointCount(0, 5);
		System.out.println(result4);
	}
}