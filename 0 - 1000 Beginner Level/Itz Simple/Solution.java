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
		    int k = input.nextInt();
		    int p = input.nextInt();
		    int sum=0;
		    int tall=Integer.MIN_VALUE;
		    
		    for(int i=0; i<n; i++){
		        int temp = input.nextInt();
		        tall=Math.max(temp, tall);
		        sum+=temp;
		    }
		    
		    if((k+tall)>(p+(sum-tall))){
		        System.out.println("Ved");
		    }
		    else if((k+tall)<p+(sum-tall)){
		        System.out.println("Varun");
		    }
		    else {
		        System.out.println("Equal");
		    }
		}
	}
}
