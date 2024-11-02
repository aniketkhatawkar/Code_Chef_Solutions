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
		    
		    int n = input.nextInt();
			int x = input.nextInt();
			int s = input.nextInt();
			
			for (int i = 0 ; i < s ; i++) {
				int a = input.nextInt();
				int b = input.nextInt();
				
				if (x == a) {
					x = b ;
				}
				else if (x == b) {
					x = a ;
				}
			}
			System.out.println(x);
		}
	}
}
