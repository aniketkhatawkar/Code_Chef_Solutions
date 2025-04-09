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
		    int count=0;
		    boolean flag= false;
		    
		    for(int i=0; i<n; i++){
		        int temp=input.nextInt();
		        if(temp%2==1){
		            count++;
		        }
		        if(temp==1){
		            flag=true;
		        }
		    }
		    
		    if(flag){
		        System.out.println("CHEF");
		    }
		    else if(count%2==0){
		        System.out.println("CHEFINA");
		    }
		    else {
		        System.out.println("CHEF");
		    }
		}
	}
}
