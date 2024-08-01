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
		    
	    int a = input.nextInt();
	    int b = input.nextInt();
	    int c = input.nextInt();
	    
	    int x = input.nextInt();
	    
	    int cuboid=a*b*c;
	    int Cube=x*x*x;
	    
	    if(Cube>cuboid) {
	        System.out.println("Cube");
	    }
	    else if(Cube<cuboid){
	        System.out.println("Cuboid");
	    }
	    else {
	        System.out.println("Equal");
	    }
	}
}
