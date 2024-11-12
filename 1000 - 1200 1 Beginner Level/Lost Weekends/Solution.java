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
		    
		    int totalwork=0;
		    
		    for(int i=0; i<5; i++){
		        int hour=input.nextInt();
		        totalwork+=hour;
		    }
		    
		    int p=input.nextInt();
		    
		    totalwork*=p;
		    
		    if(totalwork<=120){
		        System.out.println("No");
		    }
		    else {
		        System.out.println("Yes");
		    }
		}
	}
}
