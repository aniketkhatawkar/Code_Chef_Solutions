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
		    int op = input.nextInt();
		    
		    String str = input.next();
		    
		    StringBuffer sb = new StringBuffer(str);
		    int ans=0;
		    
		    for(int i=n-1; i>0 && op>0; i--){
		        if(sb.charAt(i)=='1' && sb.charAt(i-1)=='0'){
		            sb.setCharAt(i-1, '1');
		            op--;
		        }
		    }
		    
		    for(int i=0; i<n; i++){
		        if(sb.charAt(i)=='1'){
		            ans++;
		        }
		    }
		    
		    System.out.println(ans);
		}
	}
}
