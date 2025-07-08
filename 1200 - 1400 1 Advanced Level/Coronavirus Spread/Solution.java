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
		    int mini=Integer.MAX_VALUE;
		    int maxi=0;
		    
		    int arr[] = new int[n];
		    
		    for(int i=0; i<n; i++){
		        arr[i]=input.nextInt();
		    }
		    
		    int count=1;
		    
		    for(int i=1; i<n; i++){
		        if(Math.abs(arr[i]-arr[i-1])<3){
		            count+=1;
		        }
		        else{
		            mini=Math.min(mini, count);
		            maxi=Math.max(maxi, count);
		            count=1;
		        }
		        
		        if(i==n-1){
    		        mini=Math.min(mini, count);
    		        maxi=Math.max(maxi, count);
		        }
		    }
		    
		    System.out.println(mini +" "+ maxi);
		}
	}
}
