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
		    
		    String ans=input.next();
		    String select=input.next();
		    
		    int score=0;
		    
		    for(int i=0; i<n; i++){
		        if(ans.charAt(i)==select.charAt(i)){
		            score++;
		        }
		        else if(select.charAt(i)!='N'){
		            i+=1;
		        }
		    }
		    
		    System.out.println(score);
		}
	}
}
