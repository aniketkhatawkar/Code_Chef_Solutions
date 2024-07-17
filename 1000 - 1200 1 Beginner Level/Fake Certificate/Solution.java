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
		    String s = input.next();
		    
		    int count1=0, count0=0, maxcount=0;
		    
		    boolean flag=false;
		    
		    for(int i=0; i<n; i++){
		        if(s.charAt(i)=='1'){
		            count1++;
		            flag=false;
		        }
		        else if(flag && s.charAt(i)=='0'){
		            flag=true;
		            count0++;
		        }
		        else {
		            count0=1;
		            flag=true;
		        }
		        maxcount=Math.max(maxcount, count0);
		    }
		    
            System.out.println(count1+maxcount);
            
		}
	}
}
