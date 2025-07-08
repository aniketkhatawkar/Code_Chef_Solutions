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
		    
		    int N = input.nextInt();
			int M = input.nextInt();
			int K = input.nextInt();
			int total = N * M;
			int maxAlice = 0;
			if (K == 0) {
				maxAlice = total;
			} else if (K >= total) {
				maxAlice = 0;
			} else {
				for (int i = 1; i < N; i++) {
					int part1 = i * M;
					int part2 = (N - i) * M;
					if (part1 >= K) maxAlice = Math.max(maxAlice, part2);
					if (part2 >= K) maxAlice = Math.max(maxAlice, part1);
				}
				for (int j = 1; j < M; j++) {
					int part1 = j * N;
					int part2 = (M - j) * N;
					if (part1 >= K) maxAlice = Math.max(maxAlice, part2);
					if (part2 >= K) maxAlice = Math.max(maxAlice, part1);
				}
			}
			System.out.println(maxAlice);
		}
	}
}
