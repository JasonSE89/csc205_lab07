package csc205_lab07_Sierpinski;


public class Palindrome
{
    public static void main( String[] args ) {

        String testCase1 = "repaper";
        String testCase2 = "rebeekeeper";

        if ( isPalindrome_Version_1 ( testCase1 ) )
            System.out.println ( "The string \"" + testCase1 + "\" is a palindrome" );
        else
            System.out.println ( "The string \"" + testCase1 + "\" is NOT a palindrome" );
    }

    // return "true" iff the String s is a palindrome
    private static boolean isPalindrome_Version_1 ( String s )
    {
        boolean result = false;

        // BASE CASE
        if ( s.length() <= 1 )
            return (true);

        // BASE CASE - check if first char equals last char
        if ( s.charAt(0)  !=  s.charAt ( s.length() - 1 ) )
            return ( false );

        // GENERAL CASE - check whether the substring formed by removing 
        //                the first and last letters is a palindrome
        result = isPalindrome_Version_1 ( s.substring ( 1, s.length() - 1 ) );

        return( result );
    }

    // return "true" iff the String s is a palindrome
    private static boolean isPalindrome_Version_2 ( String s )
    {
        boolean result = false;

        // BASE CASE
        if ( s.length() <= 1 )
            return (true);

        // GENERAL CASE - check whether the substring formed by removing 
        //                the first and last letters is a palindrome
        result = isPalindrome_Version_2 ( s.substring ( 1, s.length() - 1 ) );

        // BASE CASE - check if first char equals last char
        if ( s.charAt(0)  !=  s.charAt ( s.length() - 1 ) )
            return ( false );

        return( result  );
    }
}
