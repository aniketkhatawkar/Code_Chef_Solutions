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
		    
		  //  long n = input.nextLong();
		  //  long x = input.nextLong();
		    
		  //  long maxi=0;
		  //  long mini=Integer.MAX_VALUE;
		    
		  //  for(int i=0; i<n; i++){
		  //      long ele=input.nextLong();
		        
		  //      maxi=ele>maxi?ele:maxi;
		  //      mini=ele<mini?ele:mini;
		  //  }
		    
		  //  System.out.println((mini+(x*(n-1)))>maxi?mini+(x*(n-1)):maxi);
		    
		    long maxi=0;
		    long count=0;
		    
		    int len=input.nextInt();
		    int x=input.nextInt();
		    
		    int ar[]=new int[len];
		    
		    for(int i=0;i<len;i++){
		        ar[i]=input.nextInt();
		    }
		   
		    Arrays.sort(ar);
		    
		    for(int j=ar.length-1;j>=0;j--){
		        maxi=Math.max((ar[j]+(long)count*x),maxi);
		        count++;
		    }
		    
		    System.out.println(maxi);
		}
	}
}
