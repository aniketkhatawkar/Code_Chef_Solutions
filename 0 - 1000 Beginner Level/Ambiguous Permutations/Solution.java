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
		
		while(true) {
		    
		    int n = input.nextInt();
		    if (n == 0) {
		        break;
		    }
		    int[] a = new int[n];
		    
		    for(int i=0; i<n; i++){
		        a[i] = input.nextInt();
		    }
		    
		    int[] b = new int[n];
		    
		    for(int i=0; i<n; i++){
		        b[a[i]-1] = i+1;
		    }
		    
		    if(Arrays.equals(a, b)){
		        System.out.println("ambiguous");
		    }
		    else{
		        System.out.println("not ambiguous");
		    }
		}
	}
}
