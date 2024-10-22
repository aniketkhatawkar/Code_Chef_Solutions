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
		    
		    int total = input.nextInt();
		    int rated = input.nextInt();
		    
		    if(rated<=1){
		        System.out.println("0");
		    }
		    else{
		        int y = total*2-rated;
		        
		        if((rated-y)>0){
		            System.out.println(rated-y);
		        }
		        else{
		            System.out.println("0");
		        }
		    }
		}
	}
}
