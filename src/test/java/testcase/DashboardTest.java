package testcase;

import org.testng.annotations.Test;

import listeners.TestNGListener22;

public class DashboardTest extends TestNGListener22 {
	@Test(priority = 3)
	public void searchSharesTest()
	{
		test.info("searching the shares");
		dp.searchShares();
	}
	
	
	@Test(priority = 4)
	public void validateBuyShare()
	{ 
		test.info("Placing the order");
		dp.buyShare();
	}
	
}
