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
		    
		    int count=0;
		    char c='T';
		    
		    for(int i=0; i<n; i++){
    		    if(str.charAt(i)=='R') {
                    if(c=='P') {
                        c='T';
                    }
                    else {
                        count++;
                        c='P';
                    }
                }
                else if(str.charAt(i)=='S') {
                    if(c=='R') {
                        c='T';
                    }
                    else {
                        count++;
                        c='R';
                    }
                }
                else if(str.charAt(i)=='P') {
                    if(c=='S'){
                        c='T';
                    }
                    else {
                        count++;
                        c='S';
                    }
                }
    		}
		    
		    System.out.println(count);
		}
	}
}
