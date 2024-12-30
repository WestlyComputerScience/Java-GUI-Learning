package Practice;

import javax.swing.JFrame;

/**
 * frame for 2D animations
 */
public class MyFrame_2DAnimation_Practice extends JFrame
{
	
	MyPanel_2DAnimation_Practice panel;
	
	MyFrame_2DAnimation_Practice()
	{
		
		panel = new MyPanel_2DAnimation_Practice();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);  //window put in center of screen
		this.setVisible(true);
		
	}
	
}
