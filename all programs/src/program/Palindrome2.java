package program;

public class Palindrome2
{
  public static void main(String[] args) 
  {
	String str ="POP";
	String reverseStr = ""; 
    int strLength=str.length();
	for(int i=(strLength-1);i>=0;i--)
	{
		reverseStr = reverseStr+ str.charAt(i);
	}
	if(str.toLowerCase().equals(reverseStr.toLowerCase()))
	{
		System.out.println(" POP Is Palindrome " );
	}
	else
	{
		System.out.println(" POP Is Not Palindrome ");
	}
			
  }
}
