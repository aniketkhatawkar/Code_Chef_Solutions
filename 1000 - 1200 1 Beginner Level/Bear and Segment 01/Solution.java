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
		    
		    String str = input.next();
		    int n=str.length();
		    
		    int ans=0;
		    
		    for(int i=0; i<n; ){
		        boolean flag=false;
		        while(i<n && str.charAt(i++)=='1'){
		            flag=true;
		        }
		        if(flag){
		            ans++;
		        }
		    }
		    
		    if(ans==1){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
