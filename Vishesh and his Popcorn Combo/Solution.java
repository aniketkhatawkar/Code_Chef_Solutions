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
		    
		    int a1 = input.nextInt();
		    int a2 = input.nextInt();
		    
		    int b1 = input.nextInt();
		    int b2 = input.nextInt();
		    
		    int c1 = input.nextInt();
		    int c2 = input.nextInt();
		    
		    // print max value
			System.out.println(Math.max((a1+a2), Math.max(b1+b2, c1+c2)));
		}
	}
}
