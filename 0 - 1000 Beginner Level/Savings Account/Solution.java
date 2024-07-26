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
		    
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int z = input.nextInt();
		    
		    int total_Income=x*y;
		    
		    if(total_Income<=z){
		        System.out.println(0);
		    }
		    else {
		        int extra_Income=total_Income-z;
		        int reduce_Resources=(int) Math.ceil((double)extra_Income/y);
		        
		        System.out.println(reduce_Resources);
		    }
		}
	}
}
