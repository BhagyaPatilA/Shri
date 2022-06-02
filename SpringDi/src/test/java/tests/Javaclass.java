package tests;

import java.util.ArrayList;

public  final class Javaclass 
{
  public static void main (String[]args)
  {
	  ArrayList a = new ArrayList ();
	   
	  //HetoroGenious Collection
	  a.add(15);
	  a.add("Shri");
	  a.add('$');
	  a.add(13.50);
	  
	  for(int i = 0; i<a.size();i++)
		  
	  {
		  System.out.println(a.get(i));
	  }
	  
	  
	 
  }
}



