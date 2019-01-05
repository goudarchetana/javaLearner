package userInput;
import java.util.Scanner;


public class orange {
	
	public static void main(String[] args) {
		
		String hesaru;
		
		System.out.println("Enter your name: ");
		Scanner input = new Scanner(System.in);
		hesaru = input.nextLine();
		strawberry strawberryObject = new strawberry();
		strawberryObject.simpleMsessage(hesaru);
				
	}
	
	
}
