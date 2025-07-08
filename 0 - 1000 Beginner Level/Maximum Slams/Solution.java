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
		
		int needed=25-x;
		
		if(needed>0){
		    System.out.println((needed+3)/4);
		}
		else {
		    System.out.println(0);
		}
	}
}
