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
		    
		    if(x>=y) {
		        System.out.println("PIZZA");
		    }
		    else if(x>=z){
		        System.out.println("BURGER");
		    }
		    else {
		        System.out.println("NOTHING");
		    }
		}
	}
}
