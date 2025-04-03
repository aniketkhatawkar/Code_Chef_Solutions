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
		
		int n = input.nextInt();
	    int[] arr = new int[n];
	    int sum = 0;
	    
	    for(int i = 0; i < n; i++){
	        arr[i] = input.nextInt();
	        sum+= arr[i];
	    }
	    
	    int m =0;
	    while(n!= 0){
	        m+=n;
	        n--;
	    }
	    
	    if(sum == m){
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}
}
