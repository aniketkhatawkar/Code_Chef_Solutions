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
		    int arr[] = new int[n];
		    
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    int maxi=0, count=0;
		    
		    for(int i=0; i<n; i++){
		        arr[i]= input.nextInt();
		    }
		    
		    for(int i=0; i<n; i++){
		        for(int j=i+1; j<n; j++){
		            map.put(arr[i]+arr[j], map.getOrDefault(arr[i]+arr[j],0)+1);
		            maxi=Math.max(maxi, arr[i]+arr[j]);
		            count++;
		        }
		    }
		    
		    System.out.printf("%.8f\n",((double)map.get(maxi)/(double)count));
		}
	}
}
