package Practice;

import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

/**
 * game for key binding practice
 */
public class Game_Keybindings_Practice 
{
	
	JFrame frame;
	JLabel label;
	UpAction upAction;
	DownAction downAction;
	LeftAction leftAction;
	RightAction rightAction;
	
	Game_Keybindings_Practice()
	{
		
		frame = new JFrame("KeyBinding Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100, 100, 100, 100);
		label.setOpaque(true);
		
		upAction = new UpAction();
		downAction = new DownAction();       //initializes actions
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");       //keyStroke with map action
		label.getActionMap().put("upAction", upAction);     //whatever u named the key ^, then an action
		
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getActionMap().put("downAction", downAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		/*
		label.getInputMap().put(KeyStroke.getKeyStroke('W'), "upAction");
		label.getActionMap().put("upAction", upAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('S'), "downAction");
		label.getActionMap().put("downAction", downAction);                       //Note: need new classes
		                                                                          //for new input
		label.getInputMap().put(KeyStroke.getKeyStroke('A'), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('D'), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		*/
		
		frame.add(label);
		frame.setVisible(true);
		
	}
	
	public class UpAction extends AbstractAction
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			label.setLocation(label.getX(), label.getY() - 10);
			
		}
		
	}
	
	public class DownAction extends AbstractAction
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			label.setLocation(label.getX(), label.getY() + 10);
			
		}
		
	}
	
	public class LeftAction extends AbstractAction
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			label.setLocation(label.getX() - 10, label.getY());
			
		}
		
	}
	
	public class RightAction extends AbstractAction
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			label.setLocation(label.getX() + 10, label.getY());
			
		}
		
	}
	
}
