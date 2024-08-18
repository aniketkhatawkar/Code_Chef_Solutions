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
		    
		    int len = input.nextInt();
		    String str=input.next();
		    int y=0;
		    int n=0;
		    int l=0;
		    
		    for(int i=0; i<len; i++){
		        if(str.charAt(i)=='N'){
		            n++;
		        }
		        else if(str.charAt(i)=='Y'){
		            y++;
		        }
		        else if(str.charAt(i)=='I'){
		            l++;
		        }
		    }
		    
		    if(l>0){
		        System.out.println("INDIAN");
		    }
		    else if(l==0 && y==0){
		        System.out.println("NOT SURE");
		    }
		    else {
		        System.out.println("NOT INDIAN");
		    }
		}
	}
}
