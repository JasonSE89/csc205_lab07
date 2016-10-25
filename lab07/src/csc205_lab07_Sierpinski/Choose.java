package csc205_lab07_Sierpinski;

public class Choose
{
	/** Output all the ways to select "numberToChoose" items from 
	 *  the given String of items */
	public static void main ( String[] args )
	{
		String items = "ABCD";
		
		int numberToChoose = 2;

		outputChoices ( "", items, numberToChoose );
	}

	/** Output all groups of letters that consist of the 
	 *  String "fixedPart" followed by all possible ways to
	 *  choose "num" characters from the "choosingPart" String
	 * 
	 * @param fixedPart collection of characters that have already been chosen
	 * @param choosingPart collection of characters from which we can select letters
	 * @param num number of characters still remaining to be chosen
	 */
	private static void outputChoices ( String fixedPart, 
			                            String choosingPart, int num )
	{
		if ( num == choosingPart.length() )        // BASE CASE
			System.out.println ( fixedPart + choosingPart );

		else if ( num == 0 )                       // BASE CASE
			System.out.println ( fixedPart );

		else                                       // GENERAL CASE
		{   
			// select the first letter in choosingPart to be in the collection
			outputChoices ( fixedPart + choosingPart.charAt(0), 
					        choosingPart.substring ( 1 ),  
					        num - 1 );

			// do NOT select the first letter in choosingPart 
			outputChoices ( fixedPart, 
					        choosingPart.substring ( 1 ),  
					        num );
		}
		int x = 0;   // nonsense code, prevents "tail recursion",
		             // to allow single-stepping with debugger
	}
}