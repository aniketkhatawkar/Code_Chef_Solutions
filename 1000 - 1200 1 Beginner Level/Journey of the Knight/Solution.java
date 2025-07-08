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
		    
		    int x1=input.nextInt();
		    int y1=input.nextInt();
		    int x2=input.nextInt();
		    int y2=input.nextInt();
		    
		    int x= x1 % 2 == y1 % 2 ? 1 : 0; 
            int y=x2 % 2 == y2 % 2 ? 1 : 0;
            
            System.out.println(x==y ? "YES" : "NO");
		}
	}
}
