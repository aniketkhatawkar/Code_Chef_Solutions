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
		    
		    String str = input.next();
		    
		    int sum=0;
		    int n=str.length();
		
    		for(int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                
                if (ch < 'a' || ch > 'z') {
                    sum += Character.getNumericValue(ch);
                }
            }
            
            System.out.println(sum);
		}
	}
}