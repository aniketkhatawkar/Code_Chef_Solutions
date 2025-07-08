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
		    
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int n = input.nextInt();
		    int r = input.nextInt();
		    
		    if(r<n*x) {
		        System.out.println(-1);
		    }
		    else {
		        int Premium = Math.min(n,((r-(x*n))/(y-x)));
		        
		        System.out.println(n-Premium +" "+ Premium);
		    }
		}
	}
}
