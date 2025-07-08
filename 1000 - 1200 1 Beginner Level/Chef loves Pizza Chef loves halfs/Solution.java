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
		    
		    long n = input.nextInt();
            long power = 1;
            
            while(power <= n){
                power <<= 1;
            }
            
            power >>= 1;
            
            int ans = 0;
            
            for(long i=power;i<n;i=i+2){
                ans += 4;
            }
            
            System.out.println(ans);
		    
		}
	}
}

