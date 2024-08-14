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
		    int x = input.nextInt();
		    int c = input.nextInt();
		    
		    int pay=0;
		    int total=0;
		    
		    for(int i=0; i<n; i++){
		        int bag = input.nextInt();
		        
		        if((x-bag)>c){
		            pay+=c;
		            bag=x;
		        }
		        
		        total+=bag;
		    }
		    
		    System.out.println(total-pay);
		}
	}
}
