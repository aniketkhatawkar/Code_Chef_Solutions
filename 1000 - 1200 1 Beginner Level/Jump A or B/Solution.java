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
		    
		    int N = input.nextInt();
		    int M = input.nextInt();
		    int A = input.nextInt();
		    int B = input.nextInt();
		    
		    int diff = M - B * N;
            int stepDifference = A - B;
            
            if (diff % stepDifference == 0) {
                int x = diff / stepDifference;
                
                if (x >= 0 && x <= N) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
		}
	}
}
