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
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            
            Arrays.sort(a);
            int ans=a[0]%a[1];
            
            for (int i = 2; i < n; i++) {
                int b = a[i];
                ans %= b;
            }
            
            System.out.println(ans);
		}
	}
}
