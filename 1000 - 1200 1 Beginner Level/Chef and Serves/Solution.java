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
		    
		    int p1 = input.nextInt();
		    int p2 = input.nextInt();
		    int k = input.nextInt();
		    
		    int done=(p1+p2)/k;
		    
		    if(done%2==0) {
		        System.out.println("CHEF");
		    }
		    else {
		        System.out.println("COOK");
		    }
		}
	}
}
