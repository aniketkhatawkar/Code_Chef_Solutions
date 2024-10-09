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
		    
		    String str1=input.next();
		    String str2=input.next();
		    
		    int one1=0, zero1=0;
		    int one2=0, zero2=0;
		    
		    for(int i=0; i<n; i++){
		        if(str1.charAt(i)=='1'){
		            one1++;
		        }
		        else {
		            zero1++;
		        }
		        
		        if(str2.charAt(i)=='1'){
		            one2++;
		        }
		        else {
		            zero2++;
		        }
		    }
		    
		    if(one2==one1 && zero2==zero1) {
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}