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
		    String str=input.next();
		    
		    int id = 0;
            for (id = 0; id < n - 1; id++) {
                if (str.charAt(id) > str.charAt(id + 1)) {
                    break;
                }
            }
            
            for (int i = 0; i < n; i++) {
                if (id != i) {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
		}
	}
}
