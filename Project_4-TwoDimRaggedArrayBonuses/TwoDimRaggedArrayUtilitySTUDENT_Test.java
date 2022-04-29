package Project_5_Renzo_Svartz;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = {{1.1,2.2,3.3},{4.4,5.5},{6.6,-7,8}};
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		assertEquals(24.1,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT),.001);
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		assertEquals(3.012,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT),.001);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(6.6,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT,0),.001);
		assertEquals(9.9,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT,1),.001);
		assertEquals(7.6,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT,2),.001);
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(12.1,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,0),.001);
		assertEquals(0.7,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,1),.001);
		assertEquals(11.3,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,2),.001);
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		assertEquals(8.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT),.001);	
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * 
	 */
	@Test
	public void testWriteToFile() throws IOException {
		double[][] array=null;
		try {
			TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT, outputFile);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		array = TwoDimRaggedArrayUtility.readFile(outputFile);
		assertEquals(1.1, array[0][0],.001);
		assertEquals(2.2, array[0][1],.001);
		assertEquals(3.3, array[0][2],.001);
		assertEquals(4.4, array[1][0],.001);
		assertEquals(5.5, array[1][1],.001);
		assertEquals(6.6, array[2][0],.001);
		assertEquals(-7, array[2][1],.001);
		assertEquals(8, array[2][2],.001);
	}

}
