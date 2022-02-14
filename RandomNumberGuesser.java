package Project_2_Renzo_Svartz;

import java.util.Scanner;

public class RandomNumberGuesser 
{

	public static void main(String[] args) 
	{
	
		char playAgain = 'x';
		
		do
		{
			//variables to hold user guesses and input, validate guesses, the random number generated
			int guess = 0;
			int minimum = 1;
			int maximum = 100;
			int value = RNG.rand();
			
			System.out.printf("Welcome to this random number guessing game. A random number (1 up to 100) has been generated.\n");
			
			while (guess != value && ((maximum - minimum) > 1))
			{
				if (RNG.getCount() == 0)
				{
					System.out.println("Enter your first guess");
				}
				else
				{
					System.out.printf("Enter your next guess between %d and %d\n", minimum, maximum);
				}
				
				//Get guess
				do
				{
					guess = getInt();
				}
				while (!RNG.inputValidation(guess, minimum, maximum));
				
				if (value < guess)
				{
					System.out.println("Your guess was too high!");
					maximum = guess;
				}
				else if (value > guess)
				{
					System.out.println("Your guess was too low!");
					minimum = guess;
				}
				System.out.println("Number of guesses: " + RNG.getCount());
			}
	
			System.out.printf("\nCongratulations, the number was %d!\n\n", value);
			
			playAgain = getYorN("Would you like to play again?");
		} 
		while (playAgain == 'y');
		
		System.out.println("Goodbye!");
	}

	//Method used to check if a string is numeric, sourced online and editted to fit this program. Source: https://stackabuse.com/java-check-if-string-is-a-number/
	public static boolean isNumeric(String str) 
	{ 
		  try 
		  {  
		    Integer.parseInt(str);  
		    return true;
		  } catch(NumberFormatException e)
		  {  
		    return false;  
		  }  
	}
	
	public static int getInt()
	{
		//Create a Scanner object named keyboard that reads from System.in
		Scanner keyboard = new Scanner(System.in);
		
		//Create a String object named userInput to save the user's input, and an integer variable for input validation
		String inputStr;
		int responseLength;
		
		do
		{
			
			//Save user input as String variable ticketsSoldStr
			inputStr = keyboard.nextLine();
			responseLength = inputStr.length();
			
			if (responseLength == 0)
			{
				System.out.println("\nEmpty input. Retrying prompt.\n");
			}
			else if (!isNumeric(inputStr))
			{
				System.out.println("\nInvalid input. Retrying prompt.\n");
			}
		}
		while (responseLength == 0 || !isNumeric(inputStr));
		
		return Integer.parseInt(inputStr);
	}
	
	public static char getYorN(String str)
	{
		//Create a Scanner object named keyboard that reads from System.in
		Scanner keyboard = new Scanner(System.in);
		
		//Create a String object named userInput to save the user's input, and a char variable answer for the y or n
		String inputStr;
		char answer = 'x';
		
		do
		{
			//Prompt user
			System.out.println(str);
			System.out.printf("Enter y for yes, or n for no.\n");
			
			//Save user input as String variable input
			inputStr = keyboard.nextLine(); 
			
			if (inputStr.trim().isEmpty())
			{
				System.out.println("\nEmpty input. Retrying prompt.\n");
			}
			else if ((answer = inputStr.charAt(0)) != 'n' && (answer != 'y'))
			{
				System.out.println("\nInvalid input. Retrying prompt.\n");
			}
		}
		while(inputStr.trim().isEmpty() || ((answer != 'n') && (answer != 'y')));
		
		return answer;
	}
}
