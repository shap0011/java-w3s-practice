public class Operators {
	public static void main (String[] args) {
		int sum1 = 100 + 50;
		int sum2 = sum1 + 250;
		int sum3 = sum2 + sum2;
		System.out.println("sum3 = " + sum3);
		
		System.out.println("Arithmetic Operators");
		int x = 10;
		int y = 3;

		System.out.println(x + y); // 13
		System.out.println(x - y); // 7
		System.out.println(x * y); // 30
		System.out.println(x / y); // 3
		System.out.println(x % y); // 1

		int z = 5;
		++z;
		System.out.println(z); // 6
		--z;
		System.out.println(z); // 5
		
		int a = 10;
		int b = 3;
		System.out.println(a / b);
		
		double c = 10.0d;
		double d = 3.0d;
		System.out.println(c / d);
		
		int pplInRoom = 0;
		
		pplInRoom++;
		pplInRoom++;
		pplInRoom++;
		
		System.out.println(pplInRoom);
		
		pplInRoom--;
		
		System.out.println(pplInRoom);
		
		System.out.println("Assignment");
		
		int savings = 100;
		savings +=50;
		System.out.println("Total Savings: " + savings);

		System.out.println("Comparisson");
		
		int x2 = 5;
		int y2 = 3;
		System.out.println(x2 > y2);
		
		System.out.println("Logical");
		
		boolean isLoggedIn = true;
		boolean isAdmin = false;
		
		System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
		System.out.println("Has access: " + (isLoggedIn || isAdmin));
		System.out.println("Not logged in: " + (!isLoggedIn));
		
		System.out.println("Precedence");
		
		int result1 = 10 - 2 + 5;    // (10 - 2) + 5 = 13
		int result2 = 10 - (2 + 5);  // 10 - 7 = 3

		System.out.println(result1);
		System.out.println(result2);
	} 
}