package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks
{
    public static void main(String[] args) throws IOException
    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMIT\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    for(WebElement link:links)
	    {
	    	String linkURL=link.getAttribute("href");
	    	URL url=new URL (linkURL);
	    	URLConnection urlConnection = url.openConnection();
	    	urlConnection.connect();
	    	HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection;
	    	httpURLConnection.setConnectTimeout(5000);
	    	if(httpURLConnection.getResponseCode()==200)
	    	{
	    		System.out.println(linkURL+"-"+httpURLConnection.getResponseCode()+"-"+httpURLConnection.getResponseMessage());
	    	}
	    	else
	    	{
	    		System.err.println(linkURL+"-"+httpURLConnection.getResponseCode()+"-"+httpURLConnection.getResponseMessage());
	    	}
	    	httpURLConnection.disconnect();
	    	
	    }
	}
}
