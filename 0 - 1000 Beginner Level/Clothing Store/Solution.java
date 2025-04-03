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
		    int z = input.nextInt();
		    
		    int a = input.nextInt();
		    int b = input.nextInt();
		    int c = input.nextInt();
		    
		    int XL = Math.min(z, c);
		    z -= XL;
		    c -= XL;
		    
		    int L = Math.min(y, b);
		    y -= L;
		    b -= L;
		    
		    int extraL = Math.min(z, b);
		    z -= extraL;
		    b -= extraL;
		    L += extraL;
		    
		    int s = Math.min(x, a);
		    x -= s;
		    a -= s;
		    
		    int extraS = Math.min(y, a);
		    y -= extraS;
		    a -= extraS;
		    s += extraS;
		    
		    int extraS2 = Math.min(z, a);
		    z -= extraS2;
		    a -= extraS2;
		    s += extraS2;
		    
		    int total = XL + L + s;
		    
		    System.out.println(total);
		}
	}
}
