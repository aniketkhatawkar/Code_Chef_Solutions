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
		    
			// take input
		    int a = input.nextInt();
		    int b = input.nextInt();
		    int c = input.nextInt();
		    int d = input.nextInt();
		    

		    // if S is more coins then add in N else in S
		    if(b>a) {
		        a+=c;
		    }
		    else {
		        b+=c;
		    }
		    
		    // if S is more coins then add in N else in S
		    if(b>a) {
		        a+=d;
		    }
		    else {
		        b+=d;
		    }
		    
		    if(b>a) {
		        System.out.println("S");
		    }
		    else {
		        System.out.println("N");
		    }
		}
	}
}
