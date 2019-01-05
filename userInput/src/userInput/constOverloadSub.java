package userInput;

public class constOverloadSub {
	
	private int x;
	private int y;
	
	public void constOverloadSub() {
		//constOverloadSub(a,0);
		x=0;
		y=0;
			
	}
	public void constOverloadSub(int a) {
		
		//constOverloadSub(a,0);
		x=a;
		y=0;
			
	}
	public void constOverloadSub(int a, int b) {
		x = a;
		y = b;
	}
	
	
	
	public void display() {
	System.out.println("X:"+x+"\tY:"+y);
	}
	
	
	
}
