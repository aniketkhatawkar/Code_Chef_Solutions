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
		    int ans=0;
		    int sum=0;
		    
		    int arr[] = new int[n];
		    int arrsum[]= new int[n];
		    
		    for(int i=0; i<n; i++){
		        arr[i]= input.nextInt();
		        sum+=arr[i];
		        arrsum[i]=sum;
		    }
		    
		    for(int i=0; i<n; i++){
		        if(arrsum[i]%2==0){
		            ans=Math.max(i+1, ans);
		        }
		        else if((arrsum[i]-arr[i])%2==0){
		            ans=Math.max(ans, n-(i+1));
		        }
		    }
		    
		    System.out.println(ans);
		}
	}
}
