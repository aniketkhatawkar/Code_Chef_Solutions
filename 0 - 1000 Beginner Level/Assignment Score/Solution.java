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
		    int arr[] = new int [n];
		    
		    int scoresum=0;
		    
		    for(int i=0; i<n; i++){
		        scoresum+=input.nextInt();
		    }
		    
		    if(scoresum+100<(n+1)*50){
		        System.out.println(-1);
		    }
		    else if(((n+1)*50)<=scoresum){
		        System.out.println(0);
		    }
		    else {
		        System.out.println(((n+1)*50)-scoresum);
		    }
		}
	}
}
