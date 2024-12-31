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
		
		int t = input.nextInt();
		for(int i=0; i<t; i++){
		    int n = input.nextInt();
		    int[] a = new int[n];
		    for(int j=0; j<n; j++){
		        a[j] =input.nextInt();
		    }
		    int count = 0;
		    for(int k=0; k<n; k++){
		        int sum = 0;
		        int product = 1;
		        for(int j=k; j<n; j++){
		            sum = sum + a[j];
		            product = product * a[j];
		            if(sum == product){
		                count = count + 1;
		            }
		        }
		    }
		    System.out.println(count);
		    
		}
	}
}
