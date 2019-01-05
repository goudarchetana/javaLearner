package userInput;
import java.util.Scanner;

public class log_op {
	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		
		int boy,girl;
		System.out.println("Enter boy's age : ");
		boy = age.nextInt();
		System.out.println("Enter girl's age: ");
		girl = age.nextInt();
		
		if (boy >=21 && girl >= 21){
			if((boy-girl) < 10  || (girl -boy) < 10)
				System.out.println("You both can get married");
				else {
					System.out.println("You have a lot of age gap. dont get married");
				
				}
				
				}
		}
		 if(boy >=40 && girl <= 30) {
			System.out.println("You have a lot of age gap. dont get married");
		}
		else {
			System.out.println("You can't get married");
		}
	}
}
