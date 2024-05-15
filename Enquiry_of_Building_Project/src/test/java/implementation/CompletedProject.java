package implementation;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CompletedProject extends Implementation{
	public void availableProject() throws InterruptedException
		{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)", "");
		
        LinkedHashSet<String> set = new LinkedHashSet<String>(); 
        
        
		List<WebElement> a = driver.findElements(By.xpath("//h2[@class='item-title']"));
		for(WebElement e:a)
		{
			
			set.add(e.getText());
		}
		System.out.println("Number of Completed Projects: "+ set.size());
		List<String> listOfProjects = new ArrayList<String>(set);
		for(int i=0;i<5;i++)
		{
			
			System.out.println(listOfProjects.get(i));
		}
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		
		}
	    
	

}
