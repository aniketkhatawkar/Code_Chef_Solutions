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
		    
		    int arr[] =new int[n];
		    
		    for(int i=0; i<n; i++){
		        arr[i]=input.nextInt();
		    }
		    
		    int count=0;
		    
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    break;
                }   
            }
            
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    count = count + 1;
                }
	        }
	        
	        System.out.println((count==0)?"YES":"NO");
		}
	}
}
