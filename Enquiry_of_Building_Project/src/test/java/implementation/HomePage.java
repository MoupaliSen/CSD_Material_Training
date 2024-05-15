package implementation;

import org.openqa.selenium.By;

public class HomePage extends Implementation {
	
	public void handlePopups()
		{
		  if(driver.findElement(By.xpath("//div[@class='elementor-widget-container']//img[@class='attachment-large size-large wp-image-34580']")).isDisplayed()) {
		    
           driver.findElement(By.xpath("//a[@class='dialog-close-button dialog-lightbox-close-button']/i")).click();
		}			
			if(driver.findElement(By.xpath("//a[@class='lp-live-button']")).isDisplayed()) {
			driver.findElement(By.xpath("//a[@class='lp-live-button']")).click();
			driver.findElement(By.xpath("//a[@class='livprop_close']")).click();

			}
			else
			{
				driver.findElement(By.xpath("//a[@class='livprop_close']")).click();
	
			}
		}
	public void navigateToCompletedProjects() 
		{
		   driver.findElement(By.xpath("//li[@id='menu-item-25810']//a[normalize-space()='Completed Projects'][@class='nav-link ']")).click();
		   handlePopups();
		   
		}
	
	

}
