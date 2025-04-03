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
		    
		    int n = input.nextInt();
		    
		    long sale[]= new long[n];
		    long prof[]= new long[n];
		    
		    for(int i=0; i<n; i++){
		        sale[i]=input.nextLong();
		    }
		    
		    prof[0]=sale[0]*2;
		    long sum=sale[0];
		    
		    for(int i=1; i<n; i++){
		        prof[i]=sum+sale[i]*2;
		        sum+=sale[i];
		    }
		    
		    Arrays.sort(prof);
		    
		    System.out.println(prof[n-1]);
		}
	}
}
