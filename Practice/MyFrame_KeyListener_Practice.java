package Practice;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * frame for key listener practice
 */
public class MyFrame_KeyListener_Practice extends JFrame implements KeyListener
{
	
	JLabel label;
	ImageIcon icon;
	
	MyFrame_KeyListener_Practice()
	{
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		
		this.addKeyListener(this);
		
		icon = new ImageIcon("xMark.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		label.setIcon(icon);
		
		this.getContentPane().setBackground(Color.black);
		
		this.add(label);
		this.setVisible(true);
		
	}

	@Override
	public void keyTyped(KeyEvent e)  //Invoked when a key is typed. Uses KeyChar, char output
	{
		switch(e.getKeyChar())
		{
		case 'a': label.setLocation(label.getX()-10, label.getY());
			break;
		case 'w': label.setLocation(label.getX(), label.getY()-10);   //moves coordinates by a small amount when pressed
			break;
		case 's': label.setLocation(label.getX(), label.getY()+10);
			break;
		case 'd': label.setLocation(label.getX()+10, label.getY());
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e)   //invoked when a physical key is pressed down. Uses KeyCode, int output                       
	{
		switch(e.getKeyCode())
		{
		case 37: label.setLocation(label.getX()-10, label.getY());
			break;
		case 38: label.setLocation(label.getX(), label.getY()-10);       //uses case __(num of key code) for input
			break;
		case 39: label.setLocation(label.getX()+10, label.getY());
			break;
		case 40: label.setLocation(label.getX(), label.getY()+10);
			break;
		case 32: label.setLocation(label.getX(), label.getY()-100);   //using spacebar to jump lol
		break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e)  //called whenever a button is released
	{
		System.out.println("You released key char: " + e.getKeyChar());   //e.getKeyChar() gets the input you pressed
		
		//lower and upper-case have same values, shift has a value of 16
		System.out.println("You released key char: " + e.getKeyCode());  //gets the numerical code to a key
	}
	
}
