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
		    String str = input.next();
		    
		    int count1 =0;
		    int count2 =0;
		    
		    if(str.charAt(0)=='1'){
		        count1++;
		    }
		    
		    for(int i=1; i<n; i++){
		        if(str.charAt(i)=='1' && str.charAt(i-1)=='1'){
		            count2++;
		        }
		        if(str.charAt(i)=='1'){
		            count1++;
		        }
		    }
		    
		    if(count2>0){
		        System.out.println(2);
		    }
		    else if(count1>0){
		        System.out.println(1);
		    }
		    else {
		        System.out.println(0);
		    }
		}
	}
}
