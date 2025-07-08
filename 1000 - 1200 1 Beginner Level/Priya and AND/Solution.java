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
		    
            int[] arr = new int[n];
            
            for(int j = 0; j<n; j++){
                arr[j] = input.nextInt();
            }
            
            int count = 0;
            
            for(int j = 0; j<n; j++){
                for(int k = j+1; k<n; k++){
                    int x = arr[j]&arr[k];
                    
                    if(x == arr[j]){
                        count++;
                    }
                }
            }
            
            System.out.println(count);
		}
	}
}
