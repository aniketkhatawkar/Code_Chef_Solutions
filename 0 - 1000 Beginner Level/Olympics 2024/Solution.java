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
		    
	    int g = input.nextInt();
	    int s = input.nextInt();
	    int b = input.nextInt();
	    
	    int rem=0;
	    
	    if(g<5){
	        rem+=5-g;
	    }
	    
	    if(s<5){
	        rem+=5-s;
	    }
	    
	    if(b<5){
	        rem+=5-b;
	    }
	    
	    System.out.println(rem);
	}
}
