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
		    
		    long n = input.nextLong();
		    long k = input.nextLong();
		    
		    long sum=0;
		    
		    for(long i=0; i<n; i++){
		        long temp=input.nextLong();
		        sum+=temp;
		    }
		    
		    for(long i=0; i<k-1; i++){
		        sum+=sum+1;
		    }
		    
		    if(sum%2==0){
		        System.out.println("odd");
		    }
		    else{
		        System.out.println("even");
		    }
		}
	}
}
