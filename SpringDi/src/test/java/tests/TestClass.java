package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass
{
   @BeforeClass
   public void demo()
   {
	   System.out.println("before class");
   }
   
   @BeforeMethod
   public void delta()
   {
	   System.out.println("before method");
   }
   
   @Test//enabled=false
   public void testA()
   {
	   System.out.println("test A");
   }
   
   @Test(priority=1)
   public void testB()
   {
	   System.out.println("test B");
	   
   }
   
   @Test//invocationCount=3
   public void testC()
   {
	   System.out.println("test c");
   }
   
   @Test(timeOut = 3000)
   public void testD() throws InterruptedException
   {
	   System.out.println("test D");
	   Thread.sleep(5000);
	   System.out.println("Shri");
   }
   
   @Test//dependsOnMethods={"test A","test B"}
   public void testE()
   {
	   System.out.println("test E");
   }
   
   @AfterMethod
   public void aftermethod()
   {
	   System.out.println("after method");
   }
   
   @AfterClass
   public void afterclass()
   {
	   System.out.println("after class");
   }
   
   
   
}
