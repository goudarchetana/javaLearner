package userInput;

public class nesting {

	public static void main(String[] args) {
		
		int age = 86;
		if(age < 50 ) {
			System.out.println("you are young");
			
		}
		else {
			if (age > 75) {
				System.out.println("you are really old");
			}
			else {
				System.out.println("Do not worry!!!! you aren't really that old");
			}
		}
	}
	
}
