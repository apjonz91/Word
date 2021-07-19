import java.util.Scanner;


//@author Aaron Jones
//@config 07/18/2021

/*
 * Program changes an entire string input to upper case or lower case. If the string input contains more lower case
 * CHar than upper then the string will be converted to all lower case, and vice versa.
 */
public class word 
{
	public static void main (String[] args)
	{
		//declare scanner object for input string
		Scanner in = new Scanner(System.in);
		//request for user input 
		System.out.println("Please enter the word you would like to assess!");
		//call method that converts string to upper case or lower case
		wordChange(in.next());
	}
	
	/*
	 * method take param and counts the total of upper case and lower case values. If lower case count is not greater
	 * than value of upper; method converts string to upper. If the opposites is true; method converts string to lower case.
	 * @ param: String inputWord
	 * @ return: newWord.
	 */
	public static void wordChange (String inputWord)
	{
		String newWord = inputWord;
		int upperCase = 0;
		int lowerCase = 0;
		char [] wordArray = inputWord.toCharArray();
		for(int i = 0; i < inputWord.length(); i++)
		{
			if (Character.isUpperCase(wordArray[i]))
			{
				upperCase ++;
			}
			else
			{
				lowerCase ++;
			}
		}
		if ( lowerCase < upperCase)
		{
			newWord = newWord.toUpperCase();
		}
		else
		{
			newWord = newWord.toLowerCase();
		}
		
		System.out.println(newWord);
	}

}
