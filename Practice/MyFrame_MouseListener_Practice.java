package Practice;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * frame for mouse listener
 */
public class MyFrame_MouseListener_Practice extends JFrame implements MouseListener
{
	
	JLabel label;
	//ImageIcon smile;
	//ImageIcon nervous;
	//ImageIcon pain;
	//ImageIcon dizzy;
	
	MyFrame_MouseListener_Practice()
	{
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		//this.setLayout(new FlowLayout()); //for icons
		
		//smile = new ImageIcon("smile.png");
		//nervous = new ImageIcon("nervous.png");    //for icons
		//pain = new ImageIcon("pain.png");
		//dizzy = new ImageIcon("dizzy.png");
		//label.setIcon(smile);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		label.addMouseListener(this);   //label can now respond to mouse inputs
		
		//this.addMouseListener(this);   //when click in frame, entire frame responds to it
		
		this.add(label);
		
		//this.pack() //for icons
		
		this.setLocationRelativeTo(null);  //frame appears in middle of computer screen
		
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e)   //invoked when a button has been clicked (pressed and released) on a component            
	{
		System.out.println("You clicked the mouse");
		label.setBackground(Color.yellow);
		//label.setIcon(smile);
	}

	@Override
	public void mousePressed(MouseEvent e)  //invoked when a mouse button has been pressed on a component
	{
		System.out.println("You pressed the mouse");
		label.setBackground(Color.blue);
		//label.setIcon(nervous);
	}

	@Override
	public void mouseReleased(MouseEvent e)  //invoked when a mouse button has been released on a component
	{
		System.out.println("You released the mouse");
		label.setBackground(Color.green);
		//label.setIcon(pain);
	}

	@Override
	public void mouseEntered(MouseEvent e)  //Invoked when the mouse enters a component, hover over it
	{
		System.out.println("You entered the component");
		label.setBackground(Color.blue);
		//label.setIcon(dizzy);
	}

	@Override
	public void mouseExited(MouseEvent e)  //Invoked when mouse exits a component, hover over it
	{
		System.out.println("You exited");
		label.setBackground(Color.red);
	}
	
}
