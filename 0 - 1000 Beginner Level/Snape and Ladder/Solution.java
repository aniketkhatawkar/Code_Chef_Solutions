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
		
		int t = input.nextInt();
		
		for(int i=0; i<t; i++) {
		    
		    double x = input.nextInt();
		    double y = input.nextInt();
		    
		    double min = Math.sqrt(Math.abs(x*x - y*y));
		    double max = Math.sqrt(x*x + y*y);
		    
		    System.out.println(min + " " + max);
		}
	}
}
