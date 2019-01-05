package userInput;
import java.util.Scanner;
public class average {
	
	public static void main(String[] args) {
		
		int average, total = 0, counter = 0;
		
		System.out.println("Enter 10 grades: ");
		Scanner input = new Scanner(System.in);
		
		while(counter < 10) {
			//grade = input.nextInt();
			total += input.nextInt();
			counter++;			
		}
		average = total/10;
		System.out.println("Average of the above numbers is : " + average);
	}

}
