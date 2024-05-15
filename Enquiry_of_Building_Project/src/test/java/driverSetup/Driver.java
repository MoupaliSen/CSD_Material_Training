package driverSetup;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Driver {
	public static WebDriver driver;
	public static Properties p;

	
	//To call different browsers
	public void driverSetup(int choice) throws IOException
	{
		FileReader file = new FileReader(".//src//test//resources//configure.properties");
        p = new Properties();
        p.load(file);
        
		switch(choice) {
		case 1: 
			driver = new ChromeDriver(); //Launch Chrome Browser
			break;
		case 2:
			driver = new EdgeDriver();  // Launch Edge Browser
			break;
		case 3:
			System.out.println("Program Closed");
			System.exit(0);
			break;
		default:
			System.out.println("Correct option not selected...!!");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(p.getProperty("appurl"));
		
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	

}