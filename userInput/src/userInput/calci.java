package userInput;
import java.util.Scanner;

public class calci {
	public static void main(String args[]) {	

		int x, y, sum,sub,quo,rem,mul;
		System.out.println("Enter first number");
		Scanner input = new Scanner(System.in);
		x= input.nextInt();
		System.out.println("Enter the second number");
		y = input.nextInt();
		sum = x + y;
		sub = x - y;
		mul = x * y;
		quo = x / y;
		rem = x % y;
		
		System.out.println("sum of the above 2 numbers is : " + sum);
		System.out.println("substraction of the above 2 numbers is : " + sub);
		System.out.println("quotient of the above 2 numbers is : " + quo);
		System.out.println("remainder of the above 2 numbers is : " + rem);
		System.out.println("Product of the above 2 numbers is : " + mul);
		
	}
		
}
