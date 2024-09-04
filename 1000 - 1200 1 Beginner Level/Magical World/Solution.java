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
		    
		    int a = input.nextInt();
		    int b = input.nextInt();
		    int x = input.nextInt();
		    
		    if((a*b)<=x*x) {
		        System.out.println(0);
		    }
		    else if(a<=x*x || b<=x*x) {
		        System.out.println(1);
		    }
		    else {
		        System.out.println(2);
		    }
		}
	}
}