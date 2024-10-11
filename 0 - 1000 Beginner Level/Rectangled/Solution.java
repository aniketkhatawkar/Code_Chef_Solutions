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
		    
		    if(n<4){
    	        System.out.println(0);
    	    }
    	    else if(n==4){
    	        System.out.println(1);
    	    }
    	    else{
        	    if(n%2!=0){
        	        n--;
        	    }
        	    n/=2;
        	    int l=0;
        	    int b=0;
        	    int ma=0;
        	    int ml=(n)/(2);
        	    ml=ml/1;
        	    ma=ml*(n-ml);
        	    System.out.println(ma);
    	    }
		}
	}
}
