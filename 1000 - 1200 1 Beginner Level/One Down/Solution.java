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
		    
		    String S=input.next();
		    String T=input.next();
		    
		    boolean possible = true;
            for (int i = 0; i < n; i++) {
                if (T.charAt(i) == '1' && S.charAt(i) == '0') {
                    possible = false;
                    break;
                }
            }
            
            if (!possible) {
                System.out.println("No");
                continue;
            }
            
            int onesS = 0, onesT = 0;
            for (int i = 0; i < n; i++) {
                if (S.charAt(i) == '1') onesS++;
                if (T.charAt(i) == '1') onesT++;
            }
            
            if (onesS < onesT || ((onesS - onesT) % 2 != 0)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
		}
	}
}
