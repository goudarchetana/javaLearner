package userInput;
import java.util.Scanner;

public class swi_n_while {
	public static void main(String[] args) {
		
		System.out.println("what is your marks: 90, 80, 70, 60?");
		Scanner chet = new Scanner(System.in);
		int marks = chet.nextInt();
		
		switch(marks) {
		case 90 : 
			System.out.println("Your grade is A");
			break;
		case 80:
			System.out.println("your grade is B");
			break;
		case 70:
			System.out.println("Your grade is C");
			break;
		case 60:
			System.out.println("You have failed");
			break;
		default:
			System.out.println("I do not have your grades");
			break;
		}
		int counter = 0;
		while (counter < 10) {
			System.out.println("Congratulations.... and celebrations...");
			counter++;
		}
	}
}
