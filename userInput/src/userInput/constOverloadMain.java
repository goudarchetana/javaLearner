package userInput;

public class constOverloadMain {
	
	public static void main(String[] args) {
		
		
		System.out.println("0 parameter");
		constOverloadSub A = new constOverloadSub();
		A.display();
		
		System.out.println("1 parameter");
		constOverloadSub A1 = new constOverloadSub(5);
		A1.display();
		
		System.out.println("2 parameters");
		constOverloadSub A2 = new constOverloadSub(10,20);
		A2.display();
		
	}
	
}
