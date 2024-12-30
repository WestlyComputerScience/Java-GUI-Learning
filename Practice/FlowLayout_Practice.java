package Practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * practice for flow layout
 */

/*
 * Side notes for me:
 * Flow layout = places components in a row, sized at their preferred size.
 * If the horizontal space in the container is too small,
 * the flow layout class uses the next available row
 */
public class FlowLayout_Practice 
{
	public static void main(String[] args)
	{
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 0));   //by default, frames use border layout, LEADING = start left, default is center, trailing is right hand side                                
		//Note: the 0,0 above is the horizontal and vertical spacing and horizontal spacing
		
		JButton button1 = new JButton();
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250, 250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());  //sets flow layout to panel, already is by default
		
		panel.add(new JButton("1"));	//new way to add buttons
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));     //now the panel holds  the buttons
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);
		
		frame.setVisible(true); //set at very end to avoid confusion
	}
}
