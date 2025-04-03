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
		    
		    int n = input.nextInt(), m = input.nextInt(), k = input.nextInt(),flag=0;
		    
            if (n < m) {
                if ((n + k) >= m) {
                    flag = 1;
                }
            }
            else if (m < n) {
                if ((m + k) >= n) {
                    flag = 1;
                }
            }
            
            if (flag == 1) {
                System.out.println(0);
            }

            else if (n == m) {
                System.out.println(0);
            }
            else {
                if (n < m) {
                    System.out.println(Math.abs((n + k) - m));
                }
                else if (m < n) {
                    System.out.println(Math.abs((m + k) - n));
                }
            }
		}
	}
}
