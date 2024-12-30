package Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * How to open a new window in Java
 */
public class Opening_New_Window_Practice implements ActionListener
{
	
	JFrame frame = new JFrame();
	JButton b1 = new JButton("New Window");  //button to press to open a new window
	
	Opening_New_Window_Practice()
	{
		
		b1.setBounds(100, 100, 250, 40);
		b1.setFocusable(false);  //gets rid of text on button
		b1.addActionListener(this);
		
		
		frame.add(b1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		
		
		frame.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == b1)
		{
			Opening_New_Window_Practice_newWindow myWindow = new Opening_New_Window_Practice_newWindow();
		}
	}
}
