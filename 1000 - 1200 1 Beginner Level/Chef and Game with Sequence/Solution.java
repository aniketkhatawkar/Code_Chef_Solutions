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
		    int odd=0;
		    
		    for(int i=0; i<n; i++){
		        
		        int ele = input.nextInt();
		        
    		    if(ele%2!=0) {
    		        odd++;
    		    }
		    }
		    
		    if(odd%2!=0 && n>1) {
		        System.out.println(2);
		    }
		    else {
		        System.out.println(1);
		    }
		}
	}
}
