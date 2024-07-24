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
		    int y = input.nextInt();
		    String str = input.next();
		    
		    int ones=0, zeros=0;
		    
		    for(int i=0; i<n; i++){
		        if(str.charAt(i)=='0'){
		            zeros++;
		        }
		        else {
		            ones++;
		        }
		        
		        
		        // this if part is optinal it reduce run time of program
		        if(ones>0 && zeros>0){
		            break;
		        }
		    }
		    
		    if(ones>0 && zeros>0)
		        System.out.println(Math.min(x,y));
		    else 
		        System.out.println(0);
		}
	}
}
