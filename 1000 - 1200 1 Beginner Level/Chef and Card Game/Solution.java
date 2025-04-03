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
		    
		    int Chef=0;
		    int Morty=0;
		    
		    for(int i=0; i<n; i++){
		        int a=input.nextInt();
		        int b=input.nextInt();
		        
		        if(helper(a)>helper(b)){
		            Chef++;
		        }
		        else if(helper(a)<helper(b)){
		            Morty++;
		        }
		        else {
		            Chef++;
		            Morty++;
		        }
		    }
		    
		    if(Chef>Morty){
		        System.out.println("0 " +Chef);
		    }
		    else if(Chef<Morty){
		        System.out.println("1 " +Morty);
		    }
		    else {
		        System.out.println("2 " +Morty);
		    }
		}
	}
	
	public static int helper(int num) {
	    int sum=0;
	    
	    while(num>0){
	        sum+=num%10;
	        num/=10;
	    }
	    
	    return sum;
	}
}
