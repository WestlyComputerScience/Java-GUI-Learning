package Practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * button practice class
 */
public class Button_Frame_Practice extends JFrame implements ActionListener
{
	
	JButton button = new JButton();
	JLabel label;
	
	Button_Frame_Practice()
	{
		
		//ImageIcon icon = new ImageIcon("potato.png");  //optional Icon
		
		label = new JLabel();
		label.setText(":O u pressed the button");
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		button.setBounds(100, 100, 250, 100);  //sets bounds for button
		button.addActionListener(this);      //adds action listener to button for input! can use this because we implement action listener
		//button.addActionListener(e -> System.out.println("Hi!"); //used for lambda expression shortcut
		button.setText("I'm a button!");    //sets text of button
		button.setFocusable(false);       //gets rid of the box line around button
		//button.setIcon(icon);  //adds icon
		button.setHorizontalTextPosition(JButton.CENTER);         //sets alignment
		button.setVerticalTextPosition(JButton.CENTER);         //sets alignment
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));    //changes font
		//button.setIconTextGap(-15); //moves closer to icon
		button.setForeground(new Color(144, 238, 144));              //changes text font color
		button.setBackground(Color.BLACK);                        //changes background color
		button.setBorder(BorderFactory.createEtchedBorder());  //creates 3D effect of button
		//button.setEnabled(false); //disables a button
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{
			System.out.println("Hi!");
			label.setVisible(true);
			button.setEnabled(false);   //disables a button
		}
	}
}
