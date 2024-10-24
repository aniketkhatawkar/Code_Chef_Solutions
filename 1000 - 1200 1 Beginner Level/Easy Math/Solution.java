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
		    
		    int arr[] = new int[n];
		    
		    for(int i=0; i<n; i++){
		        arr[i]= input.nextInt();
		    }
		    
		    int ans=0;
		    int maxsum=0;
		    
		    for(int i=0; i<n; i++){
		        for(int j=i+1; j<n; j++){
		            if(maxsum<=arr[i]*arr[j]){
		                ans=Math.max(ans, getdigit(arr[i]*arr[j]));
		            }
		        }
		    }
		    
		    System.out.println(ans);
		}
	}
	
	public static int getdigit(int num){
	    int sum=0;
	    
	    while(num>0){
	        sum+=num%10;
	        num/=10;
	    }
	    
	    return sum;
	}
}
