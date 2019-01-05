package userInput;

public class personalDetailsMain {
	
	public static void main(String[] args) {
		
		date bd = new date(12,2,89);
		details pd = new details("Chetu", bd);
		
		System.out.printf("main class:  %s",pd);
	}
}
