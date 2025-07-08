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
		    
		    int[] A = new int[n];
            HashMap<Integer, Integer> countMap = new HashMap<>();
            HashSet<Integer> selfVoters = new HashSet<>();

            for(int i = 0; i < n; i++) {
                A[i] = input.nextInt();
                if (A[i] == i + 1) {
                    selfVoters.add(A[i]); 
                } else {
                    countMap.put(A[i], countMap.getOrDefault(A[i], 0) + 1);
                }
            }

            int count = 0;
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                int candidate = entry.getKey();
                int votes = entry.getValue();
                if (votes >= k && !selfVoters.contains(candidate)) {
                    count++;
                }
            }

            System.out.println(count);
		}
	}
}
