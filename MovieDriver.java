package Lab_2_Renzo_Svartz;

import java.util.Scanner;

public class MovieDriver 
{

	public static void main(String[] args) 
	{
	
		//Variable for user input
		char answer;
		String input;
		int responseLength;
		
		do
		{
			//Create a Scanner object named keyboard that reads from System.in
			Scanner keyboard = new Scanner(System.in);
			
			//Create a movie object
			Movie movie = new Movie();
			
			//Prompt user for movie title
			System.out.println("Enter the title of a movie");
			
			//Save user input as String variable title
			String title = keyboard.nextLine();
			
			//Set the title in the movie object;
			movie.setTitle(title);
			
			//Prompt the user for the movie's rating
			System.out.println("Enter the movie's rating");
			
			//Save user input as String variable rating
			String rating = keyboard.nextLine();
			
			//Set the rating in the movie object;
			movie.setRating(rating);
			
			//Prompt the user for the movie's ticket sales
			System.out.println("Enter the number of tickets sold for this movie");
			
			//Save user input as int variable ticketsSold
			int ticketsSold = keyboard.nextInt();
			
			//Clear buffer
			keyboard.nextLine();
			
			//Set the tickets sold in the movie object;
			movie.setSoldTickets(ticketsSold);
			
			//Print out the information using the movie's toString method
			System.out.println(movie.toString() + "\n");
			
			//Prompt user
			System.out.println("Would you like to enter another movie?");
			System.out.println("Press y for yes to enter another movie. Press n for no to exit.");
			
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
				
				System.out.println("Would you like to enter another movie?");
				System.out.println("Press y for yes to enter another movie. Press n for no to exit.");
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
		} while (answer == 'y');

		System.out.println("Goodbye.");
	}

}
