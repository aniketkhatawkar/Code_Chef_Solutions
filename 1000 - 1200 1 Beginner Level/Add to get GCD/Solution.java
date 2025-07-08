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

            if (gcd(x, y) > 1) {
                System.out.println(0);
            } else if (gcd(x + 1, y) > 1 || gcd(x, y + 1) > 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
		}
	}
	
	public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
