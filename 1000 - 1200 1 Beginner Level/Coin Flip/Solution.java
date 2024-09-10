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
		    
		    int g = input.nextInt();
            
            while (g-- > 0) {
                int i = input.nextInt();
                int n = input.nextInt();
                int q = input.nextInt();
                
                if (n % 2 == 0) {
                    System.out.println(n / 2);
                } else {
                    if (q == 1) {
                        System.out.println(i == 1 ? n / 2 : n / 2 + 1);
                    } else {
                        System.out.println(i == 1 ? n / 2 + 1 : n / 2);
                    }
                }
            }
        }
	}
}
