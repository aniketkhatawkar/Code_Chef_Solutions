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
		    
		    if(n<4) {
		        System.out.println(0);
		    }
		    else {
		        int x = (n/2)-1;
		        int count=0;
		        
		        while(x>0) {
		            count+=x;
		            x--;
		        }
		        
		        System.out.println(count);
		    }
		}
	}
}