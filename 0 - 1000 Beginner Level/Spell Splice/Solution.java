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
		    
		    int v[]= new int[n];
		    int a[]= new int[n];
		    
		    for(int i=0; i<n; i++){
		        v[i]=input.nextInt();
		        a[i]=input.nextInt();
		    }
		    
		    int ans=0;
		    
		    for(int i=0; i<n-1; i++){
		        for(int j=i+1; j<n; j++){
		            int curr=(a[i]*v[j])+(v[i]*a[j]);
		            if(curr>ans){
		                ans=curr;
		            }
		        }
		    }
		    
		    System.out.println(ans);
		}
	}
}
