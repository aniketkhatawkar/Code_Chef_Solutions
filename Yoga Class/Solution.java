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
		    int x = input.nextInt();
		    int y = input.nextInt();
		    
		    if(n%2==0) {
		        if((n/2)*y<n*x)
		            System.out.println(n*x);
		        else
		            System.out.println((n/2)*y);
		    }
		    else {
		        if(((n/2)*y+x)<n*x)
		            System.out.println(n*x);
		        else
		            System.out.println(((n/2)*y)+x);
		    }
		}
	}
}
