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
		    int m = input.nextInt();
		    
		    if(n%2!=0 && m%2!=0){
		        System.out.println(n+m-1);
		    }
		    else if(n%2!=0 || m%2!=0){
		        System.out.println((n%2==0)?n:m);
		    }
		    else{
		        System.out.println(0);
		    }
		}
	}
}
