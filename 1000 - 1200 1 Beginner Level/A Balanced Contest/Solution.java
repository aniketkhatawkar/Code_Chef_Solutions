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
	        int p = input.nextInt();
	        int arr[] = new int [n];
	        
	        for(int i=0 ; i<n ;i++){
	            arr[i] = input.nextInt();
	        }
	        
	        int cakewalk = 0;
	        int difficult = 0;
	        
	        
	        for(int i=0; i<n ;i++){
	            if(arr[i] <= (p/10) ){
	                difficult ++;
	            }
	            else if(arr[i] >=(p/2)){
	                cakewalk++;
	            }
	        }
	        
	        if(difficult ==2 && cakewalk == 1){
	            System.out.println("yes");
	        }
	        else{
	            System.out.println("no");
	        }
		}
	}
}
