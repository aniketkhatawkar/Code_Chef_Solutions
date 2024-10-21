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
		    
		    int time1 = input.nextInt();
		    int time2 = input.nextInt();
		    int radius1 = input.nextInt();
		    int radius2 = input.nextInt();
		    
		    double a1=Math.pow(time1,2)/Math.pow(radius1,3);
		    double a2=Math.pow(time2,2)/Math.pow(radius2,3);
		    
		    if(a1==a2) {
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
