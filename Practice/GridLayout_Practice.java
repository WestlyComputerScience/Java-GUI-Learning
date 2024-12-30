package Practice;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * practice for grid layouts in Java GUI. 
 * - places all components into a grid of cells
 * - each component takes up all the available space within a cell
 * - each cell is the same size
 */
public class GridLayout_Practice 
{
	public static void main(String[] args)
	{
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3, 3, 10, 10));   // rows, columns input // then horizontal spacing, vertical spacing
		
		JButton b1 = new JButton("1");
		frame.add(b1);               //add buttons longer way
		frame.add(new JButton("2"));  //adds a button shorter way
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		
		
		
		
		frame.setVisible(true); // always put last lol
	}
}
