package userInput;
import java.util.Scanner;


public class gfMain {

	public static void main(String[] args) {
		
	//	System.out.println("Enter the name of your first girlfriend:  ");
	//	Scanner input = new Scanner(System.in);
//		String tempVar = input.nextLine();
		
		gfName obj = new gfName("Chetana");
		
		gfName obj2 = new gfName("Lek");
	//	obj.setName(tempVar);
		obj.output();
		obj2.output();
		
		
	}
	
}
