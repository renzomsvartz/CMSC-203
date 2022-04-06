package Project_4_Renzo_Svartz;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	Property p1, p2, p3, p4, p5, p6;
	ManagementCompany m; 
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		m = new ManagementCompany("Renzo's Company", "12345",6);
		
		//student add three properties, with plots, to mgmt co
		p1 = new Property ("Building A", "Gaithersburg", 1000.00, "Renzo Svartz",2,1,2,2);
		p2 = new Property ("Building B", "Rockville", 2000, "Renzo Svartz",4,1,2,2);
		p3 = new Property ("Building C", "Olney", 3000, "Renzo Svartz",6,1,2,2);
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null 
		m = null;
		p1=p2=p3=p4=p5=null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		p4 = new Property ("Four Args", "Testville", 2613, "Renzo Svartz");
		//student should add property with 8 args
		p5 = new Property ("Eight Args", "Testville", 5327, "Renzo Svartz",4,5,2,2);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		p6 = new Property ("Sixth Building", "Testville", 6666, "Renzo Svartz");
		
		assertEquals(m.addProperty(p4),3,0);
		assertEquals(m.addProperty(p5),4,0);
		assertEquals(m.addProperty(p6),-1,0);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m.maxRentProp(),3000.0,0);
		
	}

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		assertEquals(m.totalRent(),6000.0,0);
	}

 }
