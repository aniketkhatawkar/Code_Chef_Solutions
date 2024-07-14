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
		    int p = input.nextInt();
		    
		    int ans=0;
		    
		    
		    for(int i=0; i<n; i++){
		        int a = input.nextInt();
		        int b = input.nextInt();
		        int c = input.nextInt();
		        
		        if(c<=p){
		            if(a*b>ans){
		                ans=a*b;
		            }
		        }
		    }
		    
		    if(ans!=0){
		        System.out.println(ans);
		    }
		    else {
		        System.out.println("no tablet");
		    }
		}
	}
}
