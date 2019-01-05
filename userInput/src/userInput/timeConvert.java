package userInput;

public class timeConvert {
	private int hours;
	private int minutes;
	private int seconds;
	
	public void setTime(int h,int m,int s) {
		hours = (h >= 0 && h < 24) ? h : 0;
		minutes = (m >=0 && m < 60)? m : 0;
		seconds = (s >= 0 && s < 60) ? s : 0;
		
	}
	
	public void disMilitary() {
		System.out.printf("\nMilitary time : %02d:%02d:%02d", hours, minutes, seconds);
		
	}
	
	public void disStandard() {
		System.out.printf("\nStandard time : %02d:%02d:%02d", ((hours > 12)?(hours%12):hours), minutes, seconds);
	}
}
