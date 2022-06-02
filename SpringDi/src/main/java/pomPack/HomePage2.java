package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage2
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
    
   WebDriver driver;
   WebDriverWait wait;
    
    public HomePage2(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	this.driver = driver;
    	
    }
    
    public void clickOnTimeTrack()
    {
    	wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(timetrack));
    	timetrack.click();
    	
    }
    public  void clickOnTasksTab()
    {
    	wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(tasks));
    	tasks.click();
    }
    public void clickOnReportsTab()
    {
    	wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(reports));
       reports.click();	
    }
    public void cliclOnUserTab()
    {
    	wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(user));
    	user.click();
    }
    public void clickOnlogout()
    {
    	wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(logout));
    	logout.click();
    }
}



