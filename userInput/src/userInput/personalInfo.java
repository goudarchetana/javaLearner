package userInput;

public class personalInfo {

	private String name;
	private birthday bDay;
	
	public personalInfo(String N, birthday D) {
		name=N;
		bDay=D;
	}
	
	public String toString() {
		return String.format("My name is %s and my birthday is on %s ", name, bDay);
	}
}
