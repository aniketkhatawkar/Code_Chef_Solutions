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
		        arr[i] = input.nextInt();
		    }
		    
		    int ans[] = new int[n];
		    
		    for(int i=0; i<n-1; i++){
		        int count=0;
		        for(int j=i+1; j<n; j++){
		            if(arr[i]!=arr[j]){
		                break;
		            }
		            else {
		                count++;
		            }
		        }
		        ans[i]=(n-i-count-1);
		    }
		    
		    for(int i=0; i<n; i++){
		        System.out.print(ans[i] +" ");
		    }
		    
		    System.out.println("");
		}
	}
}
