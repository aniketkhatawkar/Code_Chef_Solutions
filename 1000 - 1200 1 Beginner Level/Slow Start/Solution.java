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
		    
		    int x = input.nextInt();
		    int h = input.nextInt();
		    
		    int d=0, i=1, ans=0;
		    
		    while(d<h){
		        if(i<6){
		            d+=x/2;
		        }
		        else{
		            d+=x;
		        }
		        i++;
		        ans++;
		    }
		    
		    System.out.println(ans);
		}
	}
}
