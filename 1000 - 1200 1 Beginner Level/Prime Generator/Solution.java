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
		    int m = input.nextInt();
		    
		    for(int i=n; i<=m; i++){
		        boolean flag = true;
		        
		        for(int j=2; j*j<=i; j++){
		            if(i%j==0){
		                flag=false;
		                break;
		            }
		        }
		        
		        if(flag && i!=1){
		            System.out.println(i);
		        }
		    }
		    
		    System.out.println("");
		}
	}
}
