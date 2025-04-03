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
		    int l[] = new int[n];
		    int r[] = new int[n];
		    int value[] = new int[n];
		   
		    for(int i=0; i<n; i++){
		        l[i]=input.nextInt();
		    }
		    
		    for(int i=0; i<n; i++){
		        r[i]=input.nextInt();
		        value[i]=l[i]*r[i];
		    }
		    
		    int ans=0;
		    
		    for (int i=1; i<n; i++)
		        if(value[i]>value[ans]||(value[i]==value[ans]&&r[i]>r[ans]))
		            ans=i;
		            
		    System.out.println(ans+1);
		}
	}
}
