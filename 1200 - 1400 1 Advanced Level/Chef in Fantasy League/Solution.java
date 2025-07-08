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
		    int s = input.nextInt();
		    
		    int cost[] = new int[n];
		    int player[] = new int[n];
		    
		    for(int i=0; i<n; i++){
		        cost[i]=input.nextInt();
		    }
		    
		    for(int i=0; i<n; i++){
		        player[i]=input.nextInt();
		    }
		    
		    int defmin=101;
		    int forwmin=101;
		    
		    for(int i=0; i<n; i++){
		        if(player[i]==0){
		            defmin=Math.min(defmin, cost[i]);
		        }
		        
		        if(player[i]==1){
		            forwmin=Math.min(forwmin, cost[i]);
		        }
		    }
		    
		    if((s+defmin+forwmin)<=100){
		        System.out.println("yes");
		    }
		    else {
		        System.out.println("no");
		    }
		}
	}
}
