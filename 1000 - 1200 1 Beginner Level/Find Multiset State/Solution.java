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
		    int k = input.nextInt();
		    
		    ArrayList<Integer> arr = new ArrayList<>();
		    
		    for(int i=0; i<n; i++){
		        arr.add(input.nextInt());
		    }
		    
		    for(int i=0; i<k; i++){
		        int maximun=arr.get(arr.size() - 1);
		        int minimum=arr.get(0);
		        
		        arr.remove(0);
		        arr.remove(arr.size() - 1);
		        
		        arr.add(minimum+maximun);
		    }
		    
		    for(int i=0; i<n-k; i++){
		        System.out.print(arr.get(i)+" ");
		    }
		    
		    System.out.println("");
		}
	}
}
