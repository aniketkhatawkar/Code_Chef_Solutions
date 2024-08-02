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
		    int d = input.nextInt();
		    
		    char gun='s';
		    
		    int switch_Gun=0;
		    
		    for(int i=0; i<n; i++){
		        int target = input.nextInt();
		        
		        if(gun=='s' && target>d){
		            switch_Gun++;
		            gun='l';
		        }
		        else if(gun=='l' && target<=d){
		            switch_Gun++;
		            gun='s';
		        }
		    }
		    
		    System.out.println(switch_Gun);
		}
	}
}
