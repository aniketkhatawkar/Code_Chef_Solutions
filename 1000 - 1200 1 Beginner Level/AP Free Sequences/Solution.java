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
		    
		    int n= input.nextInt();
		    int arr[] = new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=input.nextInt();
		    }
		    if(n<3){
		        System.out.println("Yes");
		        return;
		    }
		    int p=0;
		    for(p=0;p<n-2;p++){
		        for(int q=p+1;q<n-1;q++){
		            for(int r=q+1;r<n;r++){
		                if((arr[q]-arr[p])==(arr[r]-arr[q])){
		                    System.out.println("No");
	                        p=n;
	                        break;
		                }
		            }
		            if(p==n){
		                break;
		            }
		        }
		        if(p==n){
		            break;
		        }
		    }
		    if(p==n-2){
		        System.out.println("Yes");
		    }
		}
	}
}
