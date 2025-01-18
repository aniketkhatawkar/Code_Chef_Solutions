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
		    
		    long N = input.nextLong(); 
            long X = input.nextLong(); 
            long Y = input.nextLong();
            
            long horizontalVertical = 2 * (N - 1);
            long diagonal1 = Math.min(X - 1, Y - 1) + Math.min(N - X, N - Y);
            long diagonal2 = Math.min(X - 1, N - Y) + Math.min(N - X, Y - 1);
            long totalAttacked = horizontalVertical + diagonal1 + diagonal2;
            
            System.out.println(totalAttacked);
		}
	}
}
