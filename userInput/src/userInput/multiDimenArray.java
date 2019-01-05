package userInput;

public class multiDimenArray {
	
	public static void main(String[] args) {
		
		int a[][] = {{2,4,6,8,10}, {1,3,5,7}, {56,82,9}};
		int b[][] = {{68,8} , {9,0,56}, {6,7,88,9,10}};
		
		System.out.println("Array A");
		display(a);
		
		System.out.println("Array B");
		display(b);
			
			
	}
	
	public static void display(int x[][]) {
		
		for(int row = 0; row < x.length; row++) {
			for(int col = 0; col < x[row].length;col++) {
				System.out.print(x[row][col] + "\t");
			}
			System.out.println();
		}
			
	}
	

}
