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
		    
		    int odd=0, even=0;
		    
		    for(int i=1; i<=n; i++){
		        if(n%i==0){
		            if(i%2==0){
		                even++;
		            }
		            else {
		                odd++;
		            }
		        }
		    }
		    
		    if(odd==even) {
		        System.out.println(0);
		    }
		    else if (odd>even){
		        System.out.println(-1);
		    }
		    else {
		        System.out.println(1);
		    }
		}
	}
}
