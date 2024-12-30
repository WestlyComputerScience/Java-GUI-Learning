package Practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 * this is the frame for radio buttons
 */
public class MyFrame_RadioButtons_Practice extends JFrame implements ActionListener
{
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	
	//ImageIcon burger;
	//ImageIcon hotdog;       //can add icons if want!
	//ImageIcon pizza;
	
	MyFrame_RadioButtons_Practice()
	{
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		//pizza = new ImageIcon("pizza.png");
		//burger = new ImageIcon("burger.png");        //creates icons
		//hotdog = new ImageIcon("hotdog.png");
		
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		ButtonGroup group = new ButtonGroup();   //groups the buttons together
		group.add(pizzaButton);
		group.add(hamburgerButton);              //only can select 1 choice
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);      //don't forget this! otherwise they can't do anything when pressed!       
		hotdogButton.addActionListener(this);
		
		//pizzaButton.setIcon(pizza);
		//hamburgerButton.setIcon(burger);  // adds icon to radio buttons
		//hotdogButton.setIcon(hotdog);       //circles replaced with images!
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == pizzaButton)
		{
			System.out.println("Pizza is on the way!");
		}
		else if(e.getSource() == hamburgerButton)
		{
			System.out.println("Hamburger is on the way!");
		}
		else if(e.getSource() == hotdogButton)
		{
			System.out.println("Hotdog is on the way!");
		}
	}
	
}
