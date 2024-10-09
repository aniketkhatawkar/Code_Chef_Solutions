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
		    String str = input.next();
		    
		    System.out.println(findMinimumOperations(str));
		}
	}
	
	public static int findMinimumOperations(String S1) {
        int countA= 0;
        int countB = 0;
        
        char prevChar = S1.charAt(0);
        if (prevChar == '0') {
            countA++;
        } else {
            countB++;
        }
        
        for (int i = 1; i < S1.length(); i++) {
            char currentChar = S1.charAt(i);
            if (currentChar != prevChar) {
                if (currentChar == '0') {
                    countA++;
                } else {
                    countB++;
                }
                prevChar = currentChar;
            }
        }
        
        return Math.min(countA, countB);

	}
}
