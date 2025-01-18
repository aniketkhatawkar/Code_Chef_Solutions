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
		    int maxi=input.nextInt();
		    
		    System.out.print(1+" ");
		    
		    for(int i=0; i<n-1; i++){
		        int temp=input.nextInt();
		        
		        if(temp>maxi){
		            System.out.print(1+" ");
		        }
		        else {
		            System.out.print(0+" ");
		        }
		        
		        maxi=Math.max(maxi, temp);
		    }
		    
		    System.out.println("");
		}
	}
}
