package MainPackage;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTesting {
	

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}
	
	@Before
	public void setUp() throws Exception{
	}
	
	@After
	public void tearDown() throws Exception{
	}
	
	@Test
	public void testReturnTotalTuitionCost() throws InsufficientFundsException {
		Account A1 = new Account(111, 10000.0);
		A1.withdraw(50.0);
		Account A2 = new Account(222, 20000.0);
		A2.withdraw(0);
		Account A3 = new Account(333, 30000.0);
		A3.withdraw(30000.0);
		Account A4 = new Account(444, 40000.0);
		A4.deposit(500.0);

		
		
		assertTrue("Assertion is False1", A1.getbalance()==9950.0);
		assertTrue("Assertion is False2", A2.getbalance()==20000.0);
		assertTrue("Assertion is False3", A3.getbalance()==0);
		assertTrue("Assertion is False4", A4.getbalance()==40500.0);
	}

}
