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
		    
               //Take the position of both roaks
		    int x1 = input.nextInt();
		    int y1 = input.nextInt();
		    int x2 = input.nextInt();
		    int y2 = input.nextInt();
		    
              // check if they are in same row or colomn 
              // if yes then they attack else not
		    if(x1==x2 || y1==y2) {
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
