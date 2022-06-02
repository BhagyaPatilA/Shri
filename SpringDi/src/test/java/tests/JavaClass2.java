package tests;

import java.util.HashSet;

public class JavaClass2
{
   public static void main(String[] args)
   {
	   
	   HashSet<Character> set = new HashSet<Character>();
	   
	   set.add('A');
	   set.add('B');
	   set.add('C');
	   set.add('V');
	   
	   //AdVanced For Loop
	   
	   for ( char y : set )
	   {
		   System.out.println(y);
	   }
}
}
