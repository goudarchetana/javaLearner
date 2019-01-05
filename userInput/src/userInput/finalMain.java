package userInput;

public class finalMain {
	
	public static void main(String[] args) {
		
		finalSub obj = new finalSub(10);
		
		for(int i = 0; i < 5 ;i ++) {
			
			obj.add();
			System.out.printf("\n%s", obj);
		}
		
	}

}
