package userInput;

public class strindAdd {
	
	public static void main(String[] args) {
		String s = "12345678988";
			String temp = "";
			String result = "";
			
	
	int i =0;
while(i < s.length() ) {
		if (i+2 >= s.length()) {
			break;
		}
		temp = s.substring(i, i+3);
		
		result = result + temp +"-";
		i += 3;
		if (i == (s.length() - 2)) {
			
		}
				
	}

	
	System.out.println(result);
	}
	

}
