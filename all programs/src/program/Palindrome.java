package program;

public class Palindrome 
{
	
	public static void main(String[] args) 
	{
	int remainder,reverse=0,number=121;
	int result=number;
	while(number!=0)
	{
		remainder= number% 10;
		reverse=reverse*10+remainder;
		number /=10;
	}
	
	if(reverse==result)
	{
		System.out.println("No is Palindrome");
		
	}
	else
	{
		System.out.println("No is not Palindrome");
	}
}
}