package tryandcatcth;

public class Try2 
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
		  c=a/b;
		  System.out.println("Bhagya");
	  }
	  catch(ArithmeticException e )
	  {
		  System.out.println("Shri");
		  b=1;
	  }
	  catch(ArrayIndexOutOfBoundsException l)
	  {
		 System.out.println("Shri"); 
		 b=1;
	  }
	  System.out.println(c);
}
}
