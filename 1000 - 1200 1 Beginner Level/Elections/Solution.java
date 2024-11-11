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
		    
		    int votesa[]=new int[n];
		    int votesb[]=new int[n];
		    
		    int need[]= new int[n];
		    
		    for(int i=0; i<n; i++){
		        votesa[i]=input.nextInt();
		    }
		    
		    for(int i=0; i<n; i++){
		        votesb[i]=input.nextInt();
		    }
		    
		    for(int i=0; i<n; i++){
		        if(votesb[i]>=votesa[i]){
		            need[i]=(votesb[i]-votesa[i])+1;
		        }
		        else {
		            need[i]=0;
		        }
		    }
		    
		    int count=0;
		    int index=0;
		    
		    Arrays.sort(need);
		    
		    while(x>0 && index<n){
		        if(need[index]<=x){
		            x-=need[index];
		            count++;
		        }
		        index++;
		    }
		    
		    if(count>(n/2)){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
