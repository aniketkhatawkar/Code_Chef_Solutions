/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t = 1;
        t = input.nextInt();
        for(int tests = 0; tests < t; tests++) solve();
        out.close();
    }

    private static void solve() {
        int n = input.nextInt(), m = input.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = input.nextInt();
        long res = 0L;
        for(int i : a) {
            res += Math.max(i - 1, m - i);
        }
        out.println(res);
    }
    
}
