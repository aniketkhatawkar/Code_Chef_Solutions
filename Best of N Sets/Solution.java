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
		    
		    int x = input.nextInt();
		    int y = input.nextInt();
		    
		    // Get Max of two multiply it and -1 from it
		    System.out.println((Math.max(x,y)*2)-1);
		  
		}
	}
}
