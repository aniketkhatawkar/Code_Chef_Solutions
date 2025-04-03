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
		    
		    int r = input.nextInt();
			int x1 = input.nextInt();	int y1 = input.nextInt();
			int x2 = input.nextInt();	int y2 = input.nextInt();
			int x3 = input.nextInt();	int y3 = input.nextInt();
			
			double a = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			double b = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
			double c = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
			
			if ( (a<=r && b<=r) || (b<=r && c<=r) || (c<=r && a<=r) ) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}
