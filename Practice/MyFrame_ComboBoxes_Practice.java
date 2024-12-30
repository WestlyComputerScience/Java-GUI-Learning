package Practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * frame for combo box practice
 */
public class MyFrame_ComboBoxes_Practice extends JFrame implements ActionListener
{
	
	JComboBox comboBox;
	
	MyFrame_ComboBoxes_Practice()
	{
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog", "cat", "bird"};      //array used to define drop-downs
		
		//now the code below has a drop down of a bunch of different animals
		comboBox = new JComboBox(animals);       //parameters of objects not primitive types! ints don't work, Integers do!         
		comboBox.addActionListener(this);       //so the action listener can listen to combo box
		
		comboBox.setEditable(true);     //select from drop down or type answer
		System.out.println(comboBox.getItemCount());   //prints item count
		comboBox.addItem("Horse");              //adds item to string array
		comboBox.insertItemAt("pig", 1);      //adds pig at index 1
		comboBox.setSelectedIndex(0);     //always selects index 0 when it first runs
		comboBox.removeItem("cat");    //removes cat from combo box
		comboBox.removeItemAt(0);     //removes item at index 0
		//comboBox.removeAllItems();     //clears combo box of all items
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == comboBox)
		{
			//System.out.println(comboBox.getSelectedItem());     //gets selected item from combo box
			System.out.println(comboBox.getSelectedIndex());      //returns index of the selected item
		}
	}
	
}
