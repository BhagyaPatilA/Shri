package program;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg
{
   @BeforeClass
   public void demo()
   {
	   System.out.println("before class");
   }
   
   @BeforeMethod
   public void alpha()
   {
	   System.out.println(" before method");
   }
   @Test
   public void delta()
   {
	   System.out.println("Test");
   }
}
