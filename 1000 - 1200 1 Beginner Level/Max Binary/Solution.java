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
		    String str = input.next();
		    
		    StringBuffer sb = new StringBuffer(str);
		    int use=0;
		    
		    if(str.charAt(0)=='0'){
		        sb.replace(0,1,"1");
		        use++;
		    }
		    
		    for(int i=use; i<k; i++){
		        sb.append('0');
		    }
		    
		    System.out.println(sb);
		}
	}
}
