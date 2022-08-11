package testcase;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.TestNGListener22;
import utility.ReadDataFromProFile;

public class LoginTest extends TestNGListener22 {

	@Test(priority=1)
	public void validateLogin() throws IOException {

		lpa.loginToApplication(ReadDataFromProFile.readConfigData("username"),ReadDataFromProFile.readConfigData("password"));
		test.info("Entered creds are: "+ReadDataFromProFile.readConfigData("username")+" "+ReadDataFromProFile.readConfigData("password"));
		lpa.enterPin();
		test.info("Entered pin");
	}

	@Test(priority=2)
	public void validateTitle() {
		String actualtitle= lpa.titleOfPage();
		
		
		String expectedtitle="Kite - Zerodha's fast and elegant flagship trading platform";
		test.info("Title of the page validated");
		Assert.assertEquals(actualtitle, expectedtitle);
	}

}