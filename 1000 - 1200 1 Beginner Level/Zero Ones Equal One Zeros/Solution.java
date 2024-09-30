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
		    
		    if(n==3) {
		        System.out.println("010");
		    }
		    else {
		        StringBuffer sb = new StringBuffer();
		        sb.append("1");
		        for(int i=2; i<n; i++){
		            sb.append("0");
		        }
		        sb.append("1");
		        System.out.println(sb);
		    }
		}
	}
}
