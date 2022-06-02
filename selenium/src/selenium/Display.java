package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display 
{
       public static void main(String[] args)
       {
    	   System.setProperty("webdriver.chrome.driver","C:\\Users\\AMIT\\Downloads\\chromedriver_win32\\chromedriver.exe");
 		  WebDriver driver = new ChromeDriver();
 		  driver.get("https://freecrm.com/");
 		  
 		 WebElement SignUp  = driver.findElement(By.xpath("//a[@href='https://api.freecrm.com/register/']"));
 		 SignUp.click();
 		 
 		//WebElement Countrycode  = driver.findElement(By.xpath("//i[@class='dropdown icon']"));
 		//boolean result = Countrycode.isSelected();
 		
 		WebElement conditions  = driver.findElement(By.xpath("//input[@type='checkbox']"));
 		conditions.click();
 		boolean result = conditions.isEnabled();
 		
 		
 		if(result==true)
 		{
 			System.out.println(result);
 			System.out.println("PASS");
 		}
 		else
 		{
 			System.out.println(result);
 			System.out.println("FAIL");
 			conditions.click();
 		}
 		
 		result = conditions.isEnabled();
 		System.out.println(result);
 		 
 		 
		
	}
}
