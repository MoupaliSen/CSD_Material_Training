package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Enquiry extends Implementation{
	public void enquiryNow() throws InterruptedException
		{
			//HomePage hp = new HomePage();
			//hp.handlePopups();
		   	driver.findElement(By.xpath("//span[normalize-space()='Contact Us']")).click();
		   	
		   	WebElement contact =driver.findElement(By.xpath("//h1[@class='elementor-heading-title elementor-size-default']"));
		   	if(contact.isDisplayed())
		   	{
		   		System.out.println("The 'Contact info' message is displayed");
		   		
		   	}
		   	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
			//click on “Enquire Now” button
		   	driver.findElement(By.xpath("//div[@class='mci-ph enq-tooltip-new']")).click();

		   	//Read and display the email address for contact to console
		   	driver.findElement(By.xpath("//li[@class='elementor-icon-list-item']//a[normalize-space()='Other Enquiry']")).click();
		   	WebElement display = driver.findElement(By.xpath("//div[@class='cont-pop']//a"));
		   
		   	if(display.isDisplayed()) {
		   		System.out.println("The displayed Email Id is: "+display.getText());
		   	}
		   	else
		   	{
			   	System.out.println("Email Id not displayed");

		   	}
		   	
		   	driver.quit();

			
		}

}
