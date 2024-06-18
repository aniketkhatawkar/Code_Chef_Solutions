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
		    
		    double l = input.nextDouble();
		    double v1 = input.nextDouble();
		    double v2 = input.nextDouble();
		    
		    int to=(int)Math.ceil((l/v1));
		    int h=(int)Math.ceil((l/v2));
		    
		    if(h==to) {
		        System.out.println(-1);
		    }
		    else {
		        System.out.println(to-h-1);
		    }
		}
	}
}
