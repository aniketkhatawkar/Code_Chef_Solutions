/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		
		int test = input.nextInt();
		
		for(int t=0; t<test; t++) {
		    String s=input.next();
		    String s1 = s.substring(1)+s.substring(0,1);
		    String s2 = s.substring(s.length()-1)+s.substring(0,s.length()-1);
		    
		    System.out.println((s1.equals(s2))?"YES":"NO");
		}
	}
}
