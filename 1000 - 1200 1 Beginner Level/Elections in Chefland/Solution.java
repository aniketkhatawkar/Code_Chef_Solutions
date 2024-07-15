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
		    
		    int a = input.nextInt();
		    int b = input.nextInt();
		    int c = input.nextInt();
		    
		    if(a>=51) {
		        System.out.println("A");
		    }
		    else if(b>=51){
		        System.out.println("B");
		    }
		    else if(c>=51){
		        System.out.println("C");
		    }
		    else {
		        System.out.println("NOTA");
		    }
		}
	}
}
