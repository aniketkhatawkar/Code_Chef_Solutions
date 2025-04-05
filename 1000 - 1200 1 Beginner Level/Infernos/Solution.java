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
		    int x = input.nextInt();
		    
		    int arr[] = new int[n];
		    
		    int maxi=0;
		    int count=0;
		    
		    for(int i=0; i<n; i++){
		        int temp=input.nextInt();
		        maxi=Math.max(temp, maxi);
		        if(temp%x==0){
		            count+=temp/x;
		        }
		        else {
		            count+=(temp/x)+1;
		        }
		        
		    }
		    
		    if(maxi<=count){
		        System.out.println(maxi);
		    }
		    else {
		        System.out.println(count);
		    }
		}
	}
}
