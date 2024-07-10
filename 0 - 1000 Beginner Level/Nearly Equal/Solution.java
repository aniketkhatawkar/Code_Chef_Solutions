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
		    int m = input.nextInt();
		    
		    String a=input.next();
		    String b=input.next();
		    
		    int j=0;
		    int count=0;
		    int ans=Integer.MAX_VALUE;
		    
		    while(j+m<=n){
		        String str=a.substring(j, j + m);
		        
		        for(int i=0; i<m; i++){
		            if(str.charAt(i)!=b.charAt(i)){
		                count++;
		            }
		        }
		        ans=Math.min(count,ans);
		        j++;
		        count=0;
		    }
		    System.out.println(ans);
		}
	}
}
