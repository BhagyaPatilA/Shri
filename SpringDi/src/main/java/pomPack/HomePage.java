package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
    @FindBy(xpath="//div[text()='Time-Track']")
    private WebElement timetrack;
    
    @FindBy(xpath="//div[@id='container_tasks']")
    private WebElement tasks;
    
    @FindBy(xpath="//div[@id='container_reports']")
    private WebElement reports;
    
    @FindBy(xpath="//div[text()='Users']")
    private WebElement user;
    
    @FindBy(xpath="//a[@id='logoutLink']")
    private WebElement logout;
    
   
    
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	
    	
    }
    
    public void clickOnTimeTrack()
    {
    	
    	timetrack.click();
    	
    }
    public  void clickOnTasksTab()
    {
    	
    	tasks.click();
    }
    public void clickOnReportsTab()
    {
    	
       reports.click();	
    }
    public void cliclOnUserTab()
    {
    	
    	user.click();
    }
    public void clickOnlogout()
    {
    	logout.click();
    }
}

