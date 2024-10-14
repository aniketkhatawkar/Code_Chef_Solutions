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
		Scanner in = new Scanner(System.in);
		
		int test = in.nextInt();
		
		for(int t=0; t<test; t++) {
		    
		    int n=in.nextInt();
		    String s=in.next();
		    int x=0;
		    int y=0;
		    for(int i=0;i<n;i++){
		        char ch=s.charAt(i);
		        if(i!=0){
		            char ch1=s.charAt(i-1);
		            if( (ch=='R' && ch1=='L') || (ch=='L' && ch1=='R')||
		            (ch=='U' && ch1=='D') || (ch=='D' && ch1=='U') ||
		            (ch==ch1))
		                continue;}
		        switch(ch){
		            case 'L':
		                x--;
		                break;
		            case 'R':
		                x++;
		                break;
		            case 'U':
		                y++;
		                break;
		            case 'D':
		                y--;
		                break;
		        }
		    }
		    System.out.println(x+" "+y);
		}
	}
}
