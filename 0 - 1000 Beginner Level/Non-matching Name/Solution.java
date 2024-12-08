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
		    
		    boolean arr[] = new boolean[26];
		    
		    int n = input.nextInt();
		    int m = input.nextInt();
		    
		    String sa = input.next();
		    String sb = input.next();
		    
		    for(int i=0; i<n; i++){
		        arr[sa.charAt(i) - 'a']=true;
		    }
		    
		    for(int i=0; i<m; i++){
		        arr[sb.charAt(i) - 'a']=true;
		    }
		    
		    int count=0;
		    
		    for(int i=0; i<26; i++){
		        if(arr[i]){
		            count++;
		        }
		    }
		    
		    if(count<26){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
