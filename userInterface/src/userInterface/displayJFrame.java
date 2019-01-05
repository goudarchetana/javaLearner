package userInterface;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;


public class displayJFrame extends JFrame {
	
	private JLabel item;
	
	public displayJFrame() {
		
		super("This is the title");
		setLayout(new FlowLayout());
		
		item = new JLabel("This is a label");
		add(item);
		
		item.setToolTipText("This display when you hover over the text");
		
		
	}
	

}
