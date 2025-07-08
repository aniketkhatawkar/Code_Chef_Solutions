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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = input.nextInt();

            boolean[] dp = new boolean[3];

            for (int num : arr) {
                boolean[] newDp = dp.clone();
                newDp[num % 3] = true;

                for (int r = 0; r < 3; r++) {
                    if (dp[r]) {
                        newDp[(r + num) % 3] = true;
                    }
                }

                dp = newDp;
            }

            if (dp[0]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}
}
