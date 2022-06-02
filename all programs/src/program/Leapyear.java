package program;

public class Leapyear
{
    public static void main(String[] args) 
    {
		int year = 2012;
		boolean leap=false;
		
		if( year % 4==0)
		{
			if(year % 100==0)
			{
				if(year % 400==0 )
					leap=true;
				else
					leap=false;
			}
			else
				leap=true;
		}
		else
			leap=false;
		if(leap)
			System.out.println("2012 IS LEAP YEAR");
		else
			System.out.println("2012 IS NOT LEAP YEAR");
    }
}
		
		
		
