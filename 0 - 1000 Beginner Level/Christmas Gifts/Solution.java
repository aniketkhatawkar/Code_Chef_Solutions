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
		    
		    int h = input.nextInt();
		    int l = input.nextInt();
		    int w = input.nextInt();
		    
		    int box=(h*l)+(l*w)+(w*h);
		    
		    System.out.println(1000/(box*2));
		}
	}
}
