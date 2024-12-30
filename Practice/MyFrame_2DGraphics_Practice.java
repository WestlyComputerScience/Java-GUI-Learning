package Practice;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

/**
 * frame for 2D graphics
 */
public class MyFrame_2DGraphics_Practice extends JFrame
{
	
	MyPanel_2DGraphics_Practice panel;
	
	MyFrame_2DGraphics_Practice()
	{
		panel = new MyPanel_2DGraphics_Practice();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		this.add(panel);
		
		this.pack();
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
