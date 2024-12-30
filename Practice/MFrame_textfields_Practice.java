package Practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * code for the MyFrame for textFields
 */
public class MFrame_textfields_Practice extends JFrame implements ActionListener
{
	
	JButton button;
	JTextField textField;
	
	MFrame_textfields_Practice()
	{
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));     //changes size
		textField.setFont(new Font("Consolas", Font.PLAIN, 35));   //changes font
		textField.setForeground(new Color(0x00FF00));              //changes the color of text for user input
		textField.setBackground(Color.black);              //sets background for input box
		textField.setCaretColor(Color.white);             //sets the color of the beeping cursor to white
		textField.setText("username");               //shows an example of what the person should type, can be deleted        
		
		
		this.add(button);
		this.add(textField);     //always add before pack!
		this.pack();                           //size of frame adjusts to fix added components
		this.setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{
			System.out.println("Welcome " + textField.getText());
			button.setEnabled(false);
			textField.setEditable(false);      //no longer edit textField
		}
	}
	
}
