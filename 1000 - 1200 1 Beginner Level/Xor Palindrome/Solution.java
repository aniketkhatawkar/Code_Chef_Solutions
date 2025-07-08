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
		    
		    int n=input.nextInt();
		    String s=input.next();
		    int one=0,zero=0;
		    
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='1'){
		            one++;
		        }
		        else{zero++;}
		    }
		    
		    int flag=0;
		 
		    for(int j=0;j<n/2;j++){
		        if(s.charAt(j)!=s.charAt(n-j-1)) {  
		            flag++;
		        }
		    }
		    
		    System.out.println((flag+1)/2);
		}
	}
}
