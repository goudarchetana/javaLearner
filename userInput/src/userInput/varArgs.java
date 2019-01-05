package userInput;

public class varArgs {

	public static void main(String[] args) {
		
		int sum = total(45,42,75,85,654,158,357,654,124);
		
		System.out.println("total is " + sum);
		
	}
	
	
	public static int total(int ...a ) {
		int sum =0;
		for(int i=0; i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
}
