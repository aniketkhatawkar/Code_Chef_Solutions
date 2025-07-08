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
		    int k = input.nextInt();
            int[] res = new int[n + 1];
            boolean ok = true;

            for (int i = 0; i < k; i++) {
                int[] idx = new int[n + 1];
                int cnt = 0;

                for (int j = 1; j <= n; j++) {
                    if (j % k == i) {
                        idx[cnt++] = j;
                    }
                }

                if (cnt == 1) {
                    ok = false;
                    break;
                }

                for (int j = 0; j < cnt; j++) {
                    res[idx[j]] = idx[(j + 1) % cnt];
                }
            }

            if (!ok) {
                System.out.println(-1);
            } else {
                for (int i = 1; i <= n; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println();
            }
		}
	}
}
