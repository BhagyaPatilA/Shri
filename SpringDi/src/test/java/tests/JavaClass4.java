package tests;

import java.util.HashMap;
import java.util.Map;

public final class JavaClass4

{
	public static void main(String[] args) 
		
	{
     HashMap<Integer , String> m = new HashMap<Integer , String>();
     
     m.put(13, "Bhagya");
     m.put(28, "Ashwini");
     m.put(15, "Madhuri");
     m.put(8, "Bappa");
     m.put(null, "Null Put");
     m.put(3, null);
     
     for (Map.Entry<Integer, String>  e : m.entrySet())
     {
    	 System.out.println(" Key = " + e.getKey()+ "   Value = " + e.getValue());
     }
     
     System.out.println("#########################################");
     
     m.put(8, "Shri");
     
     for (Map.Entry<Integer, String> e : m.entrySet())
{
	System.out.println(" Key = " + e.getKey()+  "  Value =" + e.getValue());
}
	}
}
	


	

     
	

