// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	//  Make a main method that includes all the steps below….
public static void main(String[] args) 
	{
	

	//  Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	
	int random=new Random().nextInt(4);
	
	//  Print out this variable
	System.out.println(random);
	
	//  Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Enter a question");
	
		//  If the random number is 0
		if(random==0)
		{
			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "Yes");
		}
	

		//  If the random number is 1
		if(random==1)
		{
			// -- tell the user "No"
			JOptionPane.showMessageDialog(null, "No");
		}
		
		
		//  If the random number is 2
		if(random==2)
		{
			// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		}
		
		
		//  If the random number is 3
		if(random==3)
		{
			// -- write your own answer
			JOptionPane.showMessageDialog(null, "I do not know?");
		}
	}
}


