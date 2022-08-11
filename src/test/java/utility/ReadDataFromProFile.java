package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProFile {
	public static String readConfigData(String datatoberead) throws IOException
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\Configure.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String value = prop.getProperty(datatoberead);
		
		System.out.println(value);
		
		return value;
		
		
	}

	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
	
	String path = System.getProperty("user.dir")+"\\Configure.properties";
		
		FileInputStream fis = new FileInputStream(path);
	
	prop.load(fis);
	
	String url = prop.getProperty("Testurl");
	String url1 = prop.getProperty("Restsearch");
	String url11 = prop.getProperty("fb");
	String url111 = prop.getProperty("anil");
	System.out.println(url);
	System.out.println(url1);
System.out.println(url11);
	System.out.println(url111);
	
		
		
	}

}

