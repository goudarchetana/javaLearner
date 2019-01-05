package userInput;

public class birthday {
	
	private int month;
	private int date;
	private int year;
	
	public birthday(int m, int d,int y) {
		month=m;
		date=d;
		year=y;
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month,date,year);
		
	}
	
}
