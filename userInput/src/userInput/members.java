package userInput;

public class members {

	private String first;
	private String last;
	private static int total;
	
	public members(String fn, String ln) {
		
		first = fn;
		last = ln;
		total++;
		System.out.printf("\nConstructor for %s %s number of members : %d \n", first, last, total);
		System.out.printf("\nThis reference : %s", this );
	}
		
	public static int getMembers() {
		return total;
	}
	
	public String toString() {
		
		return String.format("\nnumber of members toString fun : %d", total);
		
	}
	
}
