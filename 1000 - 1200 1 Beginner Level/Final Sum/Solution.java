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
		    int q = input.nextInt();
		    
		    int ans=0;
		    
		    int arr[]=new int[n];
		    
		    for(int i=0; i<n; i++){
		        arr[i]=input.nextInt();
		        ans+=arr[i];
		    }
		    
		    int count=0;
		    
		    for(int i=0; i<q; i++){
		        int l=input.nextInt();
		        int r=input.nextInt();
		        
		        count=r-l+1;
		        
	            if(count%2==1){
	                ans++;
	            }
		    }
		    
		    System.out.println(ans);
		}
	}
}
