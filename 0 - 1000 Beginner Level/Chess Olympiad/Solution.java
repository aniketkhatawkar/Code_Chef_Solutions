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
	    int y = input.nextInt();
	    int z = input.nextInt();
	    
	    double a=x*1+y*0.5+z*0;
    	int r=4-(x+y+z);
    	
    	if(a+r>y*0.5+z*1){
    	    System.out.println("Yes");
    	}
    	else{
    	    System.out.println("No");
    	}
	}
}
