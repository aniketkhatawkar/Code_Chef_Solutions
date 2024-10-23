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
		    
		    long n = input.nextInt();
		    long k = input.nextInt();
		    
		    long a=1;
		    
		    for(long j=1;j<k;j++) {
		        a=a*((n-k)+j)/j;
		    }
		    
		    System.out.println(a);
		}
	}
}
