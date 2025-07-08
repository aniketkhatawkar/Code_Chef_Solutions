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
		
		int r = input.nextInt();
		int b = input.nextInt();
		int p = input.nextInt();
		int q = input.nextInt();
		
		System.out.println(r*p>=b*q?r*p:q*b);
		
	}
}
