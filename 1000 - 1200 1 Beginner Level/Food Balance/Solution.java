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
		
		int f1 = input.nextInt();
		int p1 = input.nextInt();
		
		int f2 = input.nextInt();
		int p2 = input.nextInt();
		
		int f=Math.abs(f1-p1);
		int s=Math.abs(f2-p2);
		
		if(f<s){
		    System.out.println("First");
		}
		else if(f>s){
		    System.out.println("Second");
		}
		else {
		    System.out.println("Both");
		}
		
	}
}
