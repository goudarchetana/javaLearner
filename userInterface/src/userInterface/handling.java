package userInterface;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class handling extends JFrame {
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	
	public handling() {
		
		super("Event handling");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter your name here",10);
		add(item2);
		
		item3 = new JTextField("Uneditable", 10);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("Password");
		add(passwordField);
		
		
	}
	
	

}
