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
		    int m = input.nextInt();
		    int k = input.nextInt();
		    
		    int ans=Integer.MAX_VALUE;
		    
		    for(int i=1; i<=n; i++){
		        for(int j=1; j<=m; j++){
		            ans=Math.min(ans, Math.abs((2*(i+j))-k));
		        }
		    }
		    
		    System.out.println(ans);
		}
	}
}
