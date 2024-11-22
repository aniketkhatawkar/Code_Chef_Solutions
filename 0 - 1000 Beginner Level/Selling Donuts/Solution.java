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
		    int m = input.nextInt();
		    
		    int a[] = new int[n];
		    
		    for(int i=0; i<n; i++){
		        a[i]=input.nextInt();
		    }
		    
		    int count=0;
		    
		    for(int i=0; i<m; i++){
		        int temp=input.nextInt();
		        
		        if(a[temp-1]>0){
		            a[temp-1]--;
		        }
		        else{
		            count++;
		        }
		    }
		    
		    System.out.println(count);
		}
	}
}
