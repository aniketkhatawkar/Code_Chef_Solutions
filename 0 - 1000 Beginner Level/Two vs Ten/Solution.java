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
		
		int t = input.nextInt();
		
		for(int i=0; i<t; i++) {
		    
		    int n = input.nextInt();
		    
		    if(n%10==0){
		        System.out.println(0);
		    }
		    else if(n%5==0) {
		        System.out.println(1);
		    }
		    else {
		        System.out.println(-1);
		    }
		}
	}
}