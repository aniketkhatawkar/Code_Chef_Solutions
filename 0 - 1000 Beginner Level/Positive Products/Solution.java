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
		    
		    long p=0,ne=0;
		    int n=input.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int j=0;j<n;j++){
		        arr[j]=input.nextInt();
		        if(arr[j]>0){
		            p++;
		        }
		        else if(arr[j]<0){
		            ne++;
		        }
		    }
		    
		    long sum=((p-1)*p)/2+((ne-1)*ne)/2;
		    System.out.println(sum);
		}
	}
}
