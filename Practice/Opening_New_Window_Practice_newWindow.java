package Practice;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * this is the window the practice uses to open it!
 */
public class Opening_New_Window_Practice_newWindow 
{
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello");
	
	Opening_New_Window_Practice_newWindow()
	{
		
		label.setBounds(0, 0, 100, 50);
		label.setFont(new Font(null, Font.PLAIN, 25));
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
}
