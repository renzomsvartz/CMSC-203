package Project_6_Renzo_Svartz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Project_6_Renzo_Svartz.Beverage.SIZE;
import Project_6_Renzo_Svartz.Beverage.TYPE;
import Project_6_Renzo_Svartz.Order.DAY;

public class OrderTest_GFA 
{
	Order r1,r2,r3,r4;
	@Before
	public void setUp() throws Exception 
	{
		r1 = new Order (8, DAY.MONDAY, "Mary", 22);
		r2 = new Order (12, DAY.SATURDAY, "John", 45);
		r3 = new Order (10, DAY.SUNDAY, "Kate", 21);
	}

	@After
	public void tearDown() throws Exception 
	{
		r1=r2=r3=null;
	}
	
	@Test 
	public void testGetBeverage( )
	{
		Coffee cf = new Coffee("regular Coffee", SIZE.SMALL, false, false);
		Alcohol al = new Alcohol ("Mohito", SIZE.SMALL, false);
		Smoothie sm1 = new Smoothie("Detox", SIZE.MEDIUM, false, 1);
		Smoothie sm2 = new Smoothie("Detox", SIZE.LARGE, false, 1);
		
		r1.addNewBeverage("regular Coffee", SIZE.SMALL, false,false);
		r1.addNewBeverage("Mohito", SIZE.SMALL); 
		r1.addNewBeverage("Detox", SIZE.MEDIUM, false, 1); 
		assertTrue(r1.getBeverage(0).equals(cf) );
		assertTrue(r1.getBeverage(1).equals(al) );
		assertTrue(r1.getBeverage(2).equals(sm1) );
		assertFalse(r1.getBeverage(2).equals(sm2) );
	}

	@Test
	public void testAddNewBeverage() throws NullPointerException   {
		
		assertTrue(r1.getTotalItems() == 0);
		r1.addNewBeverage("regular Coffee", SIZE.SMALL, false,false);
	 	assertTrue(r1.getBeverage(0).getType().equals(TYPE.COFFEE));
		r1.addNewBeverage("Mohito", SIZE.SMALL); 
		assertTrue(r1.getBeverage(1).getType().equals(TYPE.ALCOHOLIC));
		r1.addNewBeverage("Detox", SIZE.MEDIUM, false, 1); 
		assertTrue(r1.getBeverage(2).getType().equals(TYPE.SMOOTHIE));
		assertTrue(r1.getTotalItems() == 3);
		
		r2.addNewBeverage("Detox", SIZE.MEDIUM, true, 4); 
		assertTrue(r2.getBeverage(0).getType().equals(TYPE.SMOOTHIE));
		r2.addNewBeverage("Mohito", SIZE.SMALL); 
		assertTrue(r2.getBeverage(1).getType().equals(TYPE.ALCOHOLIC));
		r2.addNewBeverage("regular Coffee", SIZE.MEDIUM, true,false);
		assertTrue(r2.getBeverage(2).getType().equals(TYPE.COFFEE));
		assertTrue(r2.getTotalItems() == 3);
		 
	}
	 
	 
	@Test
	public void testCalcOrderTotal()   {
		r1.addNewBeverage("regular Coffee", SIZE.SMALL, false,false);
	 	r1.addNewBeverage("Mohito", SIZE.SMALL); 
		r1.addNewBeverage("Detox", SIZE.MEDIUM, false, 1); 
	 
		assertEquals(7.5,r1.calcOrderTotal(),.01);
		
		r2.addNewBeverage("regular Coffee", SIZE.MEDIUM, true,false);
	 	r2.addNewBeverage("Mohito", SIZE.SMALL); 
		r2.addNewBeverage("Detox", SIZE.MEDIUM, true, 4); 
		
		assertEquals(12.6,r2.calcOrderTotal(),.01);
		 
	}
	
	 
 

}
