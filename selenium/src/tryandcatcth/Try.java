package tryandcatcth;

public class Try 
{
      public static void main(String[] args) 
      {
    	  System.out.println("Hi");
		  int a = 10;
		  int b = 2;
		  int c = 45;
		  int d [] = {1,45,69,22};
		  
				  
		  try
		  {
			  c = a/b;
			  System.out.println(d[2]);
			  
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Shri");
			  b=1;
			  c=a/b;
		  }
		  finally
		  {
			  System.out.println("finally");
		  }	 
		  System.out.println(c);
      }	
}