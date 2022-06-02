package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage2 
{
	@FindBy (xpath="//input[@name='username']")
    private WebElement username;
    
    @FindBy (xpath="//input[@name='pwd']")
    private WebElement password;
    
    @FindBy (xpath="//a[@id='loginButton']")
    private WebElement login;
  
   
    @FindBy (xpath="//input[@id='keepLoggedInCheckBox']")
    private WebElement keepMeLoginCheckbox ;
    
    WebDriver driver;
    WebDriverWait wait;
    
    public LoginPage2(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	this.driver= driver;
    }
    
    
    
    public void sendUsername()
    {
    	wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(username));
    	username.sendKeys("bhagyashripatil135@gmail.com");
    }
    
    public void sendPasswordName()
    {
    	wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(password));
    	password.sendKeys("uTyTXtYj");
    }
    
    public void selectKeepMeLogin()
    {
    	wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(keepMeLoginCheckbox));
    	keepMeLoginCheckbox.click();
    }
    
    public void clickOnLogin()
    {
    	wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(login));
    	login.click();
    }
}


