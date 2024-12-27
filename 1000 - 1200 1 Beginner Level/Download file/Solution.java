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
		    int k = input.nextInt();
		    
		    int time=0;
		    int data=0;
		    
		    for(int i=0; i<n;i++){
		        int temp1=input.nextInt();
		        int temp2=input.nextInt();
		        
		        if(time<k){
		            if((time+temp1)>k){
		                int extr=(temp1+time)-k;
		                data+=extr*temp2;
		            }
		            time+=temp1;
		        }
		        else {
		            data+=temp1*temp2;
		        }
		    }
		    
		    System.out.println(data);
		}
	}
}
