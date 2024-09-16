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
		    int a = input.nextInt();
		    int b = input.nextInt();
		    
		    int []arr=new int[n];
		    
		    float c=0;
		    float d=0;
		    
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        
		        if(arr[i]==a)
		            c++;
		        if(arr[i]==b)
		            d++;
		    }
		    
		    float p = (c/n)*(d/n);
		    System.out.println(p);
		}
	}
}
