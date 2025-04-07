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
		    
		    int arr[] = new int[26];
		    
		    for(int i=0; i<26; i++){
		        arr[i]=input.nextInt();
		    }
		    
		    String str=input.next();
		    int n=str.length();
		    
		    int ch[] = new int[26];
		    
		    for(int i=0; i<n; i++){
		        ch[str.charAt(i)-'a']++;
		    }
		    
		    int ans=0;
		    
		    for(int i=0; i<26; i++){
		        if(ch[i]==0){
		            ans+=arr[i];
		        }
		    }
		    
		    System.out.println(ans);
		}
	}
}
