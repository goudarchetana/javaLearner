package userInput;

public class details {

	String name;
	date birthday;
	
	public String toString() {
		
		return String.format("My name is %s and My date of birth is %s", name, birthday);
		
	}
	
	public details(String n, date bd) {
		
		name = n;
		birthday = bd;
		//System.out.printf("Details class :  %s", this);
	}
}
