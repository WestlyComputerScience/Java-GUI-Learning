package Practice;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 * frame for checkBoxes class
 */
public class MyFrame_CheckBoxes_Practice extends JFrame implements ActionListener
{
	
	JCheckBox checkBox;
	JButton button;
	ImageIcon checkIcon;
	ImageIcon xIcon;
	
	MyFrame_CheckBoxes_Practice()
	{
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//this.setSize(500, 500);
		
		xIcon = new ImageIcon("xMark.png");
		checkIcon = new ImageIcon("checkMark.png");
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);  //since we're implementing action listener already, just pass in this               
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");         //changes text for check box
		checkBox.setFocusable(false);        //gets rid of annoying line around check box
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		checkBox.setIcon(xIcon);                                 //changes check box to picture
		checkBox.setSelectedIcon(checkIcon);               //changes to other icon when pressed
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{
			System.out.println(checkBox.isSelected());  //checks if check box is selected
		}
	}
	
}
