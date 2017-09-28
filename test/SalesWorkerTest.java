import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for the SalesWorker class
 * 
 * @author Kacper Woloszyn
 * @version 20/4/2016
 */

public class SalesWorkerTest {
	private SalesWorker salNormal1, salNormal2;
	private SalesWorker salValidation1, salValidation2, salValidation3;
	private SalesWorker sales1;
	private SalesWorker sales2;
	
	/**
	 * Method to set up data for testing. 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		salNormal1 = new SalesWorker ("Padraig", "Computing", 20, 12);
		salNormal2 = new SalesWorker ("Big", "Boss", 95.30, 18);
		sales1 = new SalesWorker("Rachel", "Green", 10, 20);
		sales1 = new SalesWorker("Selly", "Seller", 12, 15);

		
		salValidation1 = new SalesWorker ("Mary", "Contrary", -1, -1);
		salValidation2 = new SalesWorker ("Mike", "Contrary", 0, 0);
		salValidation3 = new SalesWorker ("Mark", "Contrary", 1, 1);
    }

	/**
	 * Test method for Sales Worker constructor using valid data
	 */
	@Test
	public void testGettersValidData() {
		assertEquals("Padraig", salNormal1.getFirstName());
		assertEquals("Computing", salNormal1.getSecondName());
        assertEquals(12, salNormal1.getBonusPercentage(), 0.01);
		assertEquals(20, salNormal1.getHourlyRate(), 0.01);	
	}

	/**
	 * Test method for Sales Worker constructor using Invalid data
	 */
	@Test
	public void testSalesWorkerInvalidData() {
		assertEquals(0, salValidation1.getBonusPercentage(), 0.01);
		assertEquals(0, salValidation1.getHourlyRate(), 0.01);
		assertEquals(0, salValidation2.getBonusPercentage(), 0.01);
		assertEquals(0, salValidation2.getHourlyRate(), 0.01);
		assertEquals(1, salValidation3.getBonusPercentage(), 0.01);
		assertEquals(1, salValidation3.getHourlyRate(), 0.01);
	}	
	
	/**
	 * Test method for first name getter and setter (No validation on this field)
	 */
	@Test
	public void testGetSetFirstName() {
		assertEquals(salNormal1.getFirstName(), "Padraig");
		salNormal1.setFirstName("Paddy");
		assertEquals(salNormal1.getFirstName(),"Paddy");
	}

	/**
	 * Test method for second name getter and setter. (No validation on this field)
	 */
	@Test
	public void testGetSetSecondName() {
		assertEquals(salNormal1.getSecondName(), "Computing");
		salNormal1.setSecondName("Computers");
		assertEquals(salNormal1.getSecondName(),"Computers");
	}

	/**
	 * Test method for getBonusPercentage and setBonusPercentage. (Validation on this field)
	 */
	@Test
	public void testGetSetBonusPercentage() {
		assertEquals(12, salNormal1.getBonusPercentage(), 0.01);
        salNormal1.setBonusPercentage(-1);
		assertEquals(12, salNormal1.getBonusPercentage(), 0.01);
        salNormal1.setBonusPercentage(0);
        assertEquals(0, salNormal1.getBonusPercentage(), 0.01);
        salNormal1.setBonusPercentage(12);
        assertEquals(12, salNormal1.getBonusPercentage(), 0.01);
	}

	/**
	 * Test method for getHourlyRate and setHourlyRate. (Validation on this field)
	 */
	@Test
	public void testGetSetHourlyRate() {
		assertEquals(20, salNormal1.getHourlyRate(), 0.01);
        salNormal1.setHourlyRate(-1);
		assertEquals(20, salNormal1.getHourlyRate(), 0.01);
        salNormal1.setHourlyRate(0);
        assertEquals(0, salNormal1.getHourlyRate(), 0.01);
        salNormal1.setHourlyRate(20);
        assertEquals(20, salNormal1.getHourlyRate(), 0.01);
	}
	
	/**
	 * Test method for calculateSalary()
	 */
	@Test
	public void testCalculateSalary() {
		// manager with no employees
		assertEquals(752.0, salNormal1.calculateSalary(37), 0.01);
		assertEquals(762.0, salNormal1.calculateSalary(37.5), 0.01);
		assertEquals(782.0, salNormal1.calculateSalary(38), 0.01);
		assertEquals(804.69, salNormal1.calculateSalary(38.5674), 0.01);
		
		//manager with employees
		assertEquals(3544.1, salNormal2.calculateSalary(37), 0.01);
		assertEquals(3591.75, salNormal2.calculateSalary(37.5), 0.01);
		assertEquals(3750.71, salNormal2.calculateSalary(38.334), 0.01);	
	}
}