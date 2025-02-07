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
		    
		    int ones = input.nextInt();
		    int twos = input.nextInt();
		    
		    StringBuffer sb = new StringBuffer();
		    
		    for(int i=0; i<ones/2; i++){
		        sb.append(1);
		    }
		    
		    for(int i=0; i<twos; i++){
		        sb.append(2);
		    }
		    
		    for(int i=0; i<ones/2; i++){
		        sb.append(1);
		    }
		    
		    System.out.println(sb);
		}
	}
}
