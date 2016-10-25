package csc205_lab07_Sierpinski;

import javax.swing.*;

public class Driver  {

	public static void main( String[] args ) {

		/** Create a Frame to display the Sierpinski triangle on the screen */
		JFrame frame = new JFrame("Sierpinski");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/** Query the user to determine the number of recursive levels in the Sierpinski triangle */
		int levels = 0;
		String numLevels = JOptionPane.showInputDialog("Enter the number of levels");
		if (numLevels == null) 
			return; // Dialog was cancelled.
		else {
			try {
				levels = Integer.parseInt( numLevels );
				if ( levels < 1 )
					throw ( new NumberFormatException() );
			}
			catch ( NumberFormatException woe ) {
				System.out.println ( "You must enter a number greater-than-or-equal to 1" );
			}
		}

		/** draw a Sierpinski Triangle with the given number of levels of recursive sub-triangles */
		frame.setContentPane( new Sierpinkski_Triangle( levels ) );
		frame.setVisible(true);
	}
}