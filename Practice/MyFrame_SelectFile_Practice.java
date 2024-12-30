package Practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 * frame for select file practice
 */
public class MyFrame_SelectFile_Practice extends JFrame implements ActionListener
{
	
	JButton button;
	
	MyFrame_SelectFile_Practice()
	{
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		this.add(button);
		
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{
			
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("."));  //just goes to project folder
			//fileChooser.setCurrentDirectory(new File("C:\\User\\lakeb\\Desktop"));  //file path for desktop
			
			//open for 0, cancel or x for 1
			//System.out.println(fileChooser.showOpenDialog(null));    //select file to open, returns an int value
			int response = fileChooser.showOpenDialog(null);
			//int response = fileChooser.showSaveDialog(null);    //select file to save
			
			if(response == JFileChooser.APPROVE_OPTION)   //if they don't cancel or exit out
			{
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);  //gets file path
			}
			
		}
	}
	
}
