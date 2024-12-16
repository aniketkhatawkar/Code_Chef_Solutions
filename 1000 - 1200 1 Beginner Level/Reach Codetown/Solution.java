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
		    String vowel="AEIOU";
		    
		    int n=8;
		    
		    boolean flag=true;
		    
		    for(int i=0; i<n; i++){
		        if(i!=1 && i!=3 && i!=5) {
		            if(vowel.contains(String.valueOf(str.charAt(i)))){
		                flag=false;
		            }
		        }
		        else if(!vowel.contains(String.valueOf(str.charAt(i)))){
		            flag=false;
		        }
		    }
		    
		    if(flag){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
