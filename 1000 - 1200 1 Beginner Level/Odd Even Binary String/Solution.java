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
		    
		    int ones=0, zeros=0;
		    
		    for(int i=0; i<n; i++){
		        int temp=input.nextInt();
		        
		        if(temp==1){
		            ones++;
		        }
		        else {
		            zeros++;
		        }
		    }
		    
		    if(zeros%2==0){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
