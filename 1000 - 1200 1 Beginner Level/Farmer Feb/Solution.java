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
		    
		    int x = input.nextInt();
		    int y = input.nextInt();
		    
		    int sum=x+y;
		    int ans=1;
		    
		    while(true){
		        if(isPrime(sum+ans)){
		            break;
		        }
		        
		        ans++;
		    }
		    
		    System.out.println(ans);
		}
	}
	
	public static boolean isPrime(int num){
	    for(int i=2; i*i<=num; i++){
	        if(num%i==0){
	            return false;
	        }
	    }
	    
	    return true;
	}
}
