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
		    
		    double n = input.nextDouble();
		    double n1 = input.nextDouble();
		    double n2 = input.nextDouble();
		    
		    double v1=(n*1.41421356237)*n1;
		    double v2=n*n2;
		    
		    if(v1>v2) {
		        System.out.println("Stairs");
		    }
		    else {
		        System.out.println("Elevator");
		    }
		}
	}
}
