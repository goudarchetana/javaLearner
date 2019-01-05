package userInput;
import java.util.Random;
public class array_counter {
	
	public static void main(String[] args) {
		
		int ctr_ary[] = new int[10], rand_num,i=0;
		Random dice = new Random();
		for(i = 0; i <1000 ; i++) {
			ctr_ary[dice.nextInt(10)] += 1;
		}
		i=0;
		System.out.println("Index\tValue");
		do {
			System.out.println(i+"\t"+ctr_ary[i]);
		
			i++;
		}while(i<10);
		
	}

}
