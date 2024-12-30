package Practice;

import javax.swing.JFrame;

/**
 * Frame for drag and drop
 */
public class MyFrame_DragAndDrop_Practice extends JFrame
{
	
	Picture_DragAndDrop_Practice dragPanel = new Picture_DragAndDrop_Practice();
	
	MyFrame_DragAndDrop_Practice()
	{
		
		this.add(dragPanel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Drag & Drop Demo");
		this.setSize(600, 600);
		this.setVisible(true);
		
	}
	
}
