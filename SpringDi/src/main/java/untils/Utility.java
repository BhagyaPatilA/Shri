package untils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
    public static void captureScreenshot(int testcaseID , WebDriver driver) 
    {
    	Date currentDate = new Date();
    	String screenshot = currentDate.toString().replace(" " , "-").replace(":", "-");
    	System.out.println(screenshot);
    	
    	TakesScreenshot s = (TakesScreenshot) driver;
    	File source = s.getScreenshotAs(OutputType.FILE);
    	File dest = new File("C:\\Users\\AMIT\\eclipse-workspace\\SpringDi\\test-output\\test-output\\old\\Screenshot\\"+screenshot+".png");
    	try
    	{
			FileHandler.copy(source, dest);
		} 
    	catch (IOException e)
    	{
			
			e.printStackTrace();
		}
    	
    }
    	public static String getDataFromexelsheet(String sheetName , int row , int col) throws IOException
    	{

    			
    		String Path = "C:\\Users\\AMIT\\Desktop\\bhagya.xlsx\\";
    		FileInputStream file = new FileInputStream(Path);
            Workbook book = WorkbookFactory.create(file);
            Sheet test = book.getSheet("Sheet1");
            String Data = test.getRow(row).getCell(col).getStringCellValue();
    		return Data;
    					
    
    }
    
       
    
}  