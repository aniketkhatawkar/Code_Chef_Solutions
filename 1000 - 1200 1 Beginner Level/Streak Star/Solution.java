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
            int a[] = new int[n]; 
            
            for (int i=0;i<n;i++) {
                a[i] = input.nextInt();
            }
            int max = 1;
            for (int i = 0; i < n; i++) {
                int val = a[i];
                a[i] = a[i]*x;
                int len = 1;
                for (int j = 0; j < n - 1; j++) {
                    if(a[j]<=a[j+1]){
                        len++;
                        max = Math.max(max, len);
                    }
                    else{
                        len = 1;
                    }
                }
                a[i] = val;
            }
            System.out.println(max);
		}
	}
}
