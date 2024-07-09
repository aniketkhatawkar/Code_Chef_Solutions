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
		   
		    String s=input.next();
		    int n=s.length();
		    boolean flag=true;
		    
		    for(int i=0; i<n; i+=2){
		        if(s.charAt(i)==s.charAt(i+1)){
		            flag=false;
		            break;
		        }
		    }
		    
		    if(flag) {
		        System.out.println("yes");
		    }
		    else {
		        System.out.println("no");
		    }
		}
	}
}
