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
		    int ans=Integer.MAX_VALUE;
		    
		    for(int i=0; i<n; i++){
		        int rating=input.nextInt();
		        int cost=input.nextInt();
		        
		        if(rating>6){
		            ans=Math.min(ans, cost);
		        }
		    }
		    
	        System.out.println(ans!=Integer.MAX_VALUE?ans:-1);
		}
	}
}
