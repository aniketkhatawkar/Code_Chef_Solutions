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
		    
		    Set<String> set1 = new HashSet<>();
            for (int i = 0; i < 4; i++) {
                set1.add(input.next());
            }

            int count = 0;
            for (int i = 0; i < 4; i++) {
                String str = input.next();
                if (set1.contains(str)) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("similar");
            } else {
                System.out.println("dissimilar");
            }
		}
	}
}
