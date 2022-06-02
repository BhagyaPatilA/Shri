package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html1
{
    public static void main(String[] args) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMIT\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.w3schools.com/html/html_tables.asp");
    	
    	
    	List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tr"));
    	System.out.print(row.size());
    	System.out.println();
    	
    	List<WebElement> coloumn = driver.findElements(By.xpath("//table[@id='customers']//tr[2]//td"));
    	System.out.print(coloumn.size());
    	System.out.println();
    	
    	for(int i =2 ; i<= row.size(); i++)
    	{
    		for(int j = 1; j<= coloumn.size(); j++)
    		{
    			
                String value = driver.findElement(By.xpath("//table[@id='customers']//tr["  +  i  +  "]//td["  + j +  "]")).getText();
                System.out.print(value+   "			\t			" );
                
			    
    		}   
			    
			    System.out.println();
    	}
    	
    	driver.quit();
	}
}

