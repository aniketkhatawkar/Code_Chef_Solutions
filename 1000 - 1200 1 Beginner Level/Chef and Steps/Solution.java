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
		    int k = input.nextInt();
		    
		    String str="";
		    
		    for(int i=0; i<n; i++){
		        int temp=input.nextInt();
		        
		        if(temp%k==0){
                    str+="1";
		        }
		        else{
		            str+="0";
		        }
		    }
		    
		    System.out.println(str);
		}
	}
}
