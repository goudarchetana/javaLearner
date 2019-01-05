package userInput;

public class toStringMain {
	
	public static void main(String[] args) {
		birthday myBday = new birthday(12,2,1989);
		personalInfo info = new personalInfo("Chetu",myBday);
		
		System.out.println(info);
	}

}
