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
		    String str1 = input.next();
		    String str2 = input.next();
		    
		    int count1=0, count0=0;
		    
		    for(int i=0; i<n; i++){
		        if(str1.charAt(i)=='1' && str2.charAt(i)=='1'){
		            count1++;
		        }
		        else if(str1.charAt(i)=='1' && str2.charAt(i)=='0' || str1.charAt(i)=='0' && str2.charAt(i)=='1'){
		            count0++;
		        }
		    }
		    
		    if(count1%2==1 || count0>0){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
