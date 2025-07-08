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
		    
		    boolean flag=false;
		    
		    for(int i=1; i<n; i++){
		        if(arr[i]!=arr[i-1]){
		            flag=true;
		            break;
		        }
		    }
		    
		    if(flag){
		        System.out.println(2);
		    }
		    else {
		        System.out.println(-1);
		    }
		}
	}
}
