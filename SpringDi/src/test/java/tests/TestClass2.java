package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 
{
     @BeforeClass
     public void bhagya()
     {
    	 System.out.println("before class");
     }
     
     @BeforeMethod
     public void patil()
     {
    	 System.out.println("before method");
     }
     
     @Test
     public void testA()
     {
    	 System.out.println("Test A");
     }
     
     @Test
     public void testB()
     {
    	 System.out.println("Test B");
     }
     
     @Test
     public void testC()
     {
    	 System.out.println("Test C");
     }
     
     @AfterMethod
     public void aftermethod()
     {
    	 System.out.println("aftermethod");
     }
     
     @AfterClass
     public void afterclass()
     {
    	 System.out.println("afterclass");
     }
}
