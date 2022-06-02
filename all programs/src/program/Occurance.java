package program;

public class Occurance
{
  public static void main(String[] args)
  {
	String A = "Bhagyashri Patil";
	int []occurance = new int[A.length()];
	char String[] = A.toCharArray();
	for(int i =0;i<A.length();i++)
	{
		occurance[i]=1;
		for(int j=i+1;j<A.length();j++)
		{
			if(String[i]==String[j])
			{
				occurance[i]++;
				String[j]='0';
			}
		}
	}
	System.out.println("Characters And Occurance Of Their");
	for(int i = 0;i<occurance.length;i++)
	{
		if(String[i]!=' '&& String[i]!='0')
		System.out.println(String[i]+"-"+occurance[i]);
	}
	
}
}
