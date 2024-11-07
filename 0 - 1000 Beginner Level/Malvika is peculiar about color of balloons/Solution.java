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
		    
		    String str=input.next();
		    
		    int n=str.length();
		    
		    int a=0, b=0;
		    
		    for(int i=0; i<n; i++){
		        if(str.charAt(i)=='a'){
		            a++;
		        }
		        else {
		            b++;
		        }
		    }
		    
		    System.out.println(Math.min(a,b));
		}
	}
}
