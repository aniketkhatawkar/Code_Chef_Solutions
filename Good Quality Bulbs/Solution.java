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
		

		// take no of test cases
		int test = input.nextInt();
		
		for(int t=0; t<test; t++) {
		    
			// take n & x
		    int n = input.nextInt();
		    int x = input.nextInt();
		    
		    int sum=0;
		    
		    for(int i=1; i<n; i++){
		        int m= input.nextInt();
		        if(m<=x){
		            sum+=(x-m);
		        }
		        else {
		            sum-=(m-x);
		        }
		    }
		    
		    if((sum+x)>0) {
		        System.out.println(sum+x);
		    }
		    else {
		        System.out.println(0);
		    }
		}
	}
}
