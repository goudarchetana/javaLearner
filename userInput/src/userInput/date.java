package userInput;

public class date {

	private int month;
	private int date;
	private int year;
	
	public date(int m, int d, int y) {
		
		month = m;
		date = d;
		year = y;
				
	}
	
	public String toString() {
		
		return String.format("%d/%d/%d", month, date, year);
		
	}
	
}
