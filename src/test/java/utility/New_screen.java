package utility;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class New_screen {
	public static String CaptureScreenShotwithpath (WebDriver driver, String filename) throws IOException 
	{
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") +"\\screenshots\\"+ filename+".png";
		File destination = new File (path);
		FileHandler.copy(source,destination);
		return path;
}}
