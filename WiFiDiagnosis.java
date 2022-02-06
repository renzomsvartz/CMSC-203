package Project_1_Renzo_Svartz;

import java.util.Scanner;


public class WiFiDiagnosis {

	public static void main(String[] args) 
	{
		
		//introduce program
		System.out.println("Hello, this is a WiFi diagnosis program.\n");
		
		//variable declarations
		Scanner keyboard = new Scanner(System.in); //object keyboard of class Scanner
		char answer;
		String input;
		int responseLength;
		
		//Prompt user
		System.out.println("Would you like to continue with diagnosing your WiFi connectivity issue(s)?");
		System.out.println("Press y for yes to continue. Press n for no to exit.");
		
		//ensure input
		input = keyboard.nextLine(); //method nextLine() of object keyboard gets the next line of input up til \n
		responseLength = input.length();
		
		//if there exists an input, grab it
		if (responseLength > 0)
		{
			answer = input.charAt(0);
		}
		else
		{
			answer = 'x';
		}
		
		//ensure good input
		while (responseLength == 0 || (answer != 'n' && answer != 'y'))
		{
			if (responseLength == 0)
			{
				System.out.println("Empty input. Retrying prompt.\n");
			}
			else
			{
				System.out.println("\nInvalid input. Retrying prompt.\n");
			}
			
			System.out.println("Would you like to continue with diagnosing your WiFi connectivity issue(s)?");
			System.out.println("Press y for yes to continue. Press n for no to exit.");
			input = keyboard.nextLine();
			responseLength = input.length();
			
			//if there exists an input, grab it
			if (responseLength > 0)
			{
				answer = input.charAt(0);
			}
			else
			{
				answer = 'x';
			}
		}
		
		/*FIRST IF DIVE*/
		
		//no = exit program
		if (answer == 'n')
		{
			System.out.println("\nYou chose to exit the program. Exitting Program");
			System.exit(0);
		}
		//yes = continue debugging
		else if (answer == 'y')
		{
			//feedback
			System.out.println("\nYou chose to continue the program.");
			
			//prompt user
			System.out.println("\nFirst: Reboot your computer, then check your connectivity, again.");
			System.out.println("Are you connected to the internet now?");
			System.out.println("Press y for yes, you are connected to the internet and you would like to exit the program. \nPress n for no, you are not connected to the internet and you would like to continue diagnosing.");

			/*Repeat debugging with nested statements*/
			/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
			/*Repeated code starts with ensuring input,
			  then a while loop to ensure good input,
			  then continues with the next level of if statements */
			
			//ensure input
			input = keyboard.nextLine();
			responseLength = input.length();
			
			//if there exists an input, grab it
			if (responseLength > 0)
			{
				answer = input.charAt(0);
			}
			else
			{
				answer = 'x';
			}
			
			//ensure good input
			while (responseLength == 0 || (answer != 'n' && answer != 'y'))
			{
				if (responseLength == 0)
				{
					System.out.println("Empty input. Retrying prompt.\n");
				}
				else
				{
					System.out.println("\nInvalid input. Retrying prompt.\n");
				}
				
				System.out.println("\nFirst: Reboot your computer, then check your connectivity, again.");
				System.out.println("Are you connected to the internet now?");
				System.out.println("Press y for yes, you are connected to the internet and you would like to exit the program. \nPress n for no, you are not connected to the internet and you would like to continue diagnosing.");
				input = keyboard.nextLine();
				responseLength = input.length();
				
				//if there exists an input, grab it
				if (responseLength > 0)
				{
					answer = input.charAt(0);
				}
				else
				{
					answer = 'x';
				}
			}
			
			/*SECOND IF DIVE*/
			
			//no = continue debugging
			if (answer == 'n')
			{
				//feedback
				System.out.println("\nYou chose to continue the program.");
				
				//prompt user
				System.out.println("\nSecond: Reboot the router, then check your connectivity, again.");
				System.out.println("Are you connected to the internet now?");
				System.out.println("Press y for yes, you are connected to the internet and you would like to exit the program. \nPress n for no, you are not connected to the internet and you would like to continue diagnosing.");
				
				/*Repeat debugging with nested statements*/
				/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
				/*Repeated code starts with ensuring input,
				  then a while loop to ensure good input,
				  then continues with the next level of if statements */
				
				//ensure input
				input = keyboard.nextLine();
				responseLength = input.length();
				
				//if there exists an input, grab it
				if (responseLength > 0)
				{
					answer = input.charAt(0);
				}
				else
				{
					answer = 'x';
				}
				
				//ensure good input
				while (responseLength == 0 || (answer != 'n' && answer != 'y'))
				{
					if (responseLength == 0)
					{
						System.out.println("Empty input. Retrying prompt.\n");
					}
					else
					{
						System.out.println("\nInvalid input. Retrying prompt.\n");
					}
					
					System.out.println("\nSecond: Reboot the router, then check your connectivity, again.");
					System.out.println("Are you connected to the internet now?");
					System.out.println("Press y for yes, you are connected to the internet and you would like to exit the program. \nPress n for no, you are not connected to the internet and you would like to continue diagnosing.");
					input = keyboard.nextLine();
					responseLength = input.length();
					
					//if there exists an input, grab it
					if (responseLength > 0)
					{
						answer = input.charAt(0);
					}
					else
					{
						answer = 'x';
					}
				}
				
				/*THIRD IF DIVE*/
				
				//no = continue debugging
				if (answer == 'n')
				{
					//feedback
					System.out.println("\nYou chose to continue the program.");
					
					//prompt user
					System.out.println("\nThird: Make sure the cables connecting the router are firmly plugged in and power is getting to the router, then check your connectivity, again.");
					System.out.println("Are you connected to the internet now?");
					System.out.println("Press y for yes, you are connected to the internet and you would like to exit the program. \nPress n for no, you are not connected to the internet and you would like to continue diagnosing.");
					
					/*Repeat debugging with nested statements*/
					/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
					/*Repeated code starts with ensuring input,
					  then a while loop to ensure good input,
					  then continues with the next level of if statements */
					
					//ensure input
					input = keyboard.nextLine();
					responseLength = input.length();
					
					//if there exists an input, grab it
					if (responseLength > 0)
					{
						answer = input.charAt(0);
					}
					else
					{
						answer = 'x';
					}
					
					//ensure good input
					while (responseLength == 0 || (answer != 'n' && answer != 'y'))
					{
						if (responseLength == 0)
						{
							System.out.println("Empty input. Retrying prompt.\n");
						}
						else
						{
							System.out.println("\nInvalid input. Retrying prompt.\n");
						}
						
						System.out.println("\nThird: Make sure the cables connecting the router are firmly plugged in and power is getting to the router, then check your connectivity, again.");
						System.out.println("Are you connected to the internet now?");
						System.out.println("Press y for yes, you are connected to the internet and you would like to exit the program. \nPress n for no, you are not connected to the internet and you would like to continue diagnosing.");
						input = keyboard.nextLine();
						responseLength = input.length();
						
						//if there exists an input, grab it
						if (responseLength > 0)
						{
							answer = input.charAt(0);
						}
						else
						{
							answer = 'x';
						}
					}
					
					/*FOURTH IF DIVE*/
					
					//no = continue debugging
					if (answer == 'n')
					{
						//feedback
						System.out.println("\nYou chose to continue the program.");
						
						//prompt user
						System.out.println("\nFourth: Move the computer closer to the router, then check your connectivity, again.");
						System.out.println("Are you connected to the internet now?");
						System.out.println("Press y for yes, you are connected to the internet and you would like to exit the program. \nPress n for no, you are not connected to the internet and you would like to continue diagnosing.");
					
						/*Repeat debugging with nested statements*/
						/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
						/*Repeated code starts with ensuring input,
						  then a while loop to ensure good input,
						  then continues with the next level of if statements */
						
						//ensure input
						input = keyboard.nextLine();
						responseLength = input.length();
						
						//if there exists an input, grab it
						if (responseLength > 0)
						{
							answer = input.charAt(0);
						}
						else
						{
							answer = 'x';
						}
						
						//ensure good input
						while (responseLength == 0 || (answer != 'n' && answer != 'y'))
						{
							if (responseLength == 0)
							{
								System.out.println("Empty input. Retrying prompt.\n");
							}
							else
							{
								System.out.println("\nInvalid input. Retrying prompt.\n");
							}
							
							System.out.println("\nFourth: Move the computer closer to the router, then check your connectivity, again.");
							System.out.println("Are you connected to the internet now?");
							System.out.println("Press y for yes, you are connected to the internet and you would like to exit the program. \nPress n for no, you are not connected to the internet and you would like to continue diagnosing.");
							input = keyboard.nextLine();
							responseLength = input.length();
							
							//if there exists an input, grab it
							if (responseLength > 0)
							{
								answer = input.charAt(0);
							}
							else
							{
								answer = 'x';
							}
						}
						
						/*LAST IF*/
						
						//no = continue debugging
						if (answer == 'n')
						{
							//feedback
							System.out.println("\nContact your Internet Service Provider.\n");
						}
						
						//yes = exit program
						else if (answer == 'y')
						{	
							System.out.println("\nDone. Exitting Program");
							System.exit(0);
						}
					}
					
					//yes = exit program
					else if (answer == 'y')
					{	
						System.out.println("\nYou chose to exit the program. Exitting Program");
						System.exit(0);
					}
					
				}
				//yes = exit program
				else if (answer == 'y')
				{	
					System.out.println("\nYou chose to exit the program. Exitting Program");
					System.exit(0);
				}
				
			}
			//yes = exit program
			else if (answer == 'y')
			{	
				System.out.println("\nYou chose to exit the program. Exitting Program");
				System.exit(0);
			}
		}
	}
}
