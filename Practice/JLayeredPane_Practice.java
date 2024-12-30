package Practice;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 * JLayeredPane:
 *  - a swing container that provides a 3rd dimension for positioning components (EX: z-index)
 */
public class JLayeredPane_Practice 
{
	public static void main(String[] args)
	{
		
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50, 50, 200, 200);   //NOTE: labels have different x and y coordinates!
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100, 100, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150, 150, 200, 200);
		
		
		JLayeredPane jPane = new JLayeredPane();
		jPane.setBounds(0, 0, 500, 500);        // x = 0; y = 0; and then dimensions of width and height
		
		//adds labels to jPane
		jPane.add(label1, JLayeredPane.DEFAULT_LAYER);   //adds pane to bottom layer
		//jPane.add(label1, Integer.valueOf(0));  //puts it at the bottom layer in a different way (don't need to remember names!)      
		jPane.add(label2, JLayeredPane.DEFAULT_LAYER);
		jPane.add(label3, JLayeredPane.DRAG_LAYER);     //adds to top layer
		
		JFrame frame = new JFrame();
		frame.add(jPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		frame.setLayout(null);
		
		frame.setVisible(true);
	}
}
