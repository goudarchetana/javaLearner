package userInput;
import java.util.Scanner;
public class arrays {


	public static void main(String[] args) {
		
		int a[] = new int[10], i =0, sum = 0;
		System.out.println("Enter the elements of the array");
		
		Scanner input = new Scanner(System.in);
		
		do {
			a[i] = input.nextInt();
			i++;
		}while(i < 10);
		i=0;
		System.out.println("Index\tValue");
		do {
			System.out.println(i+"\t"+a[i]);
			sum += a[i];
			i++;
		}while(i<10);
		System.out.println("Sum of all the elements in the array is " + sum);
	}
	
}
