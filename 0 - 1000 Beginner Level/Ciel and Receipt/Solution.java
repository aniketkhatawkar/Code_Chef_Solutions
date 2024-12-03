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
		
		int t = input.nextInt();
		
		int arr[]={1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
		
		for(int i=0; i<t; i++) {
		    
		    int p = input.nextInt();
		    int ans=0;
		    int index=11;
		    
		    while(p>0){
		        if(arr[index]<=p){
		            p-=arr[index];
		            ans++;
		        }
		        
		        if(p<arr[index]){
		            index--;
		        }
		    }
		    
		    System.out.println(ans);
		}
	}
}
