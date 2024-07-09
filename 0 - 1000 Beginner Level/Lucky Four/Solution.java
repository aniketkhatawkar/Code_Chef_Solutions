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
		    
			// take number as String
		     String n = input.next();
		     int count=0;
		    
			// count the occurence of 4
		     for(int i=0; i<n.length(); i++){
		          if(n.charAt(i)=='4') {
    		     		count++;
    			    }
		     }

			// print count
			System.out.println(count);
		}
	}
}
