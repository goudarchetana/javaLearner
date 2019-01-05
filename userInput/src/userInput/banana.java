package userInput;
import java.util.Scanner;

public class banana {
	
	public static void main(String args[]) {
		
		System.out.println("Enter something");
		Scanner input_str = new Scanner(System.in);
		String line = input_str.nextLine();
		System.out.println(line);
		
		
		apple appleObject = new apple();
		appleObject.simpleMessage();
	}
}