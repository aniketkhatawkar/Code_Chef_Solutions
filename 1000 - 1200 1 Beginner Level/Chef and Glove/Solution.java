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
            int[] L = new int[N];
            int[] G = new int[N];
            
            for (int i = 0; i < N; i++) {
                L[i] = input.nextInt();
            }
            
            for (int i = 0; i < N; i++) {
                G[i] = input.nextInt();
            }
            
            boolean frontPossible = true;
            boolean backPossible = true;
            
            for (int i = 0; i < N; i++) {
                if (L[i] > G[i]) {
                    frontPossible = false;
                }
                if (L[i] > G[N - 1 - i]) {
                    backPossible = false;
                }
            }
            
            if (frontPossible && backPossible) {
                System.out.println("both");
            } else if (frontPossible) {
                System.out.println("front");
            } else if (backPossible) {
                System.out.println("back");
            } else {
                System.out.println("none");
            }
		}
	}
}
