package tests;

import java.util.ArrayList;

public  final class JavaClass1
{
    public static void main(String[] args)
    {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(15);
		a.add(28);
		a.add(13);
		a.add(31);
		
		
		for(int i = 0; i< a.size();i++)
		{
		System.out.println(a.get(i));
		}
	
}
}
