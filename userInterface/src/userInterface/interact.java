package userInterface;
import javax.swing.JOptionPane;

public class interact {
	
	public static void main(String[] args) {
		
		String fn = JOptionPane.showInputDialog("Enter the first number");
		String sn = JOptionPane.showInputDialog("Enter the second number");
		
		int firstNum = Integer.parseInt(fn);
		int secondNum = Integer.parseInt(sn);
		
		int sum = firstNum+secondNum;
		JOptionPane.showMessageDialog(null, "Sum of the two numbers is  " + sum, "First GUI", JOptionPane.PLAIN_MESSAGE);;
		
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+ name, "Greetings!!", JOptionPane.PLAIN_MESSAGE);
	}

}
