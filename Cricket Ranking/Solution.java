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
          //Declear Scanner object
		Scanner input = new Scanner(System.in);
		
          // take test cases
		int test = input.nextInt();
		

		for(int t=0; t<test; t++) {
		    
		    int r1 = input.nextInt();
		    int w1 = input.nextInt();
		    int c1 = input.nextInt();
		    
		    int r2 = input.nextInt();
		    int w2 = input.nextInt();
		    int c2 = input.nextInt();
		    
		    int a_Is_Best=0, b_Is_Best=0;
		    
              //check for runs
		    if(r1>r2) {
		        a_Is_Best++;
		    }
		    else {
		        b_Is_Best++;
		    }
		    
              //check for wicket
		    if(w1>w2) {
		        a_Is_Best++;
		    }
		    else {
		        b_Is_Best++;
		    }
		    
              //check for catch
		    if(c1>c2) {
		        a_Is_Best++;
		    }
		    else {
		        b_Is_Best++;
		    }
		    
              //check which player is best
		    if(a_Is_Best>b_Is_Best) {
		        System.out.println("A");
		    }
		    else {
		        System.out.println("B");
		    }
		}
	}
}
