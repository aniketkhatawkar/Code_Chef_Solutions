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
		        arr[i]=input.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    
		    if(n<3){
		        System.out.println(0);
		    }
		    else{
		        Arrays.sort(arr);
		        
		        int minRange = Math.min(
                    Math.min(arr[n-1] - arr[2], arr[n-3] - arr[0]),
                    Math.min(arr[n-2] - arr[1], arr[n-1] - arr[0]));
                    
                System.out.println(minRange);
		    }
		}
	}
}
