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
		    
	    int x = input.nextInt();
	    
	    if(x<3){
	        System.out.println(1);
	    }
	    else if(x<7){
	        System.out.println(2);
	    }
	    else if(x>6){
	        System.out.println(3);
	    }
		
	}
}
