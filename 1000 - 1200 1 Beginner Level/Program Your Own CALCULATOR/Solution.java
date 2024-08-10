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
		    
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    char c= input.next().charAt(0);
	    
	    if(c=='+') {
	        System.out.println(a+b);
	    }
	    else if(c=='-'){
	        System.out.println(a-b);
	    }
	    else if(c=='*'){
	        System.out.println(a*b);
	    }
	    else if(c=='/'){
	        System.out.println(a/b);
	    }
	}
}
