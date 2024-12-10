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
		    
		    int ypair=y/3;
		    int xpair=x/2;
		    int rem=(x-ypair)/2;
		    
		    if(xpair>=n || (ypair>=n && x>=n)) {
		        System.out.println("YES");
		    }
		    else if((ypair+rem)>=n && x>n) {
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
