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
		    
		    int e = input.nextInt();
		    int k = input.nextInt();
		    int ans=0;
		    
		    while(e>0){
		        e=Math.round(e/k);
		        ans++;
		    }
		    
		    System.out.println(ans);
		}
	}
}
