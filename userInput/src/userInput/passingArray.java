package userInput;

public class passingArray {

	public static void main(String[] args) {
		
		int s[] =  {10,20,30,40,50};
		passedArray obj = new passedArray();
		obj.modify(s);
		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		}
		
	}
	
}
