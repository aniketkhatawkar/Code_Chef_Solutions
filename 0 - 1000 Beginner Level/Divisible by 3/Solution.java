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
		    
		    int a = input.nextInt();
		    int b = input.nextInt();
		    
		    int count=0;
		    
		    while(a%3!=0 && b%3!=0){
		        int temp=a;
		        a=Math.abs(a-b);
		        b=Math.abs(temp-b);
		        count++;
		    }
		    
		    System.out.println(count);
		}
	}
}
