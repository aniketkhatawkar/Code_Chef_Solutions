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
		    
		    int N = input.nextInt() ;
		    int[] X = new int[N] ;
		    int[] Y = new int[N] ;
		    for (int i = 0; i <N ; i++) {
		        X[i] = input.nextInt();
		    }
		    for (int i = 0; i <N ; i++) {
		        Y[i] = input.nextInt();
		    }
		    
		    boolean inValid = false ;
		    int p = Y[0] ;
		    
		    int pIdx = -1; 
		    for (int i = 0 ; i < N-1 ; i++) {
		        if (X[i] == p) pIdx = i ;
		        int sm = Math.abs(Y[i]-p) ;
		        int lg = Math.abs(Y[i+1]-p) ;
	            if (sm > lg || ((sm == lg) && Y[i] > Y[i+1])) {
	                inValid = true ;
	                break ;
	            }
	        }
	        if(inValid) {
	            System.out.println(-1);
	        }else {
	            if (pIdx == -1 && X[N-1] == p) {
	                System.out.println(N);
	            }else {
	                System.out.println(pIdx+1);
	            }
	        }
		}
	}
}
