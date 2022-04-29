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

/**
 * The HolidayBonus class is a tool used to calculate the holiday bonuses
 * earned by various companies for their sales in various categories
 *
 */
public class HolidayBonus 
{
	/**
	 * No arg constructor
	 */
	public HolidayBonus()
	{
		;
	}

	/**
	 * Method used to calculate the holiday bonuses for each company
	 * @param data Ragged array of sales data
	 * @param high The bonus for the highest sales in a category (column)
	 * @param low The bonus for the lowest sales in a category (column)
	 * @param other The bonus for all other sales in a category (column)
	 * @return
	 */
	public static double[] calculateHolidayBonus(double data[][], double high, double low, double other)
	{
		double HolidayBonuses[] = new double[data.length];
		
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if (data[i][j] == TwoDimRaggedArrayUtility.getHighestInColumn(data, j))
				{
					HolidayBonuses[i] += high;
				}
				else if (data[i][j] <= 0)
				{
					;
				}
				else if (data[i][j] == TwoDimRaggedArrayUtility.getLowestInColumn(data, j))
				{
					HolidayBonuses[i] += low;
				}
				else
				{
					HolidayBonuses[i] += other;
				}
			}
		}
		
		return HolidayBonuses;
	}
	
	/**
	 * Method used to calculate the total holiday bonus from all the companies
	 * @param data Ragged array of sales data
	 * @param high The bonus for the highest sales in a category (column)
	 * @param low The bonus for the lowest sales in a category (column)
	 * @param other The bonus for all other sales in a category (column)
	 * @return
	 */
	public static double calculateTotalHolidayBonus(double data[][], double high, double low, double other)
	{
		double HolidayBonuses[] = new double[data.length];
		
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				if (data[i][j] == TwoDimRaggedArrayUtility.getHighestInColumn(data, j))
				{
					HolidayBonuses[i] += high;
				}
				else if (data[i][j] <= 0)
				{
					;
				}
				else if (data[i][j] == TwoDimRaggedArrayUtility.getLowestInColumn(data, j))
				{
					HolidayBonuses[i] += low;
				}
				else
				{
					HolidayBonuses[i] += other;
				}
			}
		}
		
		double sum = 0;
		
		for (int i = 0; i < HolidayBonuses.length; i++)
		{
			sum += HolidayBonuses[i];
		}
		
		return sum;
	}
}
