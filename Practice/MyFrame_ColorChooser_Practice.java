package Practice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame_ColorChooser_Practice extends JFrame implements ActionListener
{
	
	JButton button;
	JLabel label;
	
	MyFrame_ColorChooser_Practice()
	{
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.WHITE);
		label.setText("This is some text");
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{
			JColorChooser colorChooser = new JColorChooser();
			
			//stores chosen color in variable color
			Color color = JColorChooser.showDialog(null, "pick a color", Color.black);  //parent component, title, default color         
			
			//label.setForeground(color);  //sets foreground to color
			label.setBackground(color);  //sets background color
		}
	}
	
}
