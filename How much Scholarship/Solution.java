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
		    
	    int n = input.nextInt();
	    
	    if(n<51) {
	        System.out.println(100);
	    }
	    else if(n<101){
	        System.out.println(50);
	    }
	    else {
	        System.out.println(0);
	    }
	}
}
