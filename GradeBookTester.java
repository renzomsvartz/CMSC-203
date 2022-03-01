package Lab_5_Renzo_Svartz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester 
{
	private GradeBook gradebook1;
	private GradeBook gradebook2;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		gradebook1 = new GradeBook(5);
		gradebook1.addScore(10);
		gradebook1.addScore(20);
		
		gradebook2 = new GradeBook(5);
		gradebook2.addScore(30);
		gradebook2.addScore(40);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		gradebook1 = gradebook2 = null;
	}

	@Test
	void testGetScoreSize() 
	{
		assertEquals(2, gradebook1.getScoreSize());
		assertEquals(2, gradebook2.getScoreSize());
	}

	@Test
	void testToString() 
	{
		assertEquals("Scores = 10.0 20.0 ", gradebook1.toString());
		assertTrue(gradebook2.toString().equals("Scores = 30.0 40.0 "));
	}

	@Test
	void testAddScore() 
	{
		assertEquals("Scores = 10.0 20.0 ", gradebook1.toString());
		gradebook1.addScore(30);
		assertEquals("Scores = 10.0 20.0 30.0 ", gradebook1.toString());
		
		assertEquals("Scores = 30.0 40.0 ", gradebook2.toString());
		gradebook2.addScore(50);
		assertEquals("Scores = 30.0 40.0 50.0 ", gradebook2.toString());
	}

	@Test
	void testSum() 
	{
		assertEquals(30, gradebook1.sum(), .0001);
		assertEquals(70, gradebook2.sum(), .0001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(10, gradebook1.minimum(), .001);
		assertEquals(30, gradebook2.minimum(), .001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(20, gradebook1.finalScore(), .0001);
		assertEquals(40, gradebook2.finalScore(), .0001);
	}

}
