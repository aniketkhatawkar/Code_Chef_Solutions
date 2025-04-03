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
		    
	    int n = input.nextInt();
	    int q = input.nextInt();
	    
	    int arr[] = new int[n];
	    
	    for(int i=0; i<n; i++){
	        arr[i]=input.nextInt();
	    }
	    
	    Arrays.sort(arr);
	    
	    int mini=arr[0];
	    int maxi=arr[n-1];
	    
	    for(int i=0; i<q; i++){
	        int que = input.nextInt();
	        
	        if(que>=mini && que<=maxi){
	            System.out.println("Yes");
	        }
	        else {
	            System.out.println("No");
	        }
	    }
	}
}
