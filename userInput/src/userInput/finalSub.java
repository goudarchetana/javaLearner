package userInput;

public class finalSub {
	
	private int sum;
	private final int NUMBER;
	
	public finalSub(int x) {
		NUMBER = x;
		sum = 0;
	}
	
	public void add() {
		sum += NUMBER;
	}

	public String toString() {
		return String.format("Sum = %d", sum);
	}
	
}
