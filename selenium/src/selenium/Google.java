package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Google{
		
	

	public static void main(String[] args) throws InterruptedException 
	   {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\AMIT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  
		  WebElement SignIn  = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
		  SignIn.click();
		  
		  WebElement email  = driver.findElement(By.xpath("//input[@type='email']"));
		  email.sendKeys("7028292809");
		  
		  WebElement bhagya  = driver.findElement(By.xpath("//input[@id='continue']"));
		  bhagya.click();
		  
		  WebElement password  = driver.findElement(By.xpath("//input[@type='password']"));
		  password.sendKeys("durgapatil@13");
		  
		  WebElement Sign  = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		  Sign.click();
		  
		  Thread.sleep(5000);
		  
		  WebElement Search  = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		  Search.sendKeys("One Plus");
		  Search.submit();
		  
		  Thread.sleep(6000);
		  
		  WebElement Select  = driver.findElement(By.xpath("//span[contains(text(),'OnePlus 10 Pro 5G ')][1]"));
		  Select.click();
		  Thread.sleep(4000);
		  
		  
		  WebElement Patil = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		  Patil.click();
		
		  
		  
		
		  
		  
		  
		
		  
		  
		
		  
		
		  
		  
		  
		  
		  
		
		  		
		  
		  
		  
		  
		
		  
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
	}

