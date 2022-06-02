package tests;

import java.util.Hashtable;
import java.util.Map;

public class JavaClass5 
{
   public static void main(String[] args) 
   {
	   Hashtable<Integer,String> table = new Hashtable<Integer , String>();
	   
	   table.put(13, "Shri");
	   table.put(15, "Madhuri");
	   table.put(28, "Ashwini");
	   table.put(3, "Bappa");
	   
	   for(Map.Entry<Integer, String>  k : table.entrySet())
	   {
		   System.out.println(" Key = " +  k.getKey() + " Value = "+ k.getValue());
	   }
   }
}
