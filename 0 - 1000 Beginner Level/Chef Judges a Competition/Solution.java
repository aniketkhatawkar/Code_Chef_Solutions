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
		    int temp;
		    
		    int asum=0, bsum=0;
		    int amax=0, bmax=0;
		    
              //Calculate the total time taken by alice
		    for(int i=0; i<n; i++){
		        temp=input.nextInt();
		        asum+=temp;

                  //check the max to so we can consider it zero for Alice
		        if(temp>amax){
		            amax=temp;
		        }
		    }
		    
              //Calculate the total time taken by Bob
		    for(int i=0; i<n; i++){
		        temp=input.nextInt();
		        bsum+=temp;

                  //check the max to so we can consider it zero for Bob
		        if(temp>bmax){
		            bmax=temp;
		        }
		    }
		    
              // Remove max time
		    asum-=amax;
		    bsum-=bmax;
		    

              //print basice on less time take
		    if(asum<bsum) {
		        System.out.println("Alice");
		    }
		    else if(asum>bsum){
		        System.out.println("Bob");
		    }
		    else {
		        System.out.println("Draw");
		    }
		}
	}
}
