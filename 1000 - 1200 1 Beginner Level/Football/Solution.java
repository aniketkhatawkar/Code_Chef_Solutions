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
		    int maxi=0;
		    
		    int a[] = new int[n];
		    int b[] = new int[n];
		    
		    for(int i=0; i<n; i++){
		        a[i]=input.nextInt();
		    }
		    
		    for(int i=0; i<n; i++){
		        b[i]=input.nextInt();
		    }
		    
		    for(int i=0; i<n; i++){
		        maxi=Math.max(maxi, (a[i] * 20) - (b[i] * 10));
		    }
		    
		    System.out.println(maxi);
		}
	}
}
