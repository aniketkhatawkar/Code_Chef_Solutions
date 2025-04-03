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
		    
		    int m = input.nextInt();
		    int p = input.nextInt();
		    
		    int ans=0;
		    
		    while(m<299 && m+p+ 20*ans<1000){
		        ans++;
		        m++;
		    }
		    
		    if(m+p+ 20*ans<=1000)
		    System.out.println(ans);
		    else
		    System.out.println(ans-1);
		}
	}
}
