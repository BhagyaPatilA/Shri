package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel
{
public static void main(String[] args) throws IOException 
{
	String path="C:\\Users\\AMIT\\Desktop\\bhagya.xlsx";
	FileInputStream file = new FileInputStream(path);
	
	Workbook  book =WorkbookFactory.create(file);
	Sheet test =book.getSheet("Sheet1");
	
	int rowcount = test.getLastRowNum();
	System.out.println(rowcount+1);
	
	
	for(int i=0;i<rowcount+1;i++)
	{
		Row row=test.getRow(i);
		for(int j=0;j<row.getLastCellNum();j++)
		{
		System.out.print(row.getCell(j).getStringCellValue()+"-");
	    } 
		System.out.println();
	
	   
	
	
	
}
}
}

