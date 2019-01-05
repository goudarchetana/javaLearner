package userInput;
import java.util.Random;
public class rand {
	
	public static void main(String[] args) {
		
		Random dice = new Random();
		int ctr = 0;
		
		do {
			System.out.println(dice.nextInt(100));
			ctr++;
		}while(ctr < 10);
	}
}
