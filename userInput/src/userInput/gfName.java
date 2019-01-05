package userInput;

public class gfName {
	
	private String girlName;
	
	public gfName(String name) {
		
		girlName = name;
		
	}
	
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() {
		
		return girlName;
		
	}
	
	public void output() {
		
		getName();
		System.out.println("Your first girlfriend was " + getName());
		
	}
	

}
