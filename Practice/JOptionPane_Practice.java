package Practice;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * standard pop-up dialogue box that asks for a value
 */
public class JOptionPane_Practice 
{
	public static void main(String[] args)
	{
		
		//JOptionPane.showMessageDialog(null, "This is some dialogue", "Title", JOptionPane.PLAIN_MESSAGE);   //plain
		//JOptionPane.showMessageDialog(null, "This is some dialogue", "Title", JOptionPane.INFORMATION_MESSAGE);   //information
		//JOptionPane.showMessageDialog(null, "This is some dialogue", "Title", JOptionPane.QUESTION_MESSAGE);   //question
		//JOptionPane.showMessageDialog(null, "This is some dialogue", "Title", JOptionPane.WARNING_MESSAGE);   //warning
		//JOptionPane.showMessageDialog(null, "This is some dialogue", "Title", JOptionPane.ERROR_MESSAGE);   //error
		
		
		//funny
		//while(true)
		//{
		//	JOptionPane.showMessageDialog(null, "VIRUS DETECTED", "Title", JOptionPane.ERROR_MESSAGE);  //lol
		//}
		
		// yes == 0     no == 1    cancel == 2
		//System.out.println(JOptionPane.showConfirmDialog(null, "Bro do you even program?", "Title", JOptionPane.YES_NO_CANCEL_OPTION));   //adds a yes, no, or cancel option                          
		//int answer = JOptionPane.showConfirmDialog(null, "Bro do you even program?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
		
		//String name = JOptionPane.showInputDialog("What is you're name?");   //asks input string from user
		//System.out.println("Hello " + name);
		
		String[] responses = new String[3];
		responses[0] = "No, you're awesome";
		responses[1] = "thanks!";
		responses[2] = "man";
		
		ImageIcon icon = new ImageIcon("potato.png");
		
		//input array of strings to show what pop-up buttons u want
		JOptionPane.showOptionDialog(null, "You're awesome", "Title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);   //can add own icon or buttons
		
	}
}
