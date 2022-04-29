/**
 * 
 * @author Renzo Svartz
 *
 *
 * CMSC 203 - Professor Gary Thai
 * 4/29/2022
 * Eclipse IDE
 */

package Project_5_Renzo_Svartz;

import java.io.*;
import java.util.Scanner;

/**
 * The TwoDimRaggedArrayUtility class is a tool to calculate 
 * minimums, maximums, totals, and such data of a ragged array, 
 * as well as read and write data to and from files
 *
 */
public class TwoDimRaggedArrayUtility 
{
	/**
	 * No arg constructor
	 */
	public TwoDimRaggedArrayUtility()
	{
		;
	}
	
	/**
	 * Method used to calculate the average of the ragged array
	 * @param data Ragged array
	 * @return the average amount
	 */
	public static double getAverage(double[][] data)
	{
		double sum = 0;
		double elements = 0;
		
		for (int i = 0; i < data.length ; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				sum += data[i][j];
				elements += 1;
			}
		}
		
		return sum / elements;
	}
	
	/**
	 * Method used to calculate the total of a given column
	 * @param data Ragged array
	 * @param col Given column
	 * @return the total
	 */
	public static double getColumnTotal(double data[][], int col)
	{
		double sum = 0;
		
		for (int i = 0; i < data.length; i++)
		{
			if (data[i].length - 1 >= col)
			{
				sum += data[i][col];
			}
		}
		
		return sum;
	}
	
	/**
	 * Method used to get the highest element in a ragged array
	 * @param data Ragged array
	 * @return the maximum
	 */
	public static double getHighestInArray(double data[][])
	{
		double maximum = 0;
		
		for (int i = 0; i < data.length ; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if (data[i][j] > maximum)
				{
					maximum = data[i][j];
				}
			}
		}
		
		return maximum;
	}
	
	/**
	 * Method used to get the highest element in given column of a ragged array
	 * @param data Ragged array
	 * @param col Given column
	 * @return the maximum
	 */
	public static double getHighestInColumn(double data[][], int col)
	{
		double maximum = 0;
		
		for (int i = 0; i < data.length ; i++)
		{
			if (data[i].length - 1 >= col)
			{
				if (data[i][col] > maximum)
				{
					maximum = data[i][col];
				}
			}		
		}

		return maximum;
	}
	
	/**
	 * Method used to get the index of the highest element in given column of a ragged array
	 * @param data Ragged array
	 * @param col Given column
	 * @return the row index of a given column
	 */
	public static int getHighestInColumnIndex(double data[][], int col)
	{
		double maximum = 0;
		int index = -1;
		
		for (int i = 0; i < data.length ; i++)
		{
			if (data[i].length - 1 >= col)
			{
				if (data[i][col] > maximum)
				{
					maximum = data[i][col];
					index = i;
				}
			}
		}
		
		return index;
	}
	
	/**
	 * Method used to get the highest element in given row of a ragged array
	 * @param data Ragged array
	 * @param row Given row
	 * @return the maximum
	 */
	public static double getHighestInRow(double data[][], int row)
	{
		double maximum = 0;
		
		for (int i = 0; i < data[row].length ; i++)
		{
			if (data[row][i] > maximum)
			{
				maximum = data[row][i];
			}
		
		}
		
		return maximum;
	}
	
	/**
	 * Method used to get the index of the highest element in given row of a ragged array
	 * @param data Ragged array
	 * @param row Given row
	 * @return the column index of a given row
	 */
	public static int getHighestInRowIndex(double data[][], int row)
	{
		double maximum = 0;
		int index = -1;
		
		for (int i = 0; i < data[row].length ; i++)
		{
			if (data[row][i] > maximum)
			{
				maximum = data[row][i];
				index = i;
			}
		
		}

		return index;
	}
	
	/**
	 * Method used to get the lowest element in a ragged array
	 * @param data Ragged array
	 * @return the minimum
	 */
	public static double getLowestInArray(double data[][])
	{
		double minimum = 1000000;
		
		for (int i = 0; i < data.length ; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if (data[i][j] < minimum)
				{
					minimum = data[i][j];
				}
			}
		}
		
		return minimum;
	}
	
	/**
	 * Method used to get the lowest element in given column of a ragged array
	 * @param data Ragged array
	 * @param col Given column
	 * @return the minimum
	 */
	public static double getLowestInColumn(double data[][], int col)
	{
		double minimum = 1000000;
		
		for (int i = 0; i < data.length ; i++)
		{
			if (data[i].length - 1 >= col)
			{
				if (data[i][col] < minimum)
				{
					minimum = data[i][col];
				}
			}
		}
		
		return minimum;
	}
	
	/**
	 * Method used to get the index of the lowest element in given column of a ragged array
	 * @param data Ragged array
	 * @param col Given column
	 * @return the row index of a given column
	 */
	public static int getLowestInColumnIndex(double data[][], int col)
	{
		double minimum = 1000000;
		int index = -1;
		
		for (int i = 0; i < data.length ; i++)
		{
			if (data[i].length - 1 >= col)
			{
				if (data[i][col] < minimum)
				{
					minimum = data[i][col];
					index = i;
				}
			}
		}
		
		return index;
	}
	
	/**
	 * Method used to get the lowest element in given row of a ragged array
	 * @param data Ragged array
	 * @param row Given row
	 * @return the minimum
	 */
	public static double getLowestInRow(double data[][], int row)
	{
		double minimum = 1000000;
		
		for (int i = 0; i < data[row].length ; i++)
		{
			if (data[row][i] < minimum)
			{
				minimum = data[row][i];
			}
		
		}
		
		return minimum;
	}
	
	/**
	 * Method used to get the index of the lowest element in given row of a ragged array
	 * @param data Ragged array
	 * @param row Given row
	 * @return the column index of a given row
	 */
	public static int getLowestInRowIndex(double data[][], int row)
	{
		double minimum = 1000000;
		int index = -1;
		
		for (int i = 0; i < data[row].length ; i++)
		{
			if (data[row][i] < minimum)
			{
				minimum = data[row][i];
				index = i;
			}
		
		}
		
		return index;
	}
	
	/**
	 * Method used to calculate the total of a given row
	 * @param data Ragged array
	 * @param row Given row
	 * @return the total
	 */
	public static double getRowTotal(double data[][], int row)
	{
		double sum = 0;
		
		for (int i = 0; i < data[row].length; i++)
		{
			sum += data[row][i];
		}
		
		return sum;
	}
	
	/**
	 * Method used to calculate the total of a given ragged array
	 * @param data Ragged array
	 * @return the total
	 */
	public static double getTotal(double[][] data)
	{
		double sum = 0;
		
		for (int i = 0; i < data.length ; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				sum += data[i][j];
			}
		}
		
		return sum;
	}
	
	/**
	 * Method used to read a file (of a ragged array) to create and return a ragged array
	 * @param file Given file
	 * @return A ragged array of doubles
	 * @throws IOException
	 */
	public static double[][] readFile(File file) throws IOException
	{
		Scanner inputFile1 = new Scanner(file);
		
		int rows = 0;
		
		while (inputFile1.hasNext())
		{
			rows += 1;
			
			inputFile1.nextLine();
		}
		
		inputFile1.close();
		
		String elements = "";
		String tokens[];
		int cols[] = new int[rows];
		int i = 0;
		
		Scanner inputFile2 = new Scanner(file);
		
		while (inputFile2.hasNext())
		{
			elements = new String(inputFile2.nextLine());
			
			tokens = elements.split(" ");
			
			cols[i] = tokens.length;
			
			i += 1;
		}
		
		inputFile2.close();
		
		double data[][] = new double[rows][];
		
		for (i = 0; i < rows; i++)
		{
			data[i] = new double[cols[i]];
		}
		
		Scanner inputFile3 = new Scanner(file);
		
		for (i = 0; i < rows; i++)
		{
			elements = new String(inputFile3.nextLine());
			
			tokens = elements.split(" ");
			
			for (int j = 0; j < tokens.length; j++)
			{
				data[i][j] = Double.parseDouble(tokens[j]);
			}
			System.out.println("");
		}

		inputFile3.close();
		
		return data;
	}
	
	/**
	 * Method used to write a ragged array to a given output file
	 * @param data Given ragged array
	 * @param outputFile Given output file
	 * @throws IOException
	 */
	public static void writeToFile(double data[][], File outputFile) throws IOException
	{
		PrintWriter out = new PrintWriter(outputFile);
		
		for (int i = 0; i < data.length ; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				out.print(data[i][j] + " ");
			}
			
			out.print("\n");
		}
		
		out.close();
	}
}
