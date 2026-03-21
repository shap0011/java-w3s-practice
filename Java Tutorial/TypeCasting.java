public class TypeCasting {
	public static void main (String[] args) {
		
		int myInt = 9;
		// Widening Casting
		double myDouble = myInt; // Automatic casting: int to double
		System.out.println(myInt);
		System.out.println(myDouble);
		
		// Narrowing Casting
		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2; // Manual casting: double to int
		System.out.println(myDouble2);
		System.out.println(myInt2);
		
		//Real-Life Example
		int maxScore = 500;
		int userScore = 423;
		
		double percentage = (double) userScore / maxScore * 100.0d;
		System.out.println("User's percentage is " + percentage);
	}
}